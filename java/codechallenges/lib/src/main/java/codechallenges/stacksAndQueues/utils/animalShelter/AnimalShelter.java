package codechallenges.stacksAndQueues.utils.animalShelter;

import codechallenges.stacksAndQueues.Queue;

public class AnimalShelter {
  public Queue<Animal> dogs = new Queue<>();
  public Queue<Animal> cats = new Queue<>();

  public void enqueue(Animal newAnimal) throws Exception{
    if(newAnimal.type.toLowerCase() == "dog"){
      dogs.enqueue(newAnimal);
    } else if(newAnimal.type.toLowerCase() == "cat"){
      cats.enqueue(newAnimal);
    } else {
      throw new Exception("Enter a dog or a cat ONLY");
    }
  }

  public Animal dequeue(String animalType) throws Exception{
    if(animalType.toLowerCase() == "dog"){
      if(!dogs.isEmpty()){
        return dogs.dequeue();
      }
    } else if(animalType.toLowerCase() == "cat"){
      if(!cats.isEmpty()){
        return cats.dequeue();
      }
    } else {
      return null;
    }
  }
}
