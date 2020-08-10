package homeWork;

public class Main {
    public static void main(String[] args) {

        System.out.println("List of cats: ");

        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murzik", 15),
                new Cat("Kessy", 7),
                new Cat("Maksik",10)
        };

        Plate plate = new Plate(10);

        for(Cat cat : cats){
            System.out.println(cat);
        }
        System.out.println("\n" + plate);

        System.out.println("Increase food by 100");
        plate.increaseFood(30);
        System.out.println(plate);

        System.out.println("Cats take food: ");
        for(Cat cat : cats){
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
//        Dog dog = new Dog("Graf");
//        dog.scare(cat);



    }
}
