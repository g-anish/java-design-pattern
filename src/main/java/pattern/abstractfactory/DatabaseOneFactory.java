package pattern.abstractfactory;

public class DatabaseOneFactory implements DataSourceAbstractFactory{

  @Override
  public Service createService() {
    return new DatabaseOneService();
  }

  @Override
  public Response createResponse() {
    return new DatabaseOneResponse();
  }
  
}
