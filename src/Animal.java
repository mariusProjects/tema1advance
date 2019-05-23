public class Animal {

    public int age;
    public int numberOfLegs;
    public boolean vegetarian;

    public Animal (int age, int numberOfLegs, boolean vegetarian) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
    public String toString(){
        return age + " " + numberOfLegs + " " + vegetarian;
    }

    public static void main(String[] args) {
        Animal chicken = new Animal(2, 2, true);
        System.out.println("age " + chicken.getAge() + " //legs " + chicken.numberOfLegs + " //vegetarian " + chicken.isVegetarian());
        System.out.println(chicken.toString());


    }
}






