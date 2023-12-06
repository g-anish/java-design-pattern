package creational.pattern.abstractfactory;

public class DatabaseTwoFactory implements DataSourceAbstractFactory{

  @Override
  public Service createService() {
    return new DataSourceTwoService();
  }

  @Override
  public Response createResponse() {
    return new DatabaseTwoResponse();
  }
  
}
