package task3;

public class Vehicle {
    private String name;
    private int price;
    private int speed;
    private int year;
    public Vehicle(String name, int price, int speed, int year){
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + ": \n price: " + price +
                ", speed: " + speed +
                ", year: " + year;
    }
}
