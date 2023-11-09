/**
 * створіть ієрархію класів - вистачить 2-3 класи
 * - створіть анотацію, при створенні анотації використайте @Inherited
 * - в одному з батьківських класів ( у якого є нащадки) використайте вашу анотацію та перевірте, чи ця анотація успадковується в нащадках
 * - використайте ще 4 будь-які інші анотації в програмі (наприклад, подивіться в бік інструменту lombok)
 */

package package2;



import java.lang.annotation.*;

// Створюємо анотацію @InheritedExample, яка успадковується від @Inherited
// Створюємо ще  анотаціі в класах Dog і Cat

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface InheritedExample {
    String value() default "Успадкована анотація";
}







