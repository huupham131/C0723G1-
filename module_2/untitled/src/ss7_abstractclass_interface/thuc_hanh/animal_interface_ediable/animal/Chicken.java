package ss7_abstractclass_interface.thuc_hanh.animal_interface_ediable.animal;

public class Chicken  extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
