import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BridgeWorld extends World
{
    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public BridgeWorld()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa.class, PapanScore.class,Crash.class,Car2.class,Cewek.class,Other_car.class,Flower.class,Asphalt2.class,Tree2.class,Rock2.class,Background2.class);
        
        MyWorld.scores = new PapanScore();
        addObject(MyWorld.scores,486,50); 
        MyWorld.scores.setScore(MyWorld.score);
        
        MyWorld.lives = new PapanNyawa();
        addObject(MyWorld.lives,85,54); 
        MyWorld.lives.setLives(MyWorld.nyawa);
        
        Cewek cewek = new Cewek();
        addObject(cewek,485,159);
       
        prepare();
    }
    
    
    public void prepare(){
        Asphalt2 asphalt = new Asphalt2();
        addObject(asphalt, 290, 37);
        Asphalt2 asphalt2 = new Asphalt2();
        addObject(asphalt2, 298, 114);
        asphalt2.setLocation(290, 106);
        Asphalt2 asphalt3 = new Asphalt2();
        addObject(asphalt3, 295, 199);
        asphalt3.setLocation(290, 179);
        Asphalt2 asphalt4 = new Asphalt2();
        addObject(asphalt4, 300, 252);
        asphalt4.setLocation(291, 248);
        Asphalt2 asphalt5 = new Asphalt2();
        addObject(asphalt5, 348, 306);
        asphalt5.setLocation(292, 315);
        Asphalt2 asphalt6 = new Asphalt2();
        addObject(asphalt6, 298, 389);
        asphalt6.setLocation(293, 380);
        asphalt.setLocation(289, 25);
        asphalt2.setLocation(289, 76);
        Asphalt2 asphalt7 = new Asphalt2();
        addObject(asphalt7, 364, 159);
        asphalt5.setLocation(293, 330);
        asphalt4.setLocation(293, 281);
        asphalt3.setLocation(293, 231);
        asphalt2.setLocation(289, 75);
        asphalt7.setLocation(289, 125);
        Asphalt2 asphalt8 = new Asphalt2();
        addObject(asphalt8, 295, 183);
        asphalt8.setLocation(289, 174);
        asphalt3.setLocation(288, 224);
        asphalt3.setLocation(289, 224);
        asphalt4.setLocation(289, 274);
        asphalt5.setLocation(288, 323);
        asphalt5.setLocation(289, 324);
        asphalt6.setLocation(289, 374);
        Tree2 tree = new Tree2();
        addObject(tree, 443, 86);
        Tree2 tree2 = new Tree2();
        addObject(tree2, 521, 245);
        Tree2 tree3 = new Tree2();
        addObject(tree3, 106, 123);
        Tree2 tree4 = new Tree2();
        addObject(tree4, 153, 231);
        Tree2 tree5 = new Tree2();
        addObject(tree5, 68, 351);
        Tree2 tree6 = new Tree2();
        addObject(tree6, 389, 200);
        Tree2 tree7 = new Tree2();
        addObject(tree7, 507, 356);
        Tree2 tree8 = new Tree2();
        addObject(tree8, 32, 45);
        Car2 car = new Car2();
        addObject(car, 300, 363);
        car.setLocation(292, 359);
        Tree2 tree9 = new Tree2();
        addObject(tree9, 567, 53);
        asphalt8.setLocation(289, 175);
        asphalt3.setLocation(289, 225);
        asphalt4.setLocation(289, 275);
        car.setLocation(200, 358);
        asphalt5.setLocation(289, 325);
        asphalt6.setLocation(289, 375);
        car.setLocation(291, 360);
        car.setLocation(221, 349);
        removeObject(car);
        Car2 car2 = new Car2();
        addObject(car2, 342, 347);
        car2.setLocation(297, 359);
        tree6.setLocation(531, 164);
        Background2 background = new Background2();
        addObject(background, 154, 40);
        background.setLocation(142, 24);
        Background2 background2 = new Background2();
        addObject(background2, 153, 98);
        background2.setLocation(142, 74);
        Background2 background3 = new Background2();
        addObject(background3, 165, 179);
        background3.setLocation(142, 124);
        Background2 background4 = new Background2();
        addObject(background4, 142, 269);
        background4.setLocation(132, 179);
        Background2 background5 = new Background2();
        addObject(background5, 93, 294);
        background5.setLocation(142, 224);
        Background2 background6 = new Background2();
        addObject(background6, 226, 352);
        background6.setLocation(142, 274);
        Background2 background7 = new Background2();
        addObject(background7, 459, 363);
        background7.setLocation(142, 324);
        Background2 background8 = new Background2();
        addObject(background8, 440, 315);
        background8.setLocation(142, 374);
        Background2 background9 = new Background2();
        addObject(background9, 154, 40);
        background9.setLocation(463, 24);
        Background2 background10 = new Background2();
        addObject(background10, 153, 98);
        background10.setLocation(463, 74);
        Background2 background11 = new Background2();
        addObject(background11, 165, 179);
        background11.setLocation(463, 124);
        Background2 background12 = new Background2();
        addObject(background12, 142, 269);
        background12.setLocation(463, 179);
        Background2 background13 = new Background2();
        addObject(background13, 93, 294);
        background13.setLocation(463, 224);
        Background2 background14 = new Background2();
        addObject(background14, 226, 352);
        background14.setLocation(463, 274);
        Background2 background15 = new Background2();
        addObject(background15, 459, 363);
        background15.setLocation(463, 324);
        Background2 background16 = new Background2();
        addObject(background16, 440, 315);
        background16.setLocation(463, 374);
        Rock2 rock = new Rock2();
        addObject(rock, 450, 162);
        Rock2 rock2 = new Rock2();
        addObject(rock2, 42, 209);
        Rock2 rock3 = new Rock2();
        addObject(rock3, 151, 378);
    }
    
    public void stop(){
        stop();
    }
}
