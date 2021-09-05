package lk.sachin.calculator.v4;

import lk.sachin.calculator.v4.operation.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String oprt = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        OperationFactory operationFactory= new OperationFactory();
        Operation operation= operationFactory.getInstance(oprt);
        final Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("Result is " + result);


    }
}
