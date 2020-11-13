package com.w32.tp2mobile.model;

import android.os.Parcel;
import android.os.Parcelable;

public class SensorValue implements Parcelable {
    // Valeur sur l'axe de X
    long timeStamp;

    // Valeur sur l'axe de Y
    double value;

    public SensorValue(long timestamp,
                       double value)
    {
        this.value= value;
        this.timeStamp = timestamp;
    }

    protected SensorValue(Parcel in) {
        timeStamp = in.readLong();
        value = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(timeStamp);
        dest.writeDouble(value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SensorValue> CREATOR = new Creator<SensorValue>() {
        @Override
        public SensorValue createFromParcel(Parcel in) {
            return new SensorValue(in);
        }

        @Override
        public SensorValue[] newArray(int size) {
            return new SensorValue[size];
        }
    };

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public double getValue()
    {
        return value;
    }
}
