package com.example.android.quakereport;

/**
 * Created by Aml on 2017-12-25.
 */

public class Earthquake {
    /** Magnitude of the earthquake */
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double magnitude, String Location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = Location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude()
    {
        return mMagnitude;
    }
    public String getLocation()
    {
        return mLocation;
    }

    public long getTimeInMilliseconds()
    {
        return mTimeInMilliseconds;
    }
    public String getUrl()
    {
        return mUrl;
    }
}
