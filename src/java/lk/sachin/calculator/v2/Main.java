package lk.sachin.calculator.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Please provide any operator as an arguments");
            return;
        }

        String oprt = args[0];

        if (!(oprt.equals("add") || oprt.equals("sub") || oprt.equals("mul"))) {
            System.out.println("Fail! Please provide any valid operation");
            return;
        }

        List<String> numbers = Files.readAllLines(Paths.get("numbers.txt"));

        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));
        double result;

        switch (oprt) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            default:
                result = num1 * num2;
                break;
        }

        System.out.println("Result is " + result);
    }
}
