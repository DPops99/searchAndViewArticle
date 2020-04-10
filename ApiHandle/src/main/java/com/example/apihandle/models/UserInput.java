package com.example.apihandle.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UserInput {

    final String devApiURL = "https://dev.to/api/articles";
    private String input;
    private final Type type = Type.TAG;


    public String getDevApiURL() {
        return devApiURL;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString(){
        return getDevApiURL()+"?"+getType().toString().toLowerCase()+"="+getInput();
    }
}
