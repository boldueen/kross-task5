package com.company;

public class GameProcess {
    int attempts = 1;
    int allMoney = 0;
    int attemptPrice=50;
    Item[] GameArray = new Item[10];

    GameProcess(int allMoney, int desireValue){
        this.allMoney = allMoney;
        this.attemptPrice = desireValue;
        this.attempts = allMoney /attemptPrice;

    }


    public void PrintStat(){
        System.out.println("attempts: " + attempts);
        System.out.println("allMoney: " + allMoney);
        System.out.println("attemptPrice: " + attemptPrice);
    }

    


}
