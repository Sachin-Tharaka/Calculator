package lk.sachin.calculator.v3;

import lk.sachin.calculator.v3.operation.AddOperation;
import lk.sachin.calculator.v3.operation.MulOperation;
import lk.sachin.calculator.v3.operation.SubOperation;

public class Main {
    public static void main(String[] args) throws Exception {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String oprt = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


 double result = 0;

        switch (oprt) {
            case "add":
 AddOperation addOperation = new AddOperation();
 result = addOperation.execute(numbers);
 break;
            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.execute(numbers);
                break;
            default:
                MulOperation mulOperation = new MulOperation();
                result = mulOperation.execute(numbers);
                break;
        }

        System.out.println("Result is " + result);
    }
}
