import java.io.*;
 
public class dotstarTest {

    public static void main(String args[]) throws IOException, InterruptedException {
        int num_leds = 144;
        int i = 0;
        DotStar strip = new DotStar(num_leds);
        while(true){
          strip.setPixelColor((((i-1)%num_leds)+num_leds)%num_leds, 0, 0, 0);
          strip.setPixelColor(i, 255, 0, 0);
          strip.show();
          i=(i+1)%num_leds;
          Thread.sleep(1);
        }
    }
    
    
}
