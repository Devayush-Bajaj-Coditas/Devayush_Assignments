package Week_7.Day27.CRUD_Operation_for_Experiment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.BatchUpdateException;

public class ApplicationLauncher {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CrudWorking crudWorking = new CrudWorking();
        try {
            int choice;
            do {
                System.out.print("How may I help you\n" +
                        "1 --> Insert Data\n2 --> Display Data\n3 --> Update Data\n4 --> Delete record\n0 --> Exit\nEnter: ");
                choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 1:
                        crudWorking.insertData();
                        break;
                    case 2:
                        crudWorking.readData();
                        break;

                    case 3:
                        crudWorking.updateData();
                        break;

                    case 4:
                        crudWorking.deleteData();
                }
            } while (choice != 0);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
