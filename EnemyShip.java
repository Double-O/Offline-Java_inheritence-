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
public abstract class EnemyShip {
    private String name;
    private double dmg;
    public void setName(String s){
        name = s;
    }
    public  void setDmg(double x){
        dmg = x;
    }
    public String getName(){
        return  name;
    }
    public double getDmg(){
        return dmg;
    }
   

    public void displayEnemyShip(){
                System.out.println(getName() + " is on the screen");

    }
    
    public void followHeroShip(){

        System.out.println(getName() + " is following the hero");

    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDmg() + " damage to hero");
    }

}