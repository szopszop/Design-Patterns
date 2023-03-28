package design.patterns.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "Hero";
    private static GameEngine instance;
    private GameEngine() {
    }

    public static GameEngine getInstance() {
        if (instance == null) {

            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    public void run() {
        while (true) {
            // wait for input
            // change game state
        }
    }
}
