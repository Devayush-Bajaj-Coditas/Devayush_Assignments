package com.devayush.inventoryservice;

import com.devayush.inventoryservice.entity.InventoryEntity;
import com.devayush.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData (InventoryRepository inventoryRepository) {
		return args -> {
			InventoryEntity inventoryEntity = new InventoryEntity();
			inventoryEntity.setSkuCode("S22 ultra");
			inventoryEntity.setQuantity(100);
			inventoryRepository.save(inventoryEntity);

			InventoryEntity inventoryEntity2 = new InventoryEntity();
			inventoryEntity.setSkuCode("S22 ultra black");
			inventoryEntity.setQuantity(0);
			inventoryRepository.save(inventoryEntity2);
		};
	}
}
