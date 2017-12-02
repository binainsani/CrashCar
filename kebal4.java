import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kebal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kebal4 extends levell4
{
    /**
     * Act - do whatever the Kebal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deathtimer = 0; 
    
    private GreenfootImage Yaris; 
    
    public kebal4() //creation code, sets two variables with the two images
    {
        Yaris = getImage(); 
    }

    public void act() 
    {
        deathtimer++;
        if (deathtimer > 40) {
            ((level4) getWorld()).die();
            getWorld().removeObject(this);
        } else {
            setImage(Yaris);
        }
        }
            
    }
