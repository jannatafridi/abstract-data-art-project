import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

   /*
    * instantiates a DataScene object to play in Theater
    */
    DataScene scene = new DataScene();

   /*
    * call any DataScene methods to display
    */
    scene.drawScene();

   /*
    * play DataScene in theater
    */
    Theater.playScenes(scene);

    
    
  }
}