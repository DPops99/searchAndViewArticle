package com.example.apihandle.service;

import com.example.apihandle.businessLogic.APIReslut;
import com.example.apihandle.businessLogic.FeedElement;
import com.example.apihandle.businessLogic.FeedSearch;
import com.example.apihandle.models.UserInput;

public class FeedService {

    public FeedElement initFeedElement(UserInput userInput){
        return new FeedElement(userInput);
    }


}
