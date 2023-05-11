public class App {
    public static void main(String[] args) {
        System.out.println("Nama : Putri Nov Syawulandari");
        System.out.println("NIM  : 225150607111029");
        System.out.println("");

        //Static polymorphism pada class Hero dan static polymorphism pada class Enemy
        Hero hero = new Hero();
        hero.move();
        hero.move("pusat");
        System.out.println("............................");

        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(10);
        System.out.println("............................");


        //Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character = new Character();
        character.move();
        System.out.println("............................");
        character = new Hero();
        character.move();
        System.out.println("............................");
        character = new Enemy();
        character.move();
        System.out.println("............................");
        character = new Witch();
        character.move();
        System.out.println("............................");
        character = new Fighter();
        character.move();
        System.out.println("----------------------------");

        

        //Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character character = new Witch();
        character.move();
        System.out.println("-----------------------------");
        Character fighter = (Fighter)character;
        fighter.move();
        
        
        

        
    }
}
