package com.example.gmailapplication;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;

public class UserInformation {
    private boolean avt;
    private String userName;
    private String title;
    private String content;
    private boolean isFavorite;
    private Date time;

    public UserInformation(String userName, String title, String content) {
        this.userName = userName;
        this.title = title;
        this.content = content;
        this.isFavorite=false;
        long millis=System.currentTimeMillis();
        this.avt=false;
        this.time=new java.sql.Date(millis);
    }

    public boolean isAvt() {
        return avt;
    }

    public void setAvt(boolean avt) {
        this.avt = avt;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
