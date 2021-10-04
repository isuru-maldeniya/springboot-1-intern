package io.xventure.xventuretest.controlles;

import io.xventure.xventuretest.Services.ChannelingService;
import io.xventure.xventuretest.controlles.DTO.ChannelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

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

//    listing all channels
    @GetMapping(value = "/getAll")
    public LinkedList<ChannelDTO> getAllChannels(){
        return channelingService.getAllChannels();
    }

//    delete by Ids
    @DeleteMapping(value = "/deletechannel/{id}")
    public void deleteChannel(@PathVariable int id){
        channelingService.deleteChannel(id);
    }

//    update channel
    @PutMapping(value = "/updatechannel")
    public void updateChannel(@RequestBody ChannelDTO dto){
        channelingService.updateChannel(dto);
    }

    @GetMapping(value = "/getbyid/{id}")
    public ChannelDTO getCHannelById(@PathVariable int id){
        return channelingService.getChannel(id);
    }

}
