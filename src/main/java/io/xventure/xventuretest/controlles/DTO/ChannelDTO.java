package io.xventure.xventuretest.controlles.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ChannelDTO {
    private int channelId;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String doctorId;
    private int numOfPatients;

    public ChannelDTO() {
    }

    public ChannelDTO(int channelId, LocalDate date, LocalTime startTime, LocalTime endTime, String doctorId, int numOfPatients) {
        this.channelId = channelId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.doctorId = doctorId;
        this.numOfPatients = numOfPatients;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }
}
