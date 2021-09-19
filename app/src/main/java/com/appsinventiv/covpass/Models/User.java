package com.appsinventiv.covpass.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {
    String firstname,lastname,dobday,dobmonth,dobyear,firstinjday,firstinjmonth,firstinjyear,secondinjday,secondinjmonth,secondinjyear;

    public User(String firstname, String lastname, String dobday, String dobmonth, String dobyear, String firstinjday, String firstinjmonth,
                String firstinjyear, String secondinjday, String secondinjmonth, String secondinjyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dobday = dobday;
        this.dobmonth = dobmonth;
        this.dobyear = dobyear;
        this.firstinjday = firstinjday;
        this.firstinjmonth = firstinjmonth;
        this.firstinjyear = firstinjyear;
        this.secondinjday = secondinjday;
        this.secondinjmonth = secondinjmonth;
        this.secondinjyear = secondinjyear;
    }

    public User() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDobday() {
        return dobday;
    }

    public void setDobday(String dobday) {
        this.dobday = dobday;
    }

    public String getDobmonth() {
        return dobmonth;
    }

    public void setDobmonth(String dobmonth) {
        this.dobmonth = dobmonth;
    }

    public String getDobyear() {
        return dobyear;
    }

    public void setDobyear(String dobyear) {
        this.dobyear = dobyear;
    }

    public String getFirstinjday() {
        return firstinjday;
    }

    public void setFirstinjday(String firstinjday) {
        this.firstinjday = firstinjday;
    }

    public String getFirstinjmonth() {
        return firstinjmonth;
    }

    public void setFirstinjmonth(String firstinjmonth) {
        this.firstinjmonth = firstinjmonth;
    }

    public String getFirstinjyear() {
        return firstinjyear;
    }

    public void setFirstinjyear(String firstinjyear) {
        this.firstinjyear = firstinjyear;
    }

    public String getSecondinjday() {
        return secondinjday;
    }

    public void setSecondinjday(String secondinjday) {
        this.secondinjday = secondinjday;
    }

    public String getSecondinjmonth() {
        return secondinjmonth;
    }

    public void setSecondinjmonth(String secondinjmonth) {
        this.secondinjmonth = secondinjmonth;
    }

    public String getSecondinjyear() {
        return secondinjyear;
    }

    public void setSecondinjyear(String secondinjyear) {
        this.secondinjyear = secondinjyear;
    }
}
