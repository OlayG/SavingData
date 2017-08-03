package com.example.admin.savingdata;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Admin on 8/3/2017.
 */

public class Person implements Parcelable {

    String fName;
    String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    protected Person(Parcel in) {
        fName = in.readString();
        lName = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fName);
        parcel.writeString(lName);
    }
}
