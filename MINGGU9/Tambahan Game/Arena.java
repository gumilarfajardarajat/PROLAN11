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
public class Arena {
    private int attack,defend;
    public void setFire(String type,int attack, int defend){
        if("Fire".equals(type)){
            this.attack = attack + 500;
            this.defend = defend + 300;
        }
    }
    
    
     
}
