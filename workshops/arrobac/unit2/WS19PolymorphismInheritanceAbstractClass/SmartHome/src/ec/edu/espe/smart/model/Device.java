
package ec.edu.espe.smart.model;

/**
 *
 * @author Cristian Arroba
 */
public abstract class Device {
    private int id;
    private String description;
    private String room;
    private boolean status;    //true - if the device is on; false - if the device is off
    private int workingData;   //tv, radio - volumen; microwave - time; refrigerator - temperature
    
    public abstract void sleep(int time);  //abstract no tiene codigo //C prototipos 
        
        
    
    public void turnOn(){
        if(status == false){
            status = true;
        }
        
    }
    
    public void turnOff(){
        if(status == true){
            status = false;
        }
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
    
    
    

