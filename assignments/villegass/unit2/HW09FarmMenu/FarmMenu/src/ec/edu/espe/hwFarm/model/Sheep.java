
package ec.edu.espe.hwFarm.model;

import java.time.LocalDate;



/**
 *
 * @author Salma Villegas
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }


   

    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
    
    
}
