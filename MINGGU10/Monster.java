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
public class Monster extends Card implements MonsterAction { 
    int attack;
    int defend;
    String typeMonster;
    

    
    @Override
    public void attack() {
        System.out.println(name+" Attack : "+attack);
    }

    @Override
    public void defend() {
        System.out.println(name+" Defend : "+defend);
    }

    @Override
    public void set(int attack, int defend, String typeMonster) {
        this.attack = attack;
        this.defend = defend;
        this.typeMonster = typeMonster;
    }


    
    
    
}
