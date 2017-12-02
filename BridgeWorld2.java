import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BridgeWorld2 extends World
{
    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public BridgeWorld2()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa2.class, papanscore2.class,Crash.class,Mobil.class,Cewek.class,other_car2.class,flower2.class,Asphalt2.class,Tree2.class,Rock2.class,Background2.class);
        
        level2.scores = new papanscore2();
        addObject(level2.scores,486,50); 
        level2.scores.setScore(level2.score);
        
        level2.lives = new PapanNyawa2();
        addObject(level2.lives,85,54); 
        level2.lives.setLives(level2.nyawa);
        
        Cewek2 cewek = new Cewek2();
        addObject(cewek,485,159);
       
        prepare();
    }
    
    
    public void prepare(){
        
        
        Mobil car = new Mobil();
        addObject(car, 300, 363);
        car.setLocation(292, 359);
       
        
        car.setLocation(291, 360);
        car.setLocation(221, 349);
        removeObject(car);
        Mobil car2 = new Mobil();
        addObject(car2, 342, 347);
        car2.setLocation(297, 359);
        
        
        
    }
}
