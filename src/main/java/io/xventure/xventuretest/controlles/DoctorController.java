package io.xventure.xventuretest.controlles;

import io.xventure.xventuretest.Services.DoctorService;
import io.xventure.xventuretest.controlles.DTO.DoctorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping(value = "/adddoctor")
    public void addDoctor(@RequestBody DoctorDTO dto){
        doctorService.addDoctor(dto);
    }

    @GetMapping(value = "/getdoctor/{id}")
    public DoctorDTO getDoctorById(@PathVariable int id){
        return doctorService.getDoctorById(id);
    }

    @GetMapping(value = "/getalldoctors")
    public LinkedList<DoctorDTO> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PutMapping(value = "/upadatedoctor")
    public void updateDoctor(@RequestBody DoctorDTO dto){
        doctorService.updateDoctor(dto);
    }

    @DeleteMapping(value = "/deletedoctor/{id}")
    public void deleteDoctor(@PathVariable int id){
        doctorService.deleteDoctor(id);
    }

}
