package com.example.luuanhkiet;

import java.io.Serializable;

public class ContactModel implements Serializable {

    public ContactModel(String mTMH, String mMMH, String mSTC) {
        this.TMH = mTMH;
        this.MMH = mMMH;
        this.STC = mSTC;

    }


    public String getTMH() {
        return TMH;
    }

    public void setTMH(String TMH) {
        this.TMH = TMH;
    }

    public String getMMH() {
        return MMH;
    }

    public void setMMH(String MMH) {
        this.MMH = MMH;
    }

    public String getSTC() {
        return STC;
    }

    public void setSTC(String STC) {
        this.STC = STC;
    }

    private String TMH;
    private String MMH;
    private String STC;
}
