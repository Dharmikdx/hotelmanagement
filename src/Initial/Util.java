package Initial;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Util {
    public void signUpScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter your email ID: ");
        String emailId = scanner.next();
        //

        System.out.print("Enter your address: ");
        scanner.nextLine(); // Consume the newline character
        String address = scanner.nextLine();

        // Generate a random number to use in the filename
        int randomNum = new Random().nextInt(1234);

        // Create a folder (if not exists)
        Path folderPath = Paths.get("UserAccounts");
        try{
            Files.createDirectories(folderPath);
        } catch(
                IOException e){
            e.printStackTrace();
            return;
        }
        // Create the JSON file
        String fileName = "ACC_" + randomNum + ".json";
        Path filePath = folderPath.resolve(fileName);

        // Write user details to the JSON file
        JSONObject jsonAccount = new JSONObject();
        jsonAccount.put("FirstName", firstName);
        jsonAccount.put("PhoneNumber", phoneNumber);
        jsonAccount.put("EmailId", emailId);
        jsonAccount.put("Address", address);

        try (FileWriter fileWriter = new FileWriter(filePath.toString())) {
            fileWriter.write(jsonAccount.toString(2)); // Indent with 2 spaces for better readability
            System.out.println("Account created successfully. Details saved in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void reservation(){

    }
    public void generateBill(){

    }
}
