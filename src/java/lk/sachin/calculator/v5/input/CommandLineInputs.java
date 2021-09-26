package lk.sachin.calculator.v5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    // Constructor of the class
    public CommandLineInputs(String[] arguments ){
        this.args = arguments;
    }

    public String getOperator() throws InvlidInputException {
        if (args.length == 0) {

            throw new InvlidInputException("Please provide any operator as an arguments");
        }

        String oprt = args[0];

        if (!(oprt.equals("add") || oprt.equals("sub") || oprt.equals("mul") || oprt.equals("div"))) {
           throw new InvlidInputException("Please provide any operator as an arguments");

        }
        return oprt;
    }




}
