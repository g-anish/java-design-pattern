package creational.pattern.prototype;

public abstract class Vehicle {
    public int wheels;
    public long price;

    public Vehicle(Vehicle target){
        this.wheels = target.wheels;
        this.price = target.price;
    }

    protected Vehicle() {
    }

    public abstract Vehicle clone();

    public abstract boolean isClone(Vehicle target);

}
