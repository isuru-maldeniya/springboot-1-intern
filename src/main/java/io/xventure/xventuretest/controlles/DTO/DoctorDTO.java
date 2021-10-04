package io.xventure.xventuretest.controlles.DTO;

public class DoctorDTO {
    private int doctorId;
    private String doctorName;
    private String specialisation;
    private String address;

    public DoctorDTO(int doctorId, String doctorName, String specialisation, String address) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialisation = specialisation;
        this.address = address;
    }

    public DoctorDTO() {
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
