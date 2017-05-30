/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Gumilar F D
 * @param <T>
 */
public class Setting <T> {
    private T name,lp,equip,info,attack,defend;
    public void setName(T name){
        this.name = name;
    }
    public void setLp(T lp){
        this.lp = lp;
    }
    
    public void setEquip(T equip){
        this.equip = equip;
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public void setAttack(T attack){
        this.attack = attack;
    }
    
    public T getAttack(){
        return attack;
    }

    public void setDefend(T defend){
        this.defend = defend;
    }

    public T getDefend(){
        return defend;
    }    
}
