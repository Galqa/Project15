package package2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter // анотація з інструменту Lombok для генерації гетера
@Setter // анотація з інструменту Lombok для генерації сетера
@AllArgsConstructor //  анотація з інструменту Lombok для генерації конструктора з усіма параметрами
@Deprecated // анотація з інструменту Lombok для помітки застарівших методів або типів

// Створюємо клас Dog, який успадковує від Animal
class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super.setName(name);
        this.breed = breed;
    }
    public String toString() {
        return "Dog(name=" + super.getName() + ", breed=" + breed + ")";
    }
}
class NewDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Fish", "Dachshund");
        System.out.println(dog);

        // Перевіряємо, чи об'єкт має анотацію @InheritedExample
        if (dog.getClass().isAnnotationPresent(InheritedExample.class)) {
            // Виводимо значення анотації
            System.out.println(dog.getClass().getAnnotation(InheritedExample.class).value());
        }
    }
}


