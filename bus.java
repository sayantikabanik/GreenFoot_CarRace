import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bus extends Actor
{
    /**
     * Act - do whatever the bus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //always there is Greenfoot(here f is small letter) 
        move(Greenfoot.getRandomNumber(20));
        if(isTouching(red.class))
        {
            turn(10);
             getWorld().showText("gameover",300,50);
            
 
    }    
}
}