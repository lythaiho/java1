package jv2_section1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        for (String x:arrayList){
//            System.out.println(x);
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Hello");
        hashSet.add("World");
        for (String x:hashSet){
            System.out.println(x);
        }

        System.out.println("Vi du Quere");
        PriorityQueue<String> strQueue = new PriorityQueue<>();
        strQueue.add("e");
        strQueue.add("c");
        strQueue.add("z");
        strQueue.add("g");
        for (String x : strQueue) {
            System.out.println(x);
        }

        PriorityQueue<Moto> moto = new PriorityQueue<>();
        moto.add(new Moto("Toyota",12));
        moto.add(new Moto("Honda",5));
        moto.add(new Moto("Nissan",7));
        for (Moto m : moto) {
            System.out.println(m.name+" -- "+m.age);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("labell",12);
        hashMap.put("abc",1000);
        System.out.println(hashMap.get("labell"));

        HashMap<Integer, Moto> motoHashMap = new HashMap<>();
        motoHashMap.put(1,new Moto("ben",1));
        System.out.println(motoHashMap.get(1).name);
    }
}
