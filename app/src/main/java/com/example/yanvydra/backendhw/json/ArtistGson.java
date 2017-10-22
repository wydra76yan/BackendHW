package com.example.yanvydra.backendhw.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YanVydra on 22.10.2017.
 */

public class ArtistGson implements IArtist {

    @SerializedName("id")
    private long mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("song")
    private String mSong;



    @Override
    public long getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getSong() {
        return mSong;
    }


}
