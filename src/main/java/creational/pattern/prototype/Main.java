package creational.pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus(4, 989899, "green");
        Vehicle clone1 = bus1.clone();
        clone1.isClone(bus1); // Proper clone

        Vehicle cycle1 = new Cycle(4, 989899, true);
        Vehicle cycle2 = cycle1.clone();

        cycle1.isClone(cycle2);  // Proper clone

        cycle1.isClone(bus1);  // These are NOT the right clones (bus != cycle objects)
    }
}
