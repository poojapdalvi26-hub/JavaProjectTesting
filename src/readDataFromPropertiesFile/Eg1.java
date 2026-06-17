package readDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Eg1 {
    public static void main(String[] args) throws IOException {

        //locate the properties file using fileInputStream
        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\IdeaProjects\\24thTestingSelenium\\application.properties");
        FileInputStream myFile1= new FileInputStream("C:\\Users\\pooja\\IdeaProjects\\24thTestingSelenium\\test.properties");

        // create object of properties class
        Properties properties = new Properties();

        //load file using properties object
        properties.load(myFile);

        //read data
        String applicationUrl=properties.getProperty("url");
        System.out.println("Application url is " +applicationUrl);

        System.out.println("Application Environment is " +properties.getProperty("env"));
        System.out.println("Test Environment is " +properties.getProperty("TestEnv"));
        System.out.println("Application Username is " + properties.getProperty("un"));
        System.out.println("Password is " + properties.getProperty("password"));


    }
}
