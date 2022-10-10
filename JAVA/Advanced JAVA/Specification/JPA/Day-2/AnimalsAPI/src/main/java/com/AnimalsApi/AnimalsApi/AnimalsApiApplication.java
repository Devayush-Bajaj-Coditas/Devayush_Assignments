package com.AnimalsApi.AnimalsApi;

import com.AnimalsApi.AnimalsApi.dao.AnimalDao;

import com.AnimalsApi.AnimalsApi.dao.AnimalDaoImplementation;
import com.AnimalsApi.AnimalsApi.dao.ZooDaoImplementation;
import com.AnimalsApi.AnimalsApi.model.Animal;
import com.AnimalsApi.AnimalsApi.model.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AnimalsApiApplication {

	public static void main(String[] args) {
		AnimalDaoImplementation animalDaoImplementation = new AnimalDaoImplementation();
		ZooDaoImplementation zooDaoImplementation = new ZooDaoImplementation();
		List <Animal> animals = new ArrayList<>();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager manager = entityManagerFactory.createEntityManager();
		manager.getTransaction().begin();
		Animal animal = new Animal(12,1,"Sea Animal", "Fish");
		Animal animal2 = new Animal(2,2,"Ground Animal","Cat");
		Animal animal3 = new Animal(6,3,"Flying Animal","Flamingo");


		animals.add(animal);
		animals.add(animal2);
		animals.add(animal3);

		Zoo kanhaNationalZoo = new Zoo(1,"Kanha National Zoo",animals);

//		animalDaoImplementation.saveAnimal(animal);
//		animalDaoImplementation.saveAnimal(animal2);
//		animalDaoImplementation.saveAnimal(animal3);

		zooDaoImplementation.saveZoo(kanhaNationalZoo);
		manager.persist(kanhaNationalZoo);
		manager.getTransaction().commit();
	}

}
