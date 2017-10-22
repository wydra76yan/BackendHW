package com.example.yanvydra.backendhw.http;

/**
 * Created by YanVydra on 22.10.2017.
 */

public interface IHttpClient {

    void request(String url, HttpClient.ResponseListener listener);

}
