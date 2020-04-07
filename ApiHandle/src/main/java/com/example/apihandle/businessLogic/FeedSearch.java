package com.example.apihandle.businessLogic;

public class FeedSearch {


    //it returns void for now, just unit I realise what I will do with te APIConverter[]
    public APIReslut searchAPI(FeedElement feedElement) {
        //this method uses feedElement to search articles using 3rd party API
        APIInput apiInput = new APIInput();
        return apiInput.recoverArticle(feedElement);
        //return apiInput.recoverArticle(feedElement);
    }
}
