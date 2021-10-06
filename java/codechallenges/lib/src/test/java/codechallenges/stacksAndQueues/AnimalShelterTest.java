package codechallenges.stacksAndQueues;

import codechallenges.linkedList.LinkedList;
import codechallenges.stacksAndQueues.utils.animalShelter.Animal;
import codechallenges.stacksAndQueues.utils.animalShelter.AnimalShelter;
import org.apache.commons.math3.exception.util.ExceptionContextProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalShelterTest {
  @Test void create_animal_shelter() {
    AnimalShelter newAnimalShelter = new AnimalShelter();
    assertEquals(true, newAnimalShelter instanceof AnimalShelter, "Should create a new Animal Shelter");
    assertEquals(true, newAnimalShelter.dogs instanceof Queue, "Should create a new Animal Shelter");
    assertEquals(true, newAnimalShelter.cats instanceof Queue, "Should create a new Animal Shelter");
  }

  @Test void add_dog() throws Exception {
    AnimalShelter newAnimalShelter = new AnimalShelter();
    Animal newDog = new Animal("dog","dogbae");
    newAnimalShelter.enqueue(newDog);
    assertEquals("dogbae", newAnimalShelter.dogs.peek().name, "Should create a new Cat to cat queue");

  }

  @Test void add_cat() throws Exception {
    AnimalShelter newAnimalShelter = new AnimalShelter();
    Animal newCat = new Animal("cat","meowsy");
    newAnimalShelter.enqueue(newCat);
    assertEquals("meowsy", newAnimalShelter.cats.peek().name, "Should create a new Dog to dog queue");
  }

  @Test void dequeue() throws Exception {
    AnimalShelter newAnimalShelter = new AnimalShelter();
    Animal newDog = new Animal("dog","dogbae");
    Animal newCat = new Animal("cat","meowsy");
    newAnimalShelter.enqueue(newDog);
    newAnimalShelter.enqueue(newCat);
    Animal dequeuedDog = newAnimalShelter.dequeue("dog");
    Animal dequeuedCat = newAnimalShelter.dequeue("cat");
    assertEquals("dog", dequeuedDog.type, "Should create a new Dog to dog queue");
    assertEquals("cat", dequeuedCat.type, "Should create a new Dog to dog queue");
  }
}
