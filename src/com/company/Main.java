package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String logo = "\n|------------CASINO-SIMULATOR------------|\n";
        System.out.println(logo);
        System.out.println("ENTER YOUR MONEY");




        Scanner sc = new Scanner(System.in);
        int money = 0;
        while (sc.hasNextLine() || money == 0){
            try{
                int x = sc.nextInt();
                money = x;
                System.out.println("\n");
                break;
            }catch(java.util.InputMismatchException e){
                System.out.println("enter valid value plz\n");
                sc.nextLine();
            }
        }

        System.out.println("Enter value of bet");

        int bet = 0;
        while (sc.hasNextLine() || bet == 0){
            try{
                int p = sc.nextInt();
                if(p>money){
                    System.out.println("\nbet is too big, try again:");
                    sc.nextLine();
                }else{
                    bet = p;
                    break;
                }

            }catch(java.util.InputMismatchException e){
                System.out.println("enter valid value plz\n");
                sc.nextLine();
            }
        }

        GameProcess gameProcess = new GameProcess(money, bet);

        gameProcess.PrintStat();


//        Item item1 = new Item("kill machine", 0, 1000);
//        Item item2 = new Item("fuck you", 1, 1500);
//        Item item3 = new Item("nomatter", 2, 2000);
//        Item item4 = new Item("fkn knife", 3, 5000);




        String[] names = {"banana","tomato", "makaka", "apple", "pirat", "sheesh", "wolf"};
        Item[] arrOfItems = new Item[names.length];

        for(int i=0; i<names.length; i++){
            Random random = new Random();
            int name_index = random.nextInt(names.length);
            int rint = new Random().ints(0,  4).findFirst().getAsInt();

            arrOfItems[i] = new Item(names[name_index], rint);

        }

        for (Item item : arrOfItems)
        {
            try{
                item.PrintItem();
            }catch (NullPointerException e){
                System.out.println("somethig goes wrong\nTRY AGAIN!");
            }
        }

    }
}
