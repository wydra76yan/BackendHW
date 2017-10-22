package com.example.yanvydra.backendhw.http;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class HttpClient implements IHttpClient {

    @Override
    public void request(String url, ResponseListener listener) {
        try {
            HttpURLConnection con = (HttpURLConnection) (new URL(url)).openConnection();
            InputStream is = con.getInputStream();
            listener.onResponse(is);
            con.disconnect();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public interface ResponseListener {
        void onResponse(InputStream inputStream);
    }
}
