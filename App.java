import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        //1.
        ArrayList<Integer> listOfNums = new ArrayList<Integer>(5);
        final Scanner sc = new Scanner(System.in);
        System.out.println("Please enter five numbers:");
        int num1 = sc.nextInt();
        listOfNums.add(num1);
        int num2 = sc.nextInt();
        listOfNums.add(num2);
        int num3 = sc.nextInt();
        listOfNums.add(num3);
        int num4 = sc.nextInt();
        listOfNums.add(num4);
        int num5 = sc.nextInt();
        listOfNums.add(num5);

        int numSums = num1 + num2 + num3 + num4 + num5;

        int numProduct = num1 * num2 * num3 * num4 * num5;
        
        int min = listOfNums.get(0);          //initializes min variable to the first number entered in the array list
        int max = listOfNums.get(0);          //initializes max variable to the first number entered in the array list

        for (int i=0; i<5; i++){
            if (listOfNums.get(i) > max){     //iterates through array list of numbers entered and sets max equal to highest number entered
                max = listOfNums.get(i);
            }
        }

        for (int i=0; i<5; i++){
            if (listOfNums.get(i) < min ){    //iterates through array list of numbers entered and sets min equal to lowest number entered
                min = listOfNums.get(i);
            }
        }

        System.out.println("You entered " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + ". The sum of your entered numbers is: " + numSums + ". The product of your entered numbers is: " + numProduct + ". The lowest number entered is: " + min + ". The highest number entered is: " + max);


        
        //2. HashMap for Car Makes and Models

        HashMap<String, String> vehicles = new HashMap<String, String>();
        sc.nextLine();     //resetting the cursor to receive input for the next scanner instance, based on https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
        
        vehicles.put("A-Class", "Mercedes-Benz");
        vehicles.put("Outback","Subaru");
        vehicles.put("Silverado","Chevy");
        vehicles.put("Escape","Ford");
        vehicles.put("Corolla","Toyota");
        vehicles.put("Accord","Honda");
        vehicles.put("Elantra","Hyundai");
        vehicles.put("Wrangler","Jeep");
        vehicles.put("Rogue","Nissan");
        vehicles.put("Sierra","GMC");
        vehicles.put("Equinox","Chevrolet");

        System.out.println("What model are you looking for?");    //asks user for a car model as a String type and stores it in a variable
        String userModel = sc.nextLine();               

        if (vehicles.containsKey(userModel)){           //checks whether the HashMap contains a key that matches what the user typed, and if so, outputs corresponding value which is the car make. If no key match found, the user is informed.
            System.out.println("Oh, you're looking for a " + userModel + "? Our " + vehicles.get(userModel) + " selection is right over here.");
        }                                               
        else{
            System.out.println("Sorry, we don't have any " + userModel + "s here today.");
        }

        sc.close();                           //closes scanner
    }
}
