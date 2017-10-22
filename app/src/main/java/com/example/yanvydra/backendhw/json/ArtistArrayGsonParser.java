package com.example.yanvydra.backendhw.json;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;




/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistArrayGsonParser implements IArtistArrayParser {

    private final InputStream mIntputStream;

    public ArtistArrayGsonParser(InputStream pIntputStream) {
        this.mIntputStream = pIntputStream;
    }

    @Override
    public IArtistArray parse() throws Exception {
        Reader reader = new InputStreamReader(mIntputStream);
        ArtistGson[] result = new Gson().fromJson(reader, ArtistGson[].class);
        return new ArtistArrayGson(Arrays.asList(result));
    }
}
