package com.coditas.JpaCriteriaDemo;

import com.coditas.JpaCriteriaDemo.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpaCriteriaDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JpaCriteriaDemoApplication.class, args);



		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersist");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		Teacher teacher = new Teacher(1,"rehma", 12000);
		entityManager.persist(teacher);
		entityManager.getTransaction().commit();
	}

}
