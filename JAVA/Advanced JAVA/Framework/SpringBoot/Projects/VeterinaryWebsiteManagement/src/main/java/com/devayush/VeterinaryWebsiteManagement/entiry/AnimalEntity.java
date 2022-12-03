package com.devayush.VeterinaryWebsiteManagement.entiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


@JsonIgnore
    @OneToMany(mappedBy = "animalEntity", cascade = CascadeType.ALL)
    private List<AppointmentEntity> appointments = new ArrayList<>();


    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "animal_entity_doctor_entities",
            joinColumns = @JoinColumn(name = "animal_entity_null"),
            inverseJoinColumns = @JoinColumn(name = "doctor_entities_null"))
    private List<DoctorEntity> doctorEntities = new ArrayList<>();

}
