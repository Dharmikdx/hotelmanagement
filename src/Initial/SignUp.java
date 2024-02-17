package Initial;
import Custom.JsonObject;

import java.io.File;
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

    //generateRandomNumber() generate random numbers and return ;
    public long generateRandomNumber(){
        return 1000+new Random().nextInt(10000);
    }

    //writeJsonToFile()create Json file and save in the folder
    public void writeJsonToFile(JsonObject jsonobject, String filename, String folderPath){
        try(FileWriter fileWriter=new FileWriter(folderPath+"\\"+filename)){
            fileWriter.write(jsonobject.toString());
            System.out.println("JSON file '" + filename + "  created successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    //WriteInfo() function will create a folder and write the given data in a file and save the file in the folder.
    public void WriteInfo(){
        ///in folder path put your path where you want to create your folder
        String folderPath = "/Users/dharmikkumarsavani/Java_Project/Hotelmanagement/UserAccounts/";
        File folder=new File(folderPath);
        if(!folder.exists()){
            boolean create=folder.mkdir();
            String result= (create) ? "Folder created successfully." :"Failed to create the folder.";
            System.out.println(result);

        }
        else {
            System.out.println("The folder already exists.");
        }

        //generateRandomNumber() method will return rendom number.
        long randomNumber=generateRandomNumber();
        //create file name
        String filename="ACC_"+randomNumber+".json";

        //Create a JSONObject with  data
        JsonObject jsonobject=new JsonObject();
        jsonobject.put("Name",getFirstName());
        jsonobject.put("PhoneNumber",getPhoneNumber());
        jsonobject.put("Email Id",getEmailId());
        jsonobject.put("Address",getAddress());

        //Calling the writeJsonToFile method to write the json object to the json file
        writeJsonToFile(jsonobject,filename,folderPath);



    }


   /* // Generate a random number to use in the filename
    int randomNum = new Random().nextInt(1234);


    // Create a folder (if not exists)
    Path folderPath = Paths.get("/Users/dharmikkumarsavani/Java_Project");
            try{
        Files.createDirectories(folderPath);
    } catch(IOException e){
        e.printStackTrace();
        return;
    }

    // Create the JSON file
    String fileName = "ACC_" + randomNum + ".json";
    Path filePath = folderPath.resolve(fileName);

    // Write user details to the JSON file
    JSONObject jsonAccount = new JSONObject();
            jsonAccount.put("FirstName",firstName);
            jsonAccount.put("PhoneNumber",phoneNumber);
            jsonAccount.put("EmailId",emailId);
            jsonAccount.put("Address",address);

            try(FileWriter fileWriter = new FileWriter(filePath.toString()))
    {
        fileWriter.write(jsonAccount.toString(2)); // Indent with 2 spaces for better readability
        System.out.println("Account created successfully. Details saved in " + fileName);
    } catch(IOException e){
        e.printStackTrace();
    }*/
}




