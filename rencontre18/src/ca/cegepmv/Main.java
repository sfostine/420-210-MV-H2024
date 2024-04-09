package ca.cegepmv;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Tomate");
        fruits.add("Pomme");
        fruits.add("Orange");
        fruits.set(1, "Raisin");
        fruits.remove(1);
        fruits.remove("Cerise");
        fruits.add("Cerise");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
