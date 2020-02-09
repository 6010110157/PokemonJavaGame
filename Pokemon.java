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
        exp=exp+10;
    }
    public int getLevel(){
        return level;
    }
    public int getExp(){
        return exp;
    }
    public int getHp(){
        return hp;
    }
}
    