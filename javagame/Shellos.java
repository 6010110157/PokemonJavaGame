public class Shellos extends Monster {

    public Shellos() {
        super("Shellos");
        maxHp = 60;
        hp = maxHp;
        exp = 20;
        level = 5;
        dmg = 20;
        dropRate = 80;
        itemDrop = new Potion();
        pic = "Shellos.png";
    }
    
}