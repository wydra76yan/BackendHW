package com.example.yanvydra.backendhw.json;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistArrayGsonParserObject implements IArtistArrayParser {

    private final InputStream mIntputStream;

    public ArtistArrayGsonParserObject(InputStream pIntputStream) {
        this.mIntputStream = pIntputStream;
    }

    @Override
    public IArtistArray parse() throws Exception {
        Reader reader = new InputStreamReader(mIntputStream);
        return new Gson().fromJson(reader, ArtistArrayObjectGson.class);
    }
}
