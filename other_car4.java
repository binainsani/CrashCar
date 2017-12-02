import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class other_car4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class other_car4 extends levell4
{
    /**
     * Act - do whatever the other_car4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
    World world;
    public void act() 
    {
        setLocation(getX(),getY()+2);
            world = getWorld();
            if (isAtEdge()) {
                world.removeObject(this);
            }
    }    
}
