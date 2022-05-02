import javax.swing.*;

public class Window extends JFrame implements Runnable {

    public Window() {
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void update(double dt) {
        System.out.println("" + dt + "seconds passed since the last frame");
        System.out.println(1 / dt + "fps");
    }

    public void run() {
        double lastFramTime = 0.0;
        while (true) {
            double time = Time.getTime();
            double deltaTime = time - lastFramTime;
            lastFramTime = time;

            update(deltaTime);

            try {
                Thread.sleep(30);
            } catch (Exception e) {
            }
        }
    }
}
