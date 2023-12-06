package creational.pattern.abstractfactory;

public class DatabaseOneService implements Service {

  @Override
  public String runService() {
    return "Database -1 service running";
  }
  
}
