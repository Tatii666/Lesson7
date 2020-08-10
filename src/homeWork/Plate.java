package homeWork;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }

    }

    public void increaseFood(int amount) {
        food += amount;
    }

//    public void info() {
//        if(food >= 0) {
//            System.out.println("Plate: " + food);
//        } else {
//            System.out.println("Food is finished!");
//        }
//    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }


}
