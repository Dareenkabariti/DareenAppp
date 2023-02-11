package com.example.myapplication;

public interface Email {
    String getEmailBody();
    String getSender();
    String[] getAttachedFiles();
}
