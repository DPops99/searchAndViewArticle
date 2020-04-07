package com.example.apihandle.controllers;



import com.example.apihandle.businessLogic.APIReslut;
import com.example.apihandle.businessLogic.FeedElement;
import com.example.apihandle.businessLogic.FeedSearch;
import com.example.apihandle.models.UserInput;
import com.example.apihandle.service.FeedService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {


    private FeedService feedService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("userinput", new UserInput());
        return "homepage.html";
    }

    @PostMapping("/")
    public String inputSubmit(@ModelAttribute UserInput userInput, Model model){

        FeedElement feedElement = new FeedElement(userInput);
        FeedSearch feedSearch = new FeedSearch();
        APIReslut reslut = feedSearch.searchAPI(feedElement);
        model.addAttribute("reslut", reslut);
        return "result.html";
    }

}
