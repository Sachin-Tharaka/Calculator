package lk.sachin.calculator.v3;

public class CommandLineInputs {

    private final String[] args;

    // Constructor of the class
    public CommandLineInputs(String[] arguments ){
        this.args = arguments;
    }

    public String getOperator(){
        if (args.length == 0) {
            System.out.println("Please provide any operator as an arguments");
            return ""; // will change in future
        }

        String oprt = args[0];

        if (!(oprt.equals("add") || oprt.equals("sub") || oprt.equals("mul"))) {
            System.out.println("Fail! Please provide any valid operation");
            return ""; // will change in future
        }
        return oprt;
    }




}
