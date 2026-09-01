public class Dragon {
    int x;
    int y;
    int direction;

public void changeDirection(int newDirection) {
    if (newDirection >= 1 && newDirection <= 4) {
        direction = newDirection;
    } else {
System.out.println("Arah tidak valid!"); } }

public void move(int steps) {
    switch (direction) {
        case 1: y += steps; break; //atas
        case 2: x += steps; break; //kanan
        case 3: y -= steps; break; //bawah
        case 4: x -= steps; break; //kiri
    default: System.out.println("Arah belum ditentukan!"); } }

    public void printStatus() {
        System.out.println("Posisi: (" + x + "," + y + ")");
        System.out.println("Arah: " + direction);
        System.out.println("=========="); } }