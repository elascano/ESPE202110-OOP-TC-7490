
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel Guaman
 */
public class FileManager {
   
    
public static ArrayList<String> read(String fileName){
        ArrayList<String> recoveredData=new ArrayList<>();

        try{
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                recoveredData.add(reader.nextLine());
            }
            reader.close();
        } catch(FileNotFoundException ex) {
     
            System.out.println("An error occurred while opening " + fileName + "/n File not found. \n Please make sure that your file is in the project folder Please contact the program manager and provide the log of the system");
            
            ex.printStackTrace(); // it must be saved in a --> log <--
        }
        
        return recoveredData;
    }
    
    public static boolean save(String fileName, String data){
        try{
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data+"\n");
            fileWriter.close();
            return true;
        }catch(IOException ex){
            System.out.println("An error occurred, " + fileName + " could not be updated");
            //ex.printStackTrace();
            
        return false;
        }
    }
}  
