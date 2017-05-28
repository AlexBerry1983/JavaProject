package enclosures;
import animals.*;
import java.util.*;

public class Enclosure {

  private ArrayList<Animal> animals;

  public Enclosure() {
    this.animals = new ArrayList<Animal>();
  }

  public int countAnimals() {
    return animals.size();
  }

}
