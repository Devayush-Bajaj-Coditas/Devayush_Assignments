package com.devayush.VeterinaryWebsiteManagement.entiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long doctorId;
    private String doctorName;
    private long doctorNumber;
    private float doctorFees;
    private Time availableFrom;
    private Time availableUpto;
    String doctorCategory;
    String password;

    @JsonIgnore
    @OneToMany(mappedBy = "doctorEntity", cascade = CascadeType.ALL)
    private List<AppointmentEntity> appointments = new ArrayList<>();


    @JsonIgnore
    @ManyToMany(mappedBy = "doctorEntities", cascade = CascadeType.PERSIST)
    private List<AnimalEntity> animalEntities = new ArrayList<>();

}
