package com.example.yanvydra.backendhw.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistArrayObjectGson implements IArtistArray {

    @SerializedName("items")
    private List<ArtistGson> mArtistArray;

    @SerializedName("backendVersion")
    private Integer backendVersion;

    @Override
    public List<ArtistGson> getArtistArray() {
        return mArtistArray;
    }

    public Integer getBackendVersion() {
        return backendVersion;
    }
}
