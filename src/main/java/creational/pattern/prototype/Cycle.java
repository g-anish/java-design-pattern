package creational.pattern.prototype;

public class Cycle extends Vehicle{

    private boolean pedalCycle;

    public Cycle(int wheels, long price, boolean pedalCycle){
        this.pedalCycle = pedalCycle;
        this.wheels = wheels;
        this.price = price;
    }
    public Cycle(Cycle target) {
        super(target);
        this.pedalCycle = target.pedalCycle;
    }

    public Cycle(Vehicle target) {
        super(target);
    }

    @Override
    public Vehicle clone() {
        return new Cycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof Cycle){
            Cycle c = (Cycle) target;
            if(pedalCycle == c.pedalCycle && wheels == c.wheels && price == c.price){
                System.out.println(this + " and " + c +" are clones");
                return true;
            }
        }
        System.out.println(this + " and " + target +" are NOT clones");
        return false;
    }
}
