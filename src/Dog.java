public class Dog extends Animal {

    private String color;

    public Dog(int age, int numberOfLegs, boolean vegetarian,String color) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String bark (){
        return "bark";

    }
    public String toString(){
        return super.toString() + " " + color;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(5, 4, false, "maro" );
        System.out.println("age " + dog1.getAge() + " //legs " + dog1.getNumberOfLegs() + " //vegetarian " + dog1.isVegetarian() + " //color " + dog1.getColor());
        Dog dog2 = new Dog( 10, 4, false,"alb");
        Animal dog3 = dog2;
        System.out.println("age " + dog3.getAge() + " //legs " + dog3.getNumberOfLegs() + " //vegetarian " + dog3.isVegetarian());
        System.out.println(dog1.bark());
        System.out.println(dog2.toString());
        Dog beagle = new Dog(3, 4, false, "cu pete");
        Animal cow = new Animal(9, 4, true);
        Animal beagle1 = beagle;
        System.out.println(beagle.toString());
        System.out.println(cow.toString());



    }
}
