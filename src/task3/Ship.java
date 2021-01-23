package task3;

public class Ship extends Vehicle{
    private String port;
    private int passengersNumber;
    public Ship(String name, int price, int speed, int year, String port, int passengersNumber) {
        super(name, price, speed, year);
        this.port = port;
        this.passengersNumber = passengersNumber;
    }

    public String getPort() {
        return port;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", port: " + port + ", number of passangers: " + passengersNumber;
    }
}
