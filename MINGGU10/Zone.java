/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Gumilar F D
 * @param <M>
 * @param <T>
 * @param <ST>

 */
public class Zone <M> {
    private M name,info;
    private M attack,defend;
    
    public void setName(M name){
        this.name = name;
    }

    public M getName(){
        return name;
    }
    
    public void setInfo(M info){
        this.info = info;
    }
    
    public M getInfo(){
        return info;
    }

    
    public void setAttack(M attack){
        this.attack = attack;
    }
    
    public M getAttack(){
        return attack;
    }

    public void setDefend(M defend){
        this.defend = defend;
    }

    public M getDefend(){
        return defend;
    }    
}
