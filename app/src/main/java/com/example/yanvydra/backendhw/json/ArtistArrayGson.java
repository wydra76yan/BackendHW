package com.example.yanvydra.backendhw.json;

import java.util.List;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistArrayGson implements IArtistArray {

    private List<ArtistGson> mArtistArray;

    public ArtistArrayGson(List<ArtistGson> mArtistArray) {
        this.mArtistArray = mArtistArray;
    }

    @Override
    public List<ArtistGson> getArtistArray() {
        return mArtistArray;
    }
}
