package builder;

public class FormBuilder {

    private String name;
    private int age;
    private String gender;
    private String foodPreference
    private boolean rsvp;
    private String city;
    private String area;



    public FormBuilder setName(String name) {
        this.name = name;
    }

    public FormBuilder setAge(int age) {
        this.age = age;
    }

    public FormBuilder setRsvp(boolean rsvp) {
        this.rsvp = rsvp;
    }

    public FormBuilder setCity(String city) {
        this.city = city;
    }

    public FormBuilder setArea(String area) {
        this.area = area;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }


    public Form build(){
        Form form= new Form(String name, int age, boolean rsvp, String city, String area) {
            this.name = name;
            this.age = age;
            this.rsvp = rsvp;
            this.city = city;
            this.area = area;
            this.
            return form;
    }
}

