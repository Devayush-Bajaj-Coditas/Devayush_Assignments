package com.Devayush.ZooAPI;

import com.Devayush.ZooAPI.model.Animal;
import com.Devayush.ZooAPI.model.Zoo;
import com.Devayush.ZooAPI.repository.ZooRepository;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@SpringBootApplication
public class ZooApiApplication {

	@Autowired
	EntityManager entityManager;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context = SpringApplication.run(ZooApiApplication.class,args);
		ZooRepository zooRepository = context.getBean(ZooRepository.class);

		//Animal animal = new Animal();
		Zoo zoo = new Zoo();
		List<Animal> animals = new ArrayList<Animal>();
		
		int choicee = 0;
		do{
			System.out.println("1 --> new data\n2 --> Update\n3 --> Delete \n4 --> Show all\n5 --> Find By ID \n0 --> Exit ");
			choicee = Integer.parseInt(bufferedReader.readLine());
			switch (choicee){
				case 1:
					System.out.print("Enter Zoo name --> ");
					String zooName = bufferedReader.readLine();
					zoo.setZooName(zooName);
					
					int animalChoice;
					do {
						System.out.println("Enter Animal details\nanimal age");
						int animalAge = Integer.parseInt(bufferedReader.readLine());
						System.out.print("animal type ");
						String animalType = bufferedReader.readLine();
						System.out.print("species name ");
						String speciesName = bufferedReader.readLine();
						
						Animal animal = new Animal( animalAge, animalType, speciesName);
						animals.add(animal);
						System.out.println("Do you want to add more animals\n 1--> yes 2--> No ");
						animalChoice = Integer.parseInt(bufferedReader.readLine());
						
					}while (animalChoice != 2);
					zoo.setAnimalsPresent(animals);

					Zoo testZoo = zooRepository.save(zoo);
					System.out.println("Your registration has done successfully");
					System.out.println(testZoo);
					break;

				case 2:
					//Update animal by its id
					System.out.println("Enter id of Zoo==> ");
					int zooId = Integer.parseInt(bufferedReader.readLine());
					try {
						Optional<Zoo> optionalZoo = zooRepository.findById(zooId);		//finding object by its id
						Zoo zooUpdate = optionalZoo.get();		//Getting all the details in pojo

						System.out.println("Enter new zoo name");
						String newZooName = bufferedReader.readLine();
						zooUpdate.setZooName(newZooName);
						Zoo zooResult = zooRepository.save(zooUpdate);
						System.out.println(zooResult);
						System.out.println("Updated successfully");

					}catch (NoSuchElementException elementException){
						System.out.println("No data found with the given id please try again");
					}
					break;

				case 3:
					System.out.println("Enter the id you want to delete");
					int deleteZooId = Integer.parseInt(bufferedReader.readLine());
					try{
						zooRepository.deleteById(deleteZooId);
						System.out.println("Deleted successfully");

					}catch(NoSuchElementException noSuchElementException){
						System.out.println("Id not found");
					}
					break;
				case 4:

				Iterable <Zoo> iterable = zooRepository.findAll();
					Iterator <Zoo> iterator = iterable.iterator();
					while(iterator.hasNext()){
						Zoo zooDisplayAll = iterator.next();
						System.out.println(zooDisplayAll);
					}
					break;

				case 5:
					System.out.println("Enter zoo ID :" );
					int zooFindId = Integer.parseInt(bufferedReader.readLine());
					try {
						Optional<Zoo> zooOptional = zooRepository.findById(zooFindId);
						Zoo zooFind = zooOptional.get();
						System.out.println(zooFind);
					}catch (NoSuchElementException noSuchElementException){
						System.out.println("Invalid Id. Please try again");
					}
					break;
				case 6:
					System.out.println("Enter the age you want to filter the animals");
					int age = Integer.parseInt(bufferedReader.readLine());
					Criteria criteria =
			}
		}
		while (choicee != 0);
	}

}
