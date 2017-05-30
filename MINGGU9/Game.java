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
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hero yugi = new Hero();
       Monster darkMagic = new Monster();
       Spell darkHole = new Spell(); 
       Trap torrent = new Trap();
       
       yugi.setName("Yugi");
       yugi.setEquip("Millenium Puzzle");
       
       darkMagic.setName("Dark Magician");
       darkMagic.setType("Monster");
       darkMagic.set(2500,2100);
       
       darkHole.setName("Dark Hole");
       darkHole.setInfo("Destroy all monster on the field");
       
       torrent.setName("Torrential");
       torrent.setInfo("Activated only when a monster is Summoned. Destroy all monsters on the field");
       
       System.out.println("* Hero *");
       System.out.println("Name : "+yugi.getName());
       System.out.println("Equip : "+yugi.getEquip());
       
       System.out.println("* Monster *");
       System.out.println("Name : "+darkMagic.name);
       System.out.println("Attack : "+darkMagic.attack);
       System.out.println("Defend : "+darkMagic.defend);
       
       System.out.println("* Spell *");
       System.out.println("Name : "+darkHole.name);
       System.out.println("Info : "+darkHole.info);
       
       System.out.println("METHOD ACTION TEST :  ");
       Setting <Integer> effect  = new Setting<>();
       
       effect.setAttack(1500);
       darkMagic.attack = effect.getAttack(); 
       effect.setDefend(1000);
       darkMagic.defend = effect.getDefend();        
       
       darkMagic.attack();
       darkMagic.defend();
       
       darkHole.decreaseAttack(darkMagic.name,darkMagic.attack);
       darkHole.decreaseDefend(darkMagic.name,darkMagic.defend);
       darkHole.decreaseLP(yugi.name,yugi.lp);
       
       
    }
    
}
