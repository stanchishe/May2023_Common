public class Doggo {
    public final String subClassOfAnimals = "mammal";
    final private String name;
    private int age;

    // The default class constructor, can be omitted!
    // If omitted it can no longer be used once another custom constructor is added!
    // public Doggo() {};
    // Next constructors, classes support more than one. Method overloading rules apply!!!
    // Second Doggos constructor
    public Doggo(String name) {
        this.name = name;
        this.age = -1;
    };
    // Third Doggos constructor
    public Doggo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSubClassOfAnimals() {
        return subClassOfAnimals;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Dogs do not have negative age!");
            return;
        }
        if (age < this.age) {
            System.out.println("Dogs do not age backwards!");
            return;
        }
        this.age = age;
    }
}

class AppStartClass {
    public static void main(String[] args) {
        Doggo doggoMax = new Doggo("Max");
        Doggo doggoJeff = new Doggo("Jeff", 5);

        System.out.println(doggoMax.getName());
        System.out.println(doggoJeff.getName());

        System.out.println(doggoJeff.getSubClassOfAnimals());
        System.out.println(doggoJeff.getSubClassOfAnimals());

        System.out.println("Doggo " + doggoMax.getName() + " is a " + doggoMax.getSubClassOfAnimals());
        System.out.println("Doggo " + doggoJeff.getName() + " is a " + doggoJeff.getSubClassOfAnimals());

        if (doggoJeff.getAge() >= 0)
            System.out.println(
                "Doggo " + doggoJeff.getName() + " is a " + doggoJeff.getSubClassOfAnimals() + " and he is " + doggoJeff.getAge() + " yo."
        );
        else System.out.println(doggoJeff.getName() + "'s age is not set!");

        if (doggoMax.getAge() >= 0)
            System.out.println(
                "Doggo " + doggoMax.getName() + " is a " + doggoMax.getSubClassOfAnimals() + " and he is " + doggoMax.getAge() + " yo."
        );
        else System.out.println(doggoMax.getName() + "'s age is not set!");

        // Change the age of Max here, can be used for other Doggo objects too.
        doggoMax.setAge(2);
        if (doggoMax.getAge() >= 0)
            System.out.println(
                "Doggo " + doggoMax.getName() + " is a " + doggoMax.getSubClassOfAnimals() + " and he is " + doggoMax.getAge() + " yo."
        );
        else System.out.println(doggoMax.getName() + "'s age is not set!");

        //Change the age of Jeff here.
        doggoJeff.setAge(4);
        if (doggoJeff.getAge() >= 0)
            System.out.println(
                    "Doggo " + doggoJeff.getName() + " is a " + doggoJeff.getSubClassOfAnimals() + " and he is " + doggoJeff.getAge() + " yo."
            );
        else System.out.println(doggoJeff.getName() + "'s age is not set!");
    }
}
