package creational.pattern.abstractfactory;

public interface DataSourceAbstractFactory {
  Service createService();
  Response createResponse();
}
