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
public class Spell extends Card implements SpellAction{
    public String info;
    
    public void setInfo(String info){
        this.info = info;
    }
    
    public String getInfo(){
        return info;
    }

    @Override
    public void decreaseAttack(String name, int attack) {
        System.out.println(name+"Attack - 200");
    }

    @Override
    public void decreaseDefend(String name, int defend) {
        System.out.println(name+"defend - 200");
    }

    @Override
    public void decreaseLP(String name, int LP) {
        System.out.println(name+"Live Point - 200");
    }
    
}
