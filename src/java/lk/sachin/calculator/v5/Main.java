package lk.sachin.calculator.v5;


import lk.sachin.calculator.v5.input.CommandLineInputs;
import lk.sachin.calculator.v5.operation.OperationFactory;
import lk.sachin.calculator.v5.repository.FileNumberRepository;
import lk.sachin.calculator.v5.repository.NumberRepository;
import lk.sachin.calculator.v5.ui.CmdLineUI;
import lk.sachin.calculator.v5.ui.UI;
import lk.sachin.calculator.v5.input.Inputs;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory= new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs,numberRepository, operationFactory, ui);
        app.execute();

    }
}
