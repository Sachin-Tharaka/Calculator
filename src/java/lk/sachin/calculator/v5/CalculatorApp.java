package lk.sachin.calculator.v5;

import lk.sachin.calculator.v5.input.Inputs;
import lk.sachin.calculator.v5.operation.Operation;
import lk.sachin.calculator.v5.operation.OperationFactory;
import lk.sachin.calculator.v5.repository.NumberRepository;
import lk.sachin.calculator.v5.ui.UI;
import java.io.IOException;

public class CalculatorApp {
    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException {

        String opr = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(opr);
        final double result = operation.execute(numbers);
        ui.showMessage("Result is " + result);

    }
}