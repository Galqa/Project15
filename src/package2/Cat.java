package package2;

import lombok.*;

@Getter // анотація з інструменту Lombok для генерації гетера
@Setter // анотація з інструменту Lombok для генерації сетера
@AllArgsConstructor //  анотація  з інструменту Lombok для генерації конструктора з усіма параметрами
@Builder // анотація  з інструменту Lombok - генерує методи, якими  ініціалізуємо об'єкт по ланцюжку, коли не хочемо використовувати конструктор з усіма параметрами

// Створюємо клас Cat, який успадковує від Animal
class Cat extends Animal {
    private String breed;
    public Cat(String name, String breed) {
        super.setName(name);
        this.breed = breed;
    }

    public String toString() {
        return "Cat(name=" + super.getName() + ", breed=" + breed + ")";
    }
}

class NewCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Baby", "Ragdoll");
        System.out.println(cat);

        // Перевіряємо, чи об'єкт має анотацію @InheritedExample
        if (cat.getClass().isAnnotationPresent(InheritedExample.class)) {
            // Виводимо значення анотації
            System.out.println(cat.getClass().getAnnotation(InheritedExample.class).value());
        }
    }
}
