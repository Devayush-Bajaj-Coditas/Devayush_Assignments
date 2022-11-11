package com.devayush.VeterinaryWebsiteManagement.model.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;
@Data
public class AppointmentDto {
    long doctorId;
    long animalId;
    Date appointmentDate;
    Time appointmentTime;
    String problem;

}
