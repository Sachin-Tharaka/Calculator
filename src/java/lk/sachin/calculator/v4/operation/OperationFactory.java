package lk.sachin.calculator.v4.operation;

public class OperationFactory {

    public Operation getInstance(String oprt){
        Operation operation=null;

        if (oprt.equals("add")){
            operation= new AddOperation();
        }else if (oprt.equals("sub")){
            operation = new SubOperation();
        } else if (oprt.equals("mul")){
            operation = new MulOperation();
        }
        else if (oprt.equals("div")){
            operation = new DivOperation();
        }
  return operation;
    }
}
