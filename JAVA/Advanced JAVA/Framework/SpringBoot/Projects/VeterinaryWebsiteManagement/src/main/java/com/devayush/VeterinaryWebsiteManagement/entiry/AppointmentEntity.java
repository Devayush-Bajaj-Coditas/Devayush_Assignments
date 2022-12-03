package com.devayush.VeterinaryWebsiteManagement.entiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@Component
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long appointmentId;
    Date bookingDate;
    Time bookingTime;
    String problem;

    @JsonIgnore

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "animal_id")
    private AnimalEntity animalEntity;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctorEntity;

}
