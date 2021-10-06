package codechallenges.stacksAndQueues.utils.animalShelter;

import java.util.Locale;

public class Animal {
  public String type;
  public String name;

  public Animal(String animal, String name){
    if(animal.toLowerCase() == "dog" || animal.toLowerCase() == "cat"){
      this.type = animal;
      this.name = name;
    }
  }
}
