public class Main {
    public static void main(String[] args) {
        Home home = new Home();
                Animal dog1 = new Dog();
                dog1.setName("rax");
                Animal dog2 = new Dog();
                Animal cat = new Cat();
                cat.setName("Storm");
                cat.sound();
                dog1.sound();

        home.makeAllSounds() ;// this doesn't do anything
        home.adoptPet(dog1);
        home.adoptPet(dog1);
        home.makeAllSounds();
// this prints:
// Dog barks

        home.adoptPet(cat);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows

        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}
