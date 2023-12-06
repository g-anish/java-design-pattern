package creational.pattern.builder;

public class FormBuilder {

    private String name;
    private int age;
    private int count;
    private boolean rsvp;
    private String city;
    private String area;


    public FormBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FormBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public FormBuilder setCount(int count) {
        this.count = count;
        return this;
    }

    public FormBuilder setRsvp(boolean rsvp) {
        this.rsvp = rsvp;
        return this;
    }

    public FormBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public FormBuilder setArea(String area) {
        this.area = area;
        return this;
    }

    public Form build() {
        return new Form(name, age, count, rsvp, city, area);
    }
}

