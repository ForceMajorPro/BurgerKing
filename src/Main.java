import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        Workers workers = new Workers();
        Workers firstWorker = new Workers();
        Workers secondWorker = new Workers();
        PurchaseArea firstCombo = new PurchaseArea();
        PurchaseArea secondCombo = new PurchaseArea();
        PurchaseArea threeCombo = new PurchaseArea();

        System.out.print("Enter your name >> ");
        client.name = scanner.nextLine();
        System.out.print("Enter your balance >> ");
        client.balance = scanner.nextInt();

        workers.job = "Cashier";
        workers.amountWorkers = 2;

        firstWorker.name = "Valeriya Voronova";
        secondWorker.name = "Ivan Gorlov";

        firstCombo.food = "Vopper Junior + French Fries Standart + Coca-Cola 0,5 l";
        firstCombo.price = 249;

        secondCombo.food = "Shef Double + French Fries Standart + Coca-Cola 0,5 l";
        secondCombo.price = 469;

        threeCombo.food = "Big King XXL + French Fries Standart + Coca-Cola 0,5 l";
        threeCombo.price = 549;

        System.out.println("Welcome to the Burger King!");
        System.out.println();
        System.out.println("Your Name: " + client.name + ".");
        System.out.println("Your Balance: " + client.balance + " Rub.");
        System.out.println();
        System.out.println("Cashiers: " + workers.amountWorkers + ".");
        System.out.println("First cashier: " + firstWorker.name + ".");
        System.out.println("Second cashier: " + secondWorker.name + ".");
        System.out.println();
        System.out.println("What do you want to purchase?");
        System.out.println("1. " + firstCombo.food + ". Price: " + firstCombo.price + " Rub.");
        System.out.println("2. " + secondCombo.food + ". Price: " + secondCombo.price + " Rub.");
        System.out.println("3. " + threeCombo.food + ". Price: " + threeCombo.price + " Rub.");
        System.out.print("Choise: ");
        int choiseCombo = scanner.nextInt();
        System.out.println();

        switch (choiseCombo){
            case 1:
                if (client.balance >= firstCombo.price){
                    System.out.println("You have chosen " + firstCombo.food + ".");

                    client.remainingBalance = client.balance - firstCombo.price;

                    System.out.println("Thank you for buying from us! Enjoy your meal! Remaining balance: "
                            + client.remainingBalance + " Rub.");
                } else {
                    System.out.println("Not enough money!");
                }
                break;
            case 2:
                if (client.balance >= secondCombo.price){
                    System.out.println("You have chosen " + secondCombo.food + ".");

                    client.remainingBalance = client.balance - secondCombo.price;

                    System.out.println("Thank you for buying from us! Enjoy your meal! Remaining balance: "
                            + client.remainingBalance + " Rub.");
                } else {
                    System.out.println("Not enough money!");
                }
                break;
            case 3:
                if (client.balance >= threeCombo.price){
                    System.out.println("You have chosen " + threeCombo.food + ".");

                    client.remainingBalance = client.balance - threeCombo.price;

                    System.out.println("Thank you for buying from us! Enjoy your meal! Remaining balance: "
                            + client.remainingBalance + " Rub.");
                } else {
                    System.out.println("Not enough money!");
                }
                break;
            case default:
                System.out.println("There is no such option!");
                break;
        }
    }
}