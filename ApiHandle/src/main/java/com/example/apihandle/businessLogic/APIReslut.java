package com.example.apihandle.businessLogic;

import com.example.apihandle.models.View;

public class APIReslut {

    private API_JSONConverter[] apiJsonConverter;
    private final View view = View.TYPE1;

    public APIReslut(API_JSONConverter[] apiJsonConverter) {
        this.apiJsonConverter = apiJsonConverter;
    }

    public API_JSONConverter[] getApiJsonConverter() {
        return apiJsonConverter;
    }

    public void setApiJsonConverter(API_JSONConverter[] apiJsonConverter) {
        this.apiJsonConverter = apiJsonConverter;
    }

    public View getView() {
        return view;
    }



    @Override
    public String toString(){
        return apiJsonConverter.toString();
    }

}
