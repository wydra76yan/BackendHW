package cloud_controller;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;
import java.util.List;

import endpoint.backend.artistApi.ArtistApi;
import endpoint.backend.artistApi.model.Artist;

import static com.example.yanvydra.backendhw.ArtistArrayLoader.NO_DATA;

/**
 * Created by YanVydra on 20.10.2017.
 */

public class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static ArtistApi myApiService = null;
    private Context context;

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if(myApiService == null) {  // Only do this once
            ArtistApi.Builder builder = new ArtistApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://backend-project-183518.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        context = params[0].first;
        try {
            List<Artist> artists = myApiService.list().execute().getItems();
            if (artists == null || artists.isEmpty()){
                return NO_DATA;
            }

            return artists.get(artists.size() - 1).getName();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(context, result, Toast.LENGTH_LONG).show();
    }
}
