package src.space;

public class Start {

    public static void main(String[] args) {
        SpaceBase base = new SpaceBase();
        base.launch(new Shuttle());
        base.launch(new SpaceX());
        base.launch(new Proton());
    }
}