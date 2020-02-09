import java.io.*;
import java.util.*;
public class Pokemon{
    private int level;
    private int maxhp;
    public int hp; 
    private int exp;
    private int attack;
    private int defense;

    public Pokemon()
    {
        level=1;
        maxhp=10;
        hp=maxhp;
        exp= 0;
        defense =2;
    }
    public void attack() 
    {   
        hp = hp - 10;
    }
}
    