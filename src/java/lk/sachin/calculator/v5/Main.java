package lk.sachin.calculator.v5;

import lk.sachin.calculator.v5.input.CommandLineInputs;
import lk.sachin.calculator.v5.operation.OperationFactory;
import lk.sachin.calculator.v5.repository.FileNumberRepository;
import lk.sachin.calculator.v5.ui.CmdLineUI;

public class Main {
    public static void main(String[] args) throws Exception {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository fileReader = new FileNumberRepository();
        OperationFactory operationFactory= new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs,numberRepository, operationFactory, ui);
        app.execute();

    }
}
