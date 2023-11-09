/**
 * Створити свою анотацію, яка міститиме параметри для методу, виконати додавання 2-х чисел.
 *
 * @Math(num1 = 100, num2 = 200)
 * public void mathSum(int num1, int num2)
 */

package package3;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Math {
    int num1();

    int num2();
}
