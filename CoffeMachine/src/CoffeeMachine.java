

import java.util.Scanner;

        public class CoffeeMachine {

            static int water = 400;
            static int milk = 540;
            static int beans = 120;
            static int cups = 9;
            static int money = 550;
            public static void main(String[] args) {
                boolean systemFlow = true;
                while (systemFlow){

                    System.out.println("Write action (buy, fill, take):");
                    System.out.println("Type 'remaining'  if you want to view the resources the machine has.");
                    System.out.println("Type 'exit' if you want to switch off the coffee machine.");
                    Scanner scanner2 = new Scanner(System.in);
                    String command = scanner2.next();
                    switch (command) {
                        case "buy":

                            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                            System.out.println("Type back to return to main cycle");
                            String userInput = scanner2.next();
                            Buying(userInput);



                            break;
                        case "fill":
                            fillMachine();
                            break;
                        case "take":
                            System.out.println("I gave you $" + money);
                            money = 0;

                            break;
                        case "remaining":
                            printRemains();
                            break;

                        case "exit":
                            systemFlow = false;
                            break;


                        default:
                            throw new IllegalStateException("Unexpected value: " + command);
                    }
                }

            }
            public static void Buying ( String input){
                switch(input) {
                    case "back":
                        break;
                    case "1":
                        if (water < 250) {
                            System.out.println("Sorry not enough water");
                        } else if (beans < 16) {
                            System.out.println("Sorry not enough beans");
                        } else if (cups < 1) {
                            System.out.println("sorry not enough cups");
                        } else {
                            System.out.println("I have enough resources, making you coffee");
                            water -= 250;
                            beans -= 16;
                            money += 4;
                            cups -= 1;
                        }
                        break;

                    case "2":
                        if (water < 350) {
                            System.out.println("Sorry not enough water");
                        } else if (beans < 20) {
                            System.out.println("Sorry not enough beans");
                        } else if (milk < 75) {
                            System.out.println("Sorry not enough milk");
                        } else if (cups < 1) {
                            System.out.println("sorry not enough cups");
                        } else {
                            System.out.println("I have enough resources, making you coffee");
                            water -= 350;
                            beans -= 20;
                            money += 7;
                            milk -= 75;
                            cups -= 1;
                        }
                        break;
                    case "3":
                        if (water < 200) {
                            System.out.println("Sorry not enough water");
                        } else if (beans < 12) {
                            System.out.println("Sorry not enough beans");
                        } else if (milk < 100) {
                            System.out.println("Sorry not enough milk");
                        } else if (cups < 1) {
                            System.out.println("sorry not enough cups");
                        } else {
                            System.out.println("I have enough resources, making you coffee");
                            water -= 200;
                            beans -= 12;
                            money += 6;
                            milk -= 100;
                            cups -= 1;
                        }
                }



            }
            public static void filling ( int water1, int milk2, int coffeeBeans3, int cups3){
                water += water1;
                milk += milk2;
                beans += coffeeBeans3;
                cups += cups3;

            }

            public static void printRemains () {
                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(beans + " g of coffee beans");
                System.out.println(cups + " disposable cups");
                System.out.println("$" + money + " of money");
            }

            public static void fillMachine () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Write how many ml of water you want to add:");
                int waterToAdd = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int milkToAdd = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int beansToAdd = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int cupsToAdd = scanner.nextInt();
                filling(waterToAdd, milkToAdd, beansToAdd, cupsToAdd);
            }
        }


        