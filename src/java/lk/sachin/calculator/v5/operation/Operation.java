package lk.sachin.calculator.v5.operation;

//this class is a abstract or interface class
public interface Operation {


  public Double execute(Double[] numbers) throws InvalidOperationException;
}
