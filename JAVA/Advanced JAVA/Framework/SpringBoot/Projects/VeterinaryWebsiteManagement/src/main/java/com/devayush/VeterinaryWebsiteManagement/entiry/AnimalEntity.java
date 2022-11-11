package com.devayush.VeterinaryWebsiteManagement.entiry;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalId;
    private String species;
    private String petName;
    private String ownerName;
    private String password;



    @OneToMany(mappedBy = "animalEntity", cascade = CascadeType.ALL)
    private List<AppointmentEntity> appointments = new ArrayList<>();


}
