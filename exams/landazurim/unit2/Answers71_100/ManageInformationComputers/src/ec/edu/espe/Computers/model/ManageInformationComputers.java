
<<<<<<< HEAD:exams/landazurim/unit2/Answers71_100/ManageInformationComputers/src/ec/edu/espe/Computers/model/ManageInformationComputers.java
package ec.edu.espe.Computers.model;
=======
package ec.edu.espe.Computer.model;
>>>>>>> 0ea249654e197ce4a651699a90c9d28d0daecd6a:exams/landazurim/unit2/Answers71_100/ManageInformationComputers/src/ec/edu/espe/Computer/model/Computer.java

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Computer {

    private int serialNumber;
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private int price;

    public Computer(int serialNumber, String brand, String model, int ram, int storage, int price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    
    
    /**
     * @return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
}
