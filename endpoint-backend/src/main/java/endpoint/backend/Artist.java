package endpoint.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;



@Entity
public class Artist {

    @Id
     Long id;
     String name;
     String song;


    public Artist() {
    }

    public Artist(Long pId   , String pName, String pSong) {
        id = pId;
        name = pName;
        song = pSong;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }
    /*public void setId() {
        this.id=id;
    }

    public void setName() {
        this.name=name;
    }

    public void setSong() {
        this.song=song;
    }*/
}