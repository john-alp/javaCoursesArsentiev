import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author demiurg
 * @since 25.02.2020
 * @version 2.1
 *  Task is to implement a calculator. Realize :)
 */

public class Calculate {
    public static void main(String[] args) throws InterruptedException {
        double first, second;
        String symbol = null;
        String exit = "no";
        /**
         * creating a class object
         */
        Operation operation = new Operation();
        System.out.println("Calculate...  (c)demiurg  v 2.1");
        /**
         *
         */
        while (!exit.equals("yes")){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the first argument.. ");
            try {
                first = Double.parseDouble(reader.readLine());
            } catch (Exception e) {
                System.out.println("Something goes wrong... Repeat, please...     "+e);
                continue;
            }
            System.out.println("Enter a calculation operation..             (Help:  - + * / ^)");
            try {
                symbol = reader.readLine();
            } catch (IOException e) {

            }
            System.out.println("enter the second argument... ");
            try {
                second = Double.parseDouble(reader.readLine());
            } catch (Exception e) {
                System.out.println("Something goes wrong... Repeat, please...     "+e);
                continue;
            }
            System.out.println("Сontemplating the result :                  "+operation.ArgsAndSym(first, second, symbol));
            System.out.println();
            /**
             * We have a break, suspending the thread. For ease of perception...
             */
            Thread.sleep(3000);
/**
 *We are trying to "clear" the console by removing the text on the screen by 50 lines
 */
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Exit is the calculation?                          (Help: yes/no or press Enter)");
            try {
                exit = reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 50; ++i) System.out.println();

        }
    }
}

/**
 * Class for performing mathematical operations. The idea is this, we submit arguments to the input and what needs to be done.
 * At the output, we get the result of calculations.
 */
class Operation{
    private double summ;
    /**
     * @param first  value of the first argument
     * @param second  value of the second argument
     * @param symbol  a mathematical symbol that indicates to the object what calculation to perform
     * @return returns the result of calculations
     */
    public double ArgsAndSym(double first, double second, String symbol) {
        /**
         *  case
         */
      /*  if (symbol.equals("-")) {
            System.out.println("IF");
        }*/

        switch (symbol.trim()) {
            case "-":
                summ = first - second;
                break;
            case "+":
                summ = first + second;
                break;
            case "*":
                summ = first * second;
                break;
            case "/":
                if (second == 0){
                    System.out.println("You can't divide by zero!");
                    break;
                }else{
                    summ = first / second;
                }
                break;
            case "^" : summ = Math.pow(first, second);
            default: summ = 0;
                System.out.println();
                System.out.println("The mathematical symbol is not recognized: "+symbol+" !!!!!!!!!" );
                System.out.println();
        }
        return summ;
    }
  /*  private double subtraction(){
        return f
    }

    Subtraction
Addition
Multiplication
Division
    */



    /**
     * Redefining the toString method
     * @return returns the result of calculations
     */

    @Override
    public String toString() {
        return " " + summ;
    }
}


