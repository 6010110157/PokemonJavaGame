public class Hoothoot extends Monster {

    public Hoothoot() {
        super("Hoothoot");
        maxHp = 60;
        hp = maxHp;
        exp = 20;
        level = 5;
        dmg = 20;
        dropRate = 80;
        itemDrop = new Potion();
        pic = "Hoothoot.png";
    }
    
}