package com.example.administrator.mgoadmin1;

/**
 * Created by Administrator on 14-04-2017.
 */

public class Artifact {


    public String name;
    public String qrcode;
    public String date_installed;
    public String authority_name;
    public String no_vice;
    public String medium;
    public String expert;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Artifact() {
    }

    public Artifact( String name, String qrcode,String date_installed,String authority_name,String no_vice,String medium,String expert) {
        this.name = name;
        this.qrcode = qrcode;
        this.date_installed = date_installed;
        this.authority_name = authority_name;
        this.no_vice = no_vice;
        this.medium = medium;
        this.expert = expert;


    }

    /*public getQR(){

        return this.qrcode;
    }*/

}
