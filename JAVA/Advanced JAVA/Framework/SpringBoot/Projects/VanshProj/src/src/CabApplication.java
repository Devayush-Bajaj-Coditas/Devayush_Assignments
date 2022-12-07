package src;

import src.dao.DriverDao;
import src.dao.DriverDaoImpl;
import src.entity.CabDriverEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CabApplication {
    public static void main(String[] args) throws IOException {
        int choice;
        DriverDao driverDao = new DriverDaoImpl();
        while (true) {
            System.out.println("***************************************");
            System.out.println("0. Exit");
            System.out.println("1. Register Driver");
            System.out.println("2. Search Driver");
            System.out.println("***************************************");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 0:
                    System.exit(0);

                case 1:
                    CabDriverEntity cabDriver = new CabDriverEntity();
                    System.out.println("Enter Location Id");
                    cabDriver.setLocationId(Integer.parseInt(bufferedReader.readLine()));
                    System.out.println("Enter vehicle Number");
                    cabDriver.setVehicleNo(bufferedReader.readLine());
                    System.out.println("Enter vehicleCategory");
                    cabDriver.setVehicleCategory(bufferedReader.readLine());
                    System.out.println("Enter Contact Number");
                    cabDriver.setDriverContactNumber(Long.parseLong(bufferedReader.readLine()));
                    System.out.println("Available Status");
                    cabDriver.setVehicleStatus(bufferedReader.readLine());
                    String registerStatus = driverDao.registerDriver(cabDriver);
                    System.out.println("***************************************");
                    System.out.println(registerStatus);
                    System.out.println("***************************************");
                    break;

                case 2:
                    System.out.println("Enter your location Id");
                    int locationId = Integer.parseInt(bufferedReader.readLine());
                    List<CabDriverEntity> availableCabs = driverDao.searchDriver(locationId);
                    System.out.println("***********************Available Cabs********************");
                    availableCabs.stream().filter(cab -> cab != null).forEach(System.out::println);
                    System.out.println("*********************************************************");
                    break;

                default:
                    System.out.println("Invalid Choice Try Again!!");
            }
        }
    }
}