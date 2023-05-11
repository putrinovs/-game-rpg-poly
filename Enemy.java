public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy bergerak !!!");
    }
    public void move(int langkah) {
        System.out.println("Enemy berjalan sebanyak "+langkah);
    }

}
