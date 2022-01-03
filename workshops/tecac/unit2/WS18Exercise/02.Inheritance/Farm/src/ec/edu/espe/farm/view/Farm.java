package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Camila
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id = 0;
        String beed = "any";
        LocalDate bornOn = LocalDate.of(2021, 12, 15);

        System.out.println("WS18 --> Camila Teca <--");
        
        farmAnimal = new FarmAnimal(0, beed, bornOn);
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        System.out.println("farmAnimal -> ");
        System.out.println("id      -> " + farmAnimal.getId());
        System.out.println("breed   -> " + farmAnimal.getBreed());
        System.out.println("born On -> " + farmAnimal.getBornOn());

        id = 1;
        beed = "Plymount";
        bornOn = LocalDate.of(2020, 06, 20);
        boolean isMolting = true;

        farmAnimal = new Chicken(isMolting, id, beed, bornOn);

        System.out.println("farmAnimal is a " + farmAnimal.getClass());

        Chicken chicken = new Chicken(true, id, beed, bornOn);
        System.out.println("farmAnimal is a " + chicken.getClass());

        System.out.println("farmAnimal -> ");
        System.out.println("id        -> " + chicken.getId());
        System.out.println("breed     -> " + chicken.getBreed());
        System.out.println("born On   -> " + chicken.getBornOn());
        System.out.println("isMolting ->" + chicken.isIsMolting());
    }

}