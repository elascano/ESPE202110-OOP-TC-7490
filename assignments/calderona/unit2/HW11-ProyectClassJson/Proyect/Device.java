
package ec.edu.espe.smart.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Andy Calderon 
 */
public class Device {
    private int id;
    private String description;
    private String room;
    private boolean status;     //true -if the device is on, false -if the device is off
    private int workingData;    //tv, radio -volume; microwave -time; refrigerator -temperature

    public String toCsv(){
        String csv;
        csv = "";
        csv = id + "," + description + "," + room + "," + status + "," + workingData;
        return csv;
    }
    
    public Device(int id, String description, String room, boolean status, int workingData) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workingData = workingData;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the workingData
     */
    public int getWorkingData() {
        return workingData;
    }

    /**
     * @param workingData the workingData to set
     */
    public void setWorkingData(int workingData) {
        this.workingData = workingData;
    }
    
    
}
