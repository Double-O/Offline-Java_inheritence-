/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author Dhruboo
 */
public class EnemyShipFactory {
    public EnemyShip EnemyShipBuild(String name){
        if(name.equals("U")) return new UfoEnemyShip();
        else if (name.equals("R")) return new RocketEnemyShip();
        else if (name.equals("B"))return new BIGUFOEnemyShip();
        else return null;
    }
}
