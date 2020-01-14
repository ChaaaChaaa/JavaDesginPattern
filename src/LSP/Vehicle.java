package LSP;

public class Vehicle {
    protected int speed;
    private int cubicCapacity;

    public Vehicle(int speed, int cubicCapacity) {
        this.speed = speed;
        this.cubicCapacity = cubicCapacity;
    }

    public void speedUp() {
        this.speed += 3;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getCubicCapacity() {
        return this.cubicCapacity;
    }
}
