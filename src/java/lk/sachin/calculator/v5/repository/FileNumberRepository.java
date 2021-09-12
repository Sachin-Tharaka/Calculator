package lk.sachin.calculator.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileNumberRepository implements NumberRepository  {

    public Double[] getNumbers() throws IOException {// will change the method signature

        // Read the numbers text file
        List<String> numbers = Files.readAllLines(Paths.get("numbers.txt"));

        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));


        return new Double[]{num1, num2};
    }







}


