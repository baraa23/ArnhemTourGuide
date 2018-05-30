package com.example.baraa.arnhemtourguide;

/**
 * {@link Place} represents a place that the user wants to discover.
 * It contains the name of the place, the address, and an image for that place.
 */
public class Place {

    /**
     * The name of the Place
     */
    private String mPlaceName;

    /**
     * The address of the Place
     */
    private String mPlaceAddress;


    /**
     * Image resource ID for the place
     */
    private int mImageResourceId;


    /**
     * Create a new Place object.
     *
     * @param placename       is the name of the place
     * @param placeaddress    is the address of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(String placename, String placeaddress, int imageResourceId) {
        mPlaceName = placename;
        mPlaceAddress = placeaddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the address of the place.
     */
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
