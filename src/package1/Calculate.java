package package1;

import java.lang.annotation.*;

/** Написати калькулятор з використанням анотацій, анотація передає 2 параметри.
 Зробити повну документацію всіх полів, методів, конструкторів класу використовуючи інструкцію Documented,
 або документаційні коментарі.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Calculate {
       int num1();
       int num2();
}
