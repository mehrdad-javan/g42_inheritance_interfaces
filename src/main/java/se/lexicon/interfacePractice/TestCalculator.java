package se.lexicon.interfacePractice;

public class TestCalculator {

  public static void main(String[] args) {
    Calculator calculator = new CalculatorImpl();
    calculator.welcomeMessage();

    while (true){
      System.out.println("Enter number1: ");
      String num1 = Calculator.takeInput();

      System.out.println("Enter number2: ");
      String num2 = Calculator.takeInput();

      System.out.println("Enter a valid operation (+,-,*,/   c= exit)");
      String operation = Calculator.takeInput();

      switch (operation){
        case "+":
          int additionResult =  calculator.addition(Integer.parseInt(num1), Integer.parseInt(num2));
          System.out.println("additionResult = " + additionResult);
          break;
        case "-":
          int subtractionResult = calculator.subtraction(Integer.parseInt(num1), Integer.parseInt(num2));
          System.out.println("subtractionResult = " + subtractionResult);
          break;
        case "c":
          System.exit(0);
        //...
        default:
          System.out.println("operation is not valid!");
      }
      System.out.println("##### DONE #####");
    }


  }

}
