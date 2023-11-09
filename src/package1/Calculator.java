package package1;

public class Calculator {
    @Calculate(num1 = 111, num2 = 222) // можна змінювати значення
    public void add() throws NoSuchMethodException {
        Calculate calculate = this.getClass().getMethod("add").getAnnotation(Calculate.class);
       int result = calculate.num1() * calculate.num2(); // можна змінювати знак дії
        System.out.println("Результат: " + result);
    }
}
 class NewCalculator{
     public static void main(String[] args) throws NoSuchMethodException {
     Calculator calculator = new Calculator();
     calculator.add();
     }

}
