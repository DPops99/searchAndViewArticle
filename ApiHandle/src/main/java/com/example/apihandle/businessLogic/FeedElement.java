package com.example.apihandle.businessLogic;

import com.example.apihandle.models.Type;
import com.example.apihandle.models.UserInput;

public class FeedElement {

    UserInput userInput;
    Type type;

    public FeedElement(UserInput userInput) {
        this.userInput = userInput;
        this.type = userInput.getType();
    }

    public UserInput getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return userInput.toString();
    }
}
