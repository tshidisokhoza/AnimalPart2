import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTests {
    Cat cat = new Cat();
    Dog dog= new Dog();
    @Test
    void TestDogSound(){


        assertTrue("barks".equalsIgnoreCase(dog.sound()));

    }
    @Test
    void TestDogEats(){


        assertTrue("Food".equalsIgnoreCase(dog.eat()));
    }
    @Test
    void TestCatSound(){

        assertTrue("Meow".equalsIgnoreCase(cat.sound()));

    }
    @Test
    void TestCatEats(){


        assertTrue("Food".equalsIgnoreCase(cat.eat()));
    }




}