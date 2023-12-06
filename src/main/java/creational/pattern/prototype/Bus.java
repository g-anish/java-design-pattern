package creational.pattern.prototype;

public class Bus extends Vehicle{

    private String color;

    public Bus(int wheels, int price, String color){
        this.color = color;
        this.wheels = wheels;
        this.price = price;
    }

    public Bus(Bus target){
        super(target);
        color = target.color;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof Bus){
            Bus b = (Bus) target;
            if (b.color == color && b.price == price && b.wheels == wheels) {
                System.out.println(this + " and " + b + " are clones");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are NOT clones");
        return false;
    }
}
