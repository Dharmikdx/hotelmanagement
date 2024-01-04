package Initial;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class SignUp {
    private String firstName, phoneNumber, emailId, address;

    public SignUp(String firstName, String phoneNumber, String emailId, String address) throws IOException {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

/*
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
            }*/
        }



