package io.xventure.xventuretest.controlles;

import io.xventure.xventuretest.Services.ChannelingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/channeling")
public class ChannelController {

    @Autowired
    private ChannelingService channelingService;
    @PostMapping(value = "/addchannel")
    public void addChanneling(){

    }

}
