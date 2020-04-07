package com.example.apihandle.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInput {

    private String input;
    private final Type type = Type.TAG;



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
        return getInput();
    }
}
