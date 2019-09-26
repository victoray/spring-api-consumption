package com.odinson.springapiconsumption.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class All {

    String[] all;

    public String[] getAll() {
        return all;
    }

    public void setAll(String[] all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "All{" +
                "all='" + all + '\'' +
                '}';
    }
}
