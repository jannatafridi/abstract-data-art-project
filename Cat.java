import org.code.theater.*;
import org.code.media.*;

  /*
   * represents the cat with name & max lifespan
   */
public class Cat {
  private String breed; //cat breed
  private int minlifespan; //min lifespan of cat in years
  private int maxlifespan; //max lifespan of cat in years
  /*
   * constructor
   */
  public Cat(String breed, int minlifespan, int maxlifespan) {
    this.breed = breed;
    this.minlifespan = minlifespan;
    this.maxlifespan = maxlifespan;

  }
  
  /*
   * accessor method for the breeds
   */
  public String getBreed() {
    return breed;
  }
  /*
   * accessor method of min lifespan of breed
   */
  public int getMinLifespan() {
    return minlifespan;
  }
  /*
   * accessor for max lifespan of breed
   */
 public int getMaxLifespan() {
    return maxlifespan;
  }
  /*
   * to string method
   */ 
  public String toString(){
    return "Cat Breed: " + breed + "\n" +
      "MIN Lifespan: " + minlifespan + "\n" +
      "MAX Lifespan: " + maxlifespan;
      }
  public String toStringBreed() {
    return "Cat Breed: " + breed;
  }
  public String toStringMinLifespan() {
    return "MIN Lifespan: " + minlifespan;
  }
  public String toStringMaxLifespan() {
    return "MAX Lifespan: " + maxlifespan;
  }
}