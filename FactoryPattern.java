/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;
import java.util.Scanner;

/**
 *
 * @author Dhruboo
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip aShip;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of enemy ship (U/R/B)");
        String str = sc.nextLine();
        aShip = shipFactory.EnemyShipBuild(str);
        if(aShip!=null){
            DoStuff(aShip);
        }
        else System.out.print("Please enter U, R, or B next time");
    }



    public static void DoStuff(EnemyShip ship){
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();

    }
    
}
