package com.example.apihandle.businessLogic;

import com.example.apihandle.models.API_JSONConverter;
import org.springframework.web.client.RestTemplate;

public class APIInput {

    public APIReslut recoverArticle (FeedElement feedElement){
        //ovo je cisto da nema errora, POPRAVI dodavajuci defalut u switch
        String searchInput = null;
        switch (feedElement.getType()){
            case TAG:
                searchInput = convertToTagURL(feedElement);
                break;
        }

        API_JSONConverter[] apiJsonConverterArray = sendJSON(searchInput);

        return new APIReslut(apiJsonConverterArray);
        //return new APIReslut(apiJsonConverter);
    }

    public String convertToTagURL(FeedElement feedElement){
        //converts searchInput into a JSON to filter articles

        return feedElement.toString();
    }

    public API_JSONConverter[] sendJSON(String URL){
        //sends URL and returns JSON articles
        //https://dev.to/api/articles?tag=java example

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, API_JSONConverter[].class);
    }


}
