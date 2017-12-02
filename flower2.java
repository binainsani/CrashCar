import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flower2 extends Levell2
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
         setLocation(getX(),getY()+4);
         Actor mobil = getOneIntersectingObject(mobil2.class);
         world = getWorld();
         if (isAtEdge()) {
             world.removeObject(this);
         }
         if(mobil != null){
            getWorld().removeObject(this);
            level2.score+=1;
            level2.scores.setScore(level2.score);
         }
    }    
}