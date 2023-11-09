package package3;

public class Department {
    @Math(num1 = 100, num2 = 200)
    public void mathSum() throws NoSuchMethodException {
        Math math = this.getClass().getMethod("mathSum").getAnnotation(Math.class);
        int sum = math.num1() + math.num2();
        System.out.println("Сума: " + sum);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        new Department().mathSum();


    }
}
