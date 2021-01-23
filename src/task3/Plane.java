package task3;

public class Plane extends Vehicle{

    int height;
    int passengersNumber;

    public Plane(String name, int price, int speed, int year, int height, int passengersNumber) {
        super(name, price, speed, year);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }
    public int getHeight(){
        return height;
    }
    public int getPassengersNumber(){
        return passengersNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", height: " + height + ", number of passangers: " +
                + passengersNumber;

    }
}
