package com.Devayush.AnimalZooApi;

import com.Devayush.AnimalZooApi.dao.ZooDao;
import com.Devayush.AnimalZooApi.dao.ZooDaoImplementation;
import com.Devayush.AnimalZooApi.model.Animal;
import com.Devayush.AnimalZooApi.model.Zoo;
import com.Devayush.AnimalZooApi.util.HibernateUtils;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AnimalZooApiApplication {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("PERSISTENCE");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Animal animal = new Animal(13,"Ground Animal", "Lion");
		Animal animal2 = new Animal(12,"Ground Animal", "Lion");
		Animal animal3 = new Animal(3,"Ground Animal", "Lion");

		List<Animal> animals = new ArrayList<Animal>();
		animals.add(animal);
		animals.add(animal2);
		animals.add(animal3);


		Zoo zoo = new Zoo("Kanha National Park", animals);

		ZooDao zooDao = new ZooDaoImplementation();
		zooDao.addZoo(zoo);
		entityManager.persist(zoo);
		entityManager.getTransaction().commit();
	}

}
