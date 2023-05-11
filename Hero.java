
public class Hero extends Character {
    @Override
    public void move() {
        System.out.println("Hero bergerak");
    }

    public void move(String arah) {
        System.out.println("Hero berjalan ke arah "+arah);
    }
    
    
    
}