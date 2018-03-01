package by.asrohau.parser;

public class Factorial {
    public static int getFactorial(int number){
        if (number == 0){
            return 1;
        }
        if (number == 1){
            return 1;
        }
        return getFactorial(number-1)*number;
    }
}
