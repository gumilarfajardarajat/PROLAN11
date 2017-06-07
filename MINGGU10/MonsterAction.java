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
public interface MonsterAction {
    public abstract void attack();
    public abstract void defend();
    public abstract void set(int attack,int defend, String typeMonster);
}
