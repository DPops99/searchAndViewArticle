package com.example.apihandle.businessLogic;

import com.example.apihandle.models.View;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class API_JSONConverter {

    @JsonProperty("title")
    private String firstParameter;
    @JsonProperty("url")
    private String secondParameter;



    public String getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(String firstParameter) {
        this.firstParameter = firstParameter;
    }

    public String getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(String secondParameter) {
        this.secondParameter = secondParameter;
    }

    @Override
    public String toString(){
        return "articleName: "+getFirstParameter()+
                "\nlink: "+getSecondParameter();
    }
}
