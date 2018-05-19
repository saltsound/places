package com.example.belekas.tour;

public class Place {

    /** String resource ID for the place contact */
    private int mPlaceContactId;

    /** String resource ID for place name */
    private int mPlaceNameId;

    /** Image ID  */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** constant value to check if resource has image */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new PLace object.
     *
     * @param placeNameId place Name string
     * @param placeContactId Place contact string
     */
    public Place(int placeContactId, int placeNameId) {
        mPlaceContactId = placeContactId;
        mPlaceNameId = placeNameId;
    }

    /**
     * Create a new Word object.
     *
     * @param placeContactId place Name string
     * @param placeNameId Place contact string
     * @param imageResourceId recourse in drawable folder
     */
    public Place(int placeContactId, int placeNameId, int imageResourceId) {
        mPlaceContactId = placeContactId;
        mPlaceNameId = placeNameId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for Place contact
     */
    public int getPlaceContactId() {
        return mPlaceContactId;
    }

    /**
     * Get the string resource ID for Place name
     */
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    /**
     * Return the image resource ID of place
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

   /** checks if palace has image or not */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}