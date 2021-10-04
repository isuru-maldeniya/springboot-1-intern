package io.xventure.xventuretest.Services;

import io.xventure.xventuretest.controlles.DTO.ChannelDTO;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.stream.Stream;

@Service
public class ChannelingService {

    private LinkedList<ChannelDTO> dtos=new LinkedList<>();

//    adding logic
    public void addChanneling(ChannelDTO dto){
        dtos.add(dto);
    }

//    all return logic
    public ChannelDTO getChannel(int id ){
//        return ((LinkedList<ChannelDTO>)dtos.stream().filter(dto -> dto.getChannelId() == id)).element();
        ChannelDTO channelDTO1=null;
        for (ChannelDTO channelDTO : dtos) {
            if(channelDTO.getChannelId()==id){
                channelDTO1=channelDTO;
            }
        }
        return channelDTO1;
    }

    public LinkedList<ChannelDTO> getAllChannels() {
        return dtos;
    }

//    update logic
    public void updateChannel(ChannelDTO dto){
        ChannelDTO channelDTO1=null;
        for (ChannelDTO channelDTO : dtos) {
            if(channelDTO.getChannelId()==dto.getChannelId()){
                channelDTO1=channelDTO;
                dtos.remove(channelDTO);
            }
        }

        if(channelDTO1==null){
            return;
        }

        if(dto.getEndTime()!=null){
            channelDTO1.setEndTime(dto.getEndTime());
        }
        if(dto.getStartTime()!=null){
            channelDTO1.setStartTime(dto.getStartTime());
        }
        if(dto.getNumOfPatients()!=0){
            channelDTO1.setNumOfPatients(dto.getNumOfPatients());
        }
        if(dto.getDate()!=null){
            channelDTO1.setDate(dto.getDate());
        }
        dtos.add(channelDTO1);
    }

//    delete logic
    public void deleteChannel(int id){
        for (ChannelDTO channelDTO : dtos) {
            if(channelDTO.getChannelId()==id){
                dtos.remove(channelDTO);
            }
        }
    }


}
