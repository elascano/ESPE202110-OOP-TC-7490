    package Table;

    import java.util.Scanner;

        public class Table {

            public static void main(String[] args) {
 
            Scanner number = new Scanner(System.in);
            int n;
            int condition = 1;

            while(condition == 1){
            System.out.print("\nPlease enter a number from 1 to 12: ");                                                         
            n = number.nextInt();
            if (n%2==0)
                System.out.println("\nThe number is even");
            else
                System.out.println("The number is odd");
            System.out.println("\nTable of " + n);
            for(int i = 1; i<=12; i++)
             System.out.println(n + " * " + i + " = " + n*i);
            System.out.println("\n------------------------------------------");
            System.out.println("\nDo you want to enter another number?");                                                     
            System.out.println("\nEnter 1 ---> if you want to continue");
            System.out.println("\nEnter 0 ---> if you want to exit");
            condition = number.nextInt(); 
            System.out.println("\n------------------------------------------");        
        }
   }
}