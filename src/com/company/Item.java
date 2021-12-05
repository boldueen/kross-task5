package com.company;

public class Item {
    private
        String name;
        int rare;
        String color;
        int value;

    Item(String name, int rare){
        this.name = name;
        this.rare = rare;
        this.color = SetColor();
        this.value = SetValue();

    }

    public String SetColor(){
        switch (this.rare) {
            case 0: return "32";
            case 1: return "34";
            case 2: return "35";
            case 3: return "31";
        }
        return "0";
    }

    public int SetValue(){
        switch (rare){
            case 0: return 1;
            case 1: return 10;
            case 2: return 100;
            case 3: return 1000;
        }
        return -1;
    }

    public int GetValue(){
        return this.value;
    }

    public void PrintItem(){
        System.out.println((char)27 + "["+ color +"m" + name + " " +value);
    }


}
