package io.xventure.xventuretest.controlles;

import io.xventure.xventuretest.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello-world")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/addition/{num1}/{num2}")
    public int getAddition(@PathVariable int num1,@PathVariable int num2){
        return helloWorldService.getAddition(num1, num2);
    }
}
