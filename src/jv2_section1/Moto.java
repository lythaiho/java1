package jv2_section1;

public class Moto implements Comparable<Moto>{
    public String name;
    public int age;

    public Moto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Moto o) {
        return this.name.compareTo(o.name);
    }
}
