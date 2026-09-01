public class DragonMain {
    public static void main(String[] args) {
        Dragon d1 = new Dragon();
        d1.changeDirection(4);
        d1.move(5);
        d1.printStatus();

        Dragon d2 = new Dragon();
        d2.changeDirection(13);
        d2.move(3);
        d2.printStatus();
    }
}
