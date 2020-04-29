public class Torchic extends Monster {

    public Torchic() {
        super("Torchic");
        maxHp = 60;
        hp = maxHp;
        exp = 20;
        level = 5;
        dmg = 20;
        dropRate = 80;
        itemDrop = new Potion();
        pic = "Torchic.png";
    }
    
}