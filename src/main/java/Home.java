import java.util.ArrayList;

public class Home {

    ArrayList<Animal> home = new ArrayList<>();
    //Adds to list if animal does not exist else adds the animal into the home list
    public void adoptPet(Animal animal){
        if(home.contains(animal)){
            System.out.printf("Pet already exist");
        }else {
            home.add(animal);
            System.out.println("Added Successfully");
        }

    }
    // does nothing.
    public void makeAllSounds(){
    }
}
