package src.space;

public class SpaceBase {
    void launch(IStart up) {
        if (!up.startSystem()) {
            System.out.println("Предстартовая проверка провалена! \n");
        } else {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            up.startEngine();
            up.start();
        }
    }
}