package pattern.abstractfactory;

public class Main {
  public static void main(String[] args) {
    Client client1 = new Client(new DatabaseOneFactory());
    client1.communicate();

    Client client2 = new Client(new DatabaseTwoFactory());
    client2.communicate();
  }
  
}
