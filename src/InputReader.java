import org.lwjgl.input.Keyboard;

/**
 * Created by gabriel on 4/11/17.
 */
public class InputReader implements Runnable {
   private Main parent;

   public InputReader(Main parent) {
      this.parent = parent;
   }

   @Override
   public void run() {
      while (!parent.getExit()) {
         if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
            parent.setExit();
            break;
         }
      }
   }
}
