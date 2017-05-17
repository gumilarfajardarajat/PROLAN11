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
       darkMagic.setAttack(2500);
       darkMagic.setDefend(2100);
       
       darkHole.setName("Dark Hole");
       darkHole.setInfo("Destroy all monster on the field");
       
       torrent.setName("Torrential");
       torrent.setInfo("Activated only when a monster is Summoned. Destroy all monsters on the field");
       
       System.out.println("* Hero *");
       System.out.println("Name : "+yugi.getName());
       System.out.println("Equip : "+yugi.getEquip());
       
       System.out.println("* Monster *");
       System.out.println("Name : "+darkMagic.getName());
       System.out.println("Attack : "+darkMagic.getAttack());
       System.out.println("Defend : "+darkMagic.getDefend());
       
       System.out.println("* Spell *");
       System.out.println("Name : "+darkHole.getName());
       System.out.println("Info : "+darkHole.getInfo());
       
       
       
    }
    
}
