package pattern.abstractfactory;

public interface DataSourceAbstractFactory {
  Service createService();
  Response createResponse();
}
