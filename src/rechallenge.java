import java.util.Random;
import java.util.Scanner;

public class rechallenge {
    public static void main ( String[] angs) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();


        String itemname="", category = "", minority = "", completion = "", x = "", output = "";
        int priority = 0, completed = 0, uncompleted = 0, low = 0, medium = 0, high = 0;



        //loop start
        while (!x.equals("q")){

            System.out.println ("Enter the item you have to do:");
            itemname = keyboard.next();


            System.out.println("Enter the category of this item:");
            category = keyboard.next();


            priority = rand.nextInt(2);
            if (priority ==0){
                minority = "low";
                low++;}

            else if(priority == 1){
                minority = "medium";
                medium++;}

            else if (priority == 2){
                minority = "high";
                high++;}
            System.out.println("Your assigned priority is:" + minority);


            System.out.println("Is this item completed? (true or false):");
            completion = keyboard.next();
            if (completion.contains("true")){
                completed++;}
            else { uncompleted++;}



            System.out.println("Do you have another item? Enter q to exit.");
            x = keyboard.next();

            output = output + itemname + "\t\t" + category + "\t\t" + minority + "\t\t"+ completion + "\n";

        }


        System.out.println("Item Name   Category    Priority    Done?");
        System.out.println(output);
        System.out.println("Low-Level: " + low + "  Medium-level: " + medium + "  High-level: " + high);
        System.out.println("Completed: " + completed);
        System.out.println("Uncompleted: " + uncompleted);

    }

}
