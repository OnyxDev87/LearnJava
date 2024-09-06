import javax.swing.*

public class DrawingTester {
    public static main(String[] args) {
        int w = 640;
        int h = 480;

        JFrame f = new JFrame();
        f.setSize(w, h);
        f.setTitle("Drawing in Java");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}