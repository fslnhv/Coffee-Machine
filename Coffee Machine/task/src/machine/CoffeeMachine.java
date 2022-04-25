package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
       /* System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        int water = 200;
        int milk = 50;
        int beans = 15;
        int waterVolume = water * cups;
        int milkVolume = milk * cups;
        int beansWeight = beans * cups;
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(waterVolume + " ml of water");
        System.out.println(milkVolume + " ml of milk");
        System.out.println(beansWeight + " g of coffee beans");

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAvailable  = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAvailable = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeAvailable = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();


    }
}
