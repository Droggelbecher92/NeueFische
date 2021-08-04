public class Animals implements AnimalLogic{
    private int numberOfLegs;

    public Animals(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void eat() {
        System.out.println("I´m eating");
    }

    @Override
    public void move() {
        System.out.println("I´m moving");
    }

    @Override
    public void shouldIPetIt() {
        System.out.println("I´m moving");
    }

}
