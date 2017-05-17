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
public class Hero {
    private String name;
    private String equip;
    public int lp;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setEquip(String equip){
        this.equip = equip;
    }
    
    public String getEquip(){
        return equip;
    }
    
    public void setLp(int lp){
        this.lp = lp;
    }
    
    
    
    
}
