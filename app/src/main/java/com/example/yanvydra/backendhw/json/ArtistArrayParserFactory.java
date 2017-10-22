package com.example.yanvydra.backendhw.json;

import java.io.InputStream;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistArrayParserFactory {

    public IArtistArrayParser createParser(InputStream pSource) throws Exception {
        return new ArtistArrayGsonParser(pSource);
    }

    public IArtistArrayParser createParserForResponceWithObject(InputStream pSource) {
        return new ArtistArrayGsonParserObject(pSource);
    }
}
