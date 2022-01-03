package utils;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Katherin Bravo
 */
public class FileManager {
    public static String read(String fileName){
        String recoveredData = "";
        
        
        try{
            //code to try 
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            
            while(reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine() + "\n" ;
            }
            reader.close();
            
        }catch(Exception ex){
            //code to manage
            System.out.println(" An error ocuured while opening " + fileName+
                    "\n File not found. \n Please make sure that your" 
                    + "file is in the project folder "
                    + "Please contact the program manager and provide the log of the system");
            ex.printStackTrace();
        }
        return recoveredData;
    }
    
    public static boolean save(String fileName, String data){
        try{
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write("hola, this is going to the file");
            fileWriter.close();
        }catch(Exception ex){
            System.out.println("An error occurred, "+ fileName + "could not the updated");
            ex.printStackTrace();
            
            return false;
        }
   

