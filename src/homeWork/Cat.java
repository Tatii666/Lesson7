package homeWork;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if(plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
//        System.out.println(name + " eat");
//        plate.decreaseFood(appetite);

    }

    @Override
    public String toString() {
        return "Cat{"  + name +
                ", appetite=" + appetite +
                ", isFull=" + isFull +
                '}';
    }

    //    public void fear(Dog dog) {
//        System.out.println(name + " fear " + dog.getName());
//    }

}
