package io.xventure.xventuretest.controlles;

import io.xventure.xventuretest.Services.ChannelingService;
import io.xventure.xventuretest.controlles.DTO.ChannelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/channeling")
public class ChannelController {

    @Autowired
    private ChannelingService channelingService;

//    initiating new channel session for a doctorId
    @PostMapping(value = "/addchannel")
    public void addChanneling(@RequestBody ChannelDTO dto){
        channelingService.addChanneling(dto);
    }



}
