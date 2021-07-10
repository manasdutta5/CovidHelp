package com.example.covidhelp;

public class Word {

    private String mName;
    private String mDescription;
    private int mImageResourceId;



    public Word(String Name,String Description){
        mName = Name;
        mDescription = Description;
    }

    /**
     * Get the Name of the volunteer.
     */

    public String getmName() {
        return mName;
    }

    /**
     * Get description of the volunteer
     */

    public String getmDescription(){
        return mDescription;
    }

    /**
     * Get the image resource ID (if needed ), right now not set
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
