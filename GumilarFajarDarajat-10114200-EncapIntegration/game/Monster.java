/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Gumilar F D
 */
public class Monster extends Card { 
    int attack;
    int defend;
    
    public void setAttack(int attack){
        this.attack = attack;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public void setDefend(int defend){
        this.defend = defend;
    }
    
    public int getDefend(){
        return defend;
    }
    
}
