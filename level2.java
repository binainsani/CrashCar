import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    public int count = 0;
    static int nyawa = 3;
    static int score = 0;
    static papanscore2 scores = null;
    static PapanNyawa2 lives = null;
    mobil2 car = new mobil2();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa2.class, papanscore2.class,Crash.class,mobil2.class,other_car2.class,flower2.class,Asphalt.class,Tree2.class,Rock2.class,Background.class);
        
        scores = new papanscore2();
        addObject(scores,486,50); 
        scores.setScore(0);
        
        lives = new PapanNyawa2();
        addObject(lives,85,54); 
        lives.setLives(nyawa);
        
        prepare();
    }
    
    public void act(){
        count++;
        
        if (score < 20){
            if (count==80) {
                summonMobil();
                summonflower2();
                count=0;
           }
        }
        
        if (score == 20) {
           Greenfoot.setWorld(new BridgeWorld2());
        }
    }
    
    private void prepare()
    {
        
        Asphalt asphalt = new Asphalt();
        addObject(asphalt, 290, 37);
        Asphalt asphalt2 = new Asphalt();
        addObject(asphalt2, 298, 114);
        asphalt2.setLocation(290, 106);
        Asphalt asphalt3 = new Asphalt();
        addObject(asphalt3, 295, 199);
        asphalt3.setLocation(290, 179);
        Asphalt asphalt4 = new Asphalt();
        addObject(asphalt4, 300, 252);
        asphalt4.setLocation(291, 248);
        Asphalt asphalt5 = new Asphalt();
        addObject(asphalt5, 348, 306);
        asphalt5.setLocation(292, 315);
        Asphalt asphalt6 = new Asphalt();
        addObject(asphalt6, 298, 389);
        asphalt6.setLocation(293, 380);
        asphalt.setLocation(289, 25);
        asphalt2.setLocation(289, 76);
        Asphalt asphalt7 = new Asphalt();
        addObject(asphalt7, 364, 159);
        asphalt5.setLocation(293, 330);
        asphalt4.setLocation(293, 281);
        asphalt3.setLocation(293, 231);
        asphalt2.setLocation(289, 75);
        asphalt7.setLocation(289, 125);
        Asphalt asphalt8 = new Asphalt();
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
        addObject(car, 300, 363);
        car.setLocation(292, 359);
        Tree2 tree9 = new Tree2();
        addObject(tree9, 567, 53);
        other_car2 other_car = new other_car2();
        addObject(other_car, 143, 72);
        asphalt8.setLocation(289, 175);
        asphalt3.setLocation(289, 225);
        asphalt4.setLocation(289, 275);
        car.setLocation(200, 358);
        asphalt5.setLocation(289, 325);
        asphalt6.setLocation(289, 375);
        car.setLocation(291, 360);
        car.setLocation(221, 349);
        removeObject(car);
        mobil2 car2 = new mobil2();
        addObject(car2, 342, 347);
        car2.setLocation(297, 359);
        tree6.setLocation(531, 164);
        Rock2 rock = new Rock2();
        addObject(rock, 450, 162);
        Rock2 rock2 = new Rock2();
        addObject(rock2, 42, 209);
        Rock2 rock3 = new Rock2();
        addObject(rock3, 151, 378);
    }
    
    public void summonMobil(){
           addObject(new other_car2(),Greenfoot.getRandomNumber(380)+100,0);
    }
        
    public void summonflower2(){
            addObject(new flower2(),Greenfoot.getRandomNumber(380)+100,0);
    }
    
    public void die(){
        addObject(car,300, 363);
    }
    
}

