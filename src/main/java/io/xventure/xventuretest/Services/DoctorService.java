package io.xventure.xventuretest.Services;

import io.xventure.xventuretest.controlles.DTO.DoctorDTO;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class DoctorService {

    private LinkedList<DoctorDTO> dtos=new LinkedList<>();

    public void addDoctor(DoctorDTO dto){
        dtos.add(dto);
    }

    public DoctorDTO getDoctorById(int id){
        DoctorDTO dtoD=null;
        for (DoctorDTO dto : dtos) {
            if(dto.getDoctorId()==id){
                dtoD=dto;
            }
        }
        return dtoD;
    }

    public LinkedList<DoctorDTO> getAllDoctors(){
        return dtos;
    }

    public void updateDoctor(DoctorDTO dto){
        DoctorDTO dtoD=null;
        for (DoctorDTO onedto : dtos) {
            if(dto.getDoctorId()== onedto.getDoctorId()){
                dtoD=onedto;
                dtos.remove(onedto);
            }
        }
        if(dto.getDoctorName()!=null && dto.getDoctorName()!=""){
            dtoD.setDoctorName(dto.getDoctorName());
        }
        if(dto.getAddress()!=null && dto.getAddress()!=""){
            dtoD.setAddress(dto.getAddress());
        }
        dtos.add(dtoD);
    }

    public void deleteDoctor(int id){
        for (DoctorDTO onedto : dtos) {
            if(onedto.getDoctorId()== id){
                dtos.remove(onedto);
            }
        }
    }
}
