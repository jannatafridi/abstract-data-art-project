import org.code.theater.*;
import org.code.media.*;
  /*
   * represents a scene that is gonna be played in the Theater using data frm
   */
public class DataScene extends Scene {

private Cat[] cats; //1d array of cat objects

  /*
   * constructor
   */ 
  public DataScene() {
    cats = createCats();
  }
    /*
     * returns d array of cat object
    */ 
  public Cat[] createCats(){
  String[] breedArray = FileReader.toStringArray("breeds.txt");
  int[] minlifespanArray = FileReader.toIntArray("minlifespan.txt");
  int[] maxlifespanArray = FileReader.toIntArray("maxlifespan.txt");

Cat[] catsArray = new Cat[breedArray.length];
    for (int i = 0; i < catsArray.length; i++) {
      catsArray[i] = new Cat(breedArray[i], minlifespanArray[i], maxlifespanArray[i]);
    }
return catsArray;
  }

  /*
   * creates my scene
   */
  public void drawScene(){
    int randomIndex = (int)(Math.random() * cats.length);
    Cat c = cats[randomIndex];

    int randomLifespan = c.getMinLifespan() + (int) (Math.random() * (c.getMaxLifespan() - c.getMinLifespan() +1));
    
    clear("black"); // black bg
    pause(2);
    /*
     * picks random cat depending on the breed's minimum life span
     */
    if(c.getMinLifespan() > 10) {
      playSound("mixkit-sweet-kitty-meow-93.wav"); //plays cat meowing
      drawImage("abysinian.png", 150, 60, 120); //draws image for cat
      setTextStyle(Font.SERIF, FontStyle.BOLD); //changes the font and boldens the letters
      setTextColor("white"); //text color is white
    } else if (c.getMinLifespan() <= 10) {
      playSound("mixkit-sweet-kitty-meow-93.wav"); //plays cat meowing
      drawImage("cutecat.png", 150, 60, 120); //draws image of black cat
      setTextStyle(Font.SERIF, FontStyle.BOLD); //changes the font and boldens the letters
      setTextColor("white"); //text color is white
    }
    drawText(c.toStringBreed(), 30, 200);
    drawText(c.toStringMinLifespan(), 30, 230);
    drawText(c.toStringMaxLifespan(), 30, 260);
    setTextHeight(9);
    System.out.println(c);
    
  }
}