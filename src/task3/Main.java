package task3;

public class Main {
    public static void main(String[] args) {
        Vehicle plane1 = new Plane("Plane1", 100000, 900, 2001, 3000, 300);
        Vehicle car1 = new Car("Car1", 25000, 300, 2018);
        Vehicle ship1 = new Ship("Ship1", 200000, 100, 1991, "Odessa", 1000);
        System.out.println(plane1);
        System.out.println(car1);
        System.out.println(ship1);
    }
}
