package io.xventure.xventuretest.Services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public int getAddition(int num1,int num2){
        return num1+num2;
    }
}
