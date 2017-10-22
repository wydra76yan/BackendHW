package com.example.yanvydra.backendhw;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.yanvydra.backendhw.http.HttpClient;
import com.example.yanvydra.backendhw.http.IHttpClient;
import com.example.yanvydra.backendhw.json.ArtistArrayParserFactory;
import com.example.yanvydra.backendhw.json.ArtistGson;
import com.example.yanvydra.backendhw.json.IArtistArray;

import java.io.InputStream;
import java.util.List;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistArrayLoader extends AsyncTask<Context, Void, String> {

    public static final String NO_DATA = "No data";
    private IArtistArray artistArrayWithObject;
    private Context context;

    @Override
    protected String doInBackground(Context... params) {

        final ArtistArrayParserFactory artistArrayParserFactory = new ArtistArrayParserFactory();
        IHttpClient httpClient = new HttpClient();

       artistArrayWithObject = null;

        httpClient.request(Api.USER_URL, new HttpClient.ResponseListener() {
            @Override
            public void onResponse(InputStream inputStream) {
                try {
                    artistArrayWithObject = artistArrayParserFactory.createParserForResponceWithObject(inputStream).parse();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        context = params[0];


        if (artistArrayWithObject == null) {
            return NO_DATA;
        }

        List<ArtistGson> artistArray = artistArrayWithObject.getArtistArray();

        if (artistArray == null || artistArray.isEmpty()) {
            return NO_DATA;
        }
        return artistArray.get(artistArray.size() -1).getName();
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }


}
