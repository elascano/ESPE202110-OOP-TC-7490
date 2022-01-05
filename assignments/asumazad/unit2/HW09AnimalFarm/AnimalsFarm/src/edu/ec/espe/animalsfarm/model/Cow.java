<<<<<<< HEAD
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;

    public Cow(int id, String breed, LocalDate borOn, boolean isProducingMilk) {
        super(id, breed, borOn);
        this.isProducingMilk = isProducingMilk;

    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

}
=======
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;

    public Cow(int id, String breed, LocalDate borOn, boolean isProducingMilk) {
        super(id, breed, borOn);
        this.isProducingMilk = isProducingMilk;

    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

}
>>>>>>> 466fcee97c9470e8d3d0c4ffc518fa7f80e38b4c
