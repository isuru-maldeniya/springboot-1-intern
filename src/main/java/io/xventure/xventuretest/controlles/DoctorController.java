package io.xventure.xventuretest.controlles;

import io.xventure.xventuretest.Services.DoctorService;
import io.xventure.xventuretest.controlles.DTO.DoctorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void getDoctorById(@PathVariable int id){

    }
}
