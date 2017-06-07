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
public interface SpellAction {
    public abstract void decreaseAttack(String name,int attack);
    public abstract void decreaseDefend(String name,int defend);
    public abstract void decreaseLP(String name,int LP);
    
}
