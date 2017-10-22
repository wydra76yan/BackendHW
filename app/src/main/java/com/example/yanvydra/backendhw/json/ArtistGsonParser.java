package com.example.yanvydra.backendhw.json;

import com.google.gson.Gson;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistGsonParser implements IArtistParser {


    private final String mSource;

    ArtistGsonParser(final String pSource) {
        mSource = pSource;
    }

    @Override
    public IArtist parse() throws Exception {
        return new Gson().fromJson(mSource, ArtistGson.class);
    }


}
