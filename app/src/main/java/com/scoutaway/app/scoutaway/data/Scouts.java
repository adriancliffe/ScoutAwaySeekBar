package com.scoutaway.app.scoutaway.data;

/**
 * Created by nirav on 05/10/15.
 */
public class Scouts {

    private String scoutID;
    private String scoutImage;
    private String location;
    private String status;
    private Scouts onlineScout;




    public Scouts(String scoutID, String scoutImage, String location, String status ) {

        this.scoutID = scoutID;
        this.scoutImage = scoutImage;
        this.location = location;
        this.status = status;


    }

    public Scouts(Scouts onlineScout){

        this.onlineScout = onlineScout;

    }





    public String getScoutID() {
        return scoutID;
    }

    public void setScoutID(String scoutID) {
        this.scoutID = scoutID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScoutImage() {
        return scoutImage;
    }

    public void setScoutImage(String scoutImage) {
        this.scoutImage = scoutImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Scouts getOnlineScout() {
        return onlineScout;
    }

    public void setOnlineScout(Scouts onlineScout) {
        this.onlineScout = onlineScout;
    }
}
