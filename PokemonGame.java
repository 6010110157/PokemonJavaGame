import java.io.*;
import java.util.*;
public class PokemonGame{
public static void main(String[] args)
     {
        Pokemon pokemon = new Pokemon();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Pokemon trainer");
        System.out.println("=========================");
        System.out.println("press 1 to START GAME");
        System.out.println("press 2 to CLOSE GAME");
        System.out.println("=========================");
        
        int bottom = scanner.nextInt();
            if(bottom == 1){
                
                System.out.println("=========How To PLay=========");
                System.out.println("press 1 to FIGHT");
                System.out.println("press 2 to BAG");
                System.out.println("press 3 to POKeMON");
                System.out.println("press 4 to RUN");
                System.out.println("============================");
                
            }
            else if(bottom == 2){
                System.out.println("Good BYE T-T");
            }   
            
    }
}