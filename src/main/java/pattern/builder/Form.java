package pattern.builder;

public class Form {
    private String name;
    private int age;
    private int count;
    private boolean rsvp;
    private String city;
    private String area;

    public Form(String name, int age, int count, boolean rsvp, String city, String area) {
        this.name = name;
        this.age = age;
        this.count = count;
        this.rsvp = rsvp;
        this.city = city;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isRsvp() {
        return rsvp;
    }

    public void setRsvp(boolean rsvp) {
        this.rsvp = rsvp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Form  {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", count=" + count +
                ", rsvp=" + rsvp +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}