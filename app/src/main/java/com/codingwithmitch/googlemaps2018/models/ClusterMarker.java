package com.codingwithmitch.googlemaps2018.models;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class ClusterMarker implements ClusterItem {
    private LatLng position;
    private String title;
    private String snippet;
    private int icoPicture;
    private User user;

    public ClusterMarker(LatLng position, String title, String snippet, int icoPicture, User user) {
        this.position = position;
        this.title = title;
        this.snippet = snippet;
        this.icoPicture = icoPicture;
        this.user = user;
    }
    public ClusterMarker(){

    }

    @Override
    public LatLng getPosition() {
        return position;
    }

    public void setPosition(LatLng position) {
        this.position = position;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public int getIcoPicture() {
        return icoPicture;
    }

    public void setIcoPicture(int icoPicture) {
        this.icoPicture = icoPicture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
