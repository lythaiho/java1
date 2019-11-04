package pratical;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void inputInfo() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap name");
        this.setName(sc.nextLine());
        System.out.println("Nhap location");
        this.setLocation(sc.nextLine());
        System.out.println("Nhap Ownerl's Name");
        this.setOwnerName(sc.nextLine());
    }

    public void showInfo() {
        System.out.println("name" +name);
        System.out.println("location" +location);
        System.out.println("Ownerl's Name" +ownerName);
    }

    public void timHotel(String ownerName) {
        if (this.getOwnerName().equals(ownerName)) this.showInfo();

    }

}
