package pattern.builder;

public class Main {

    public static void main(String[] args) {
        FormBuilder builder = new FormBuilder();

        Form form = builder
                .setName("John")
                .setAge(28)
                .build();

        System.out.println(form.toString());
    }
}