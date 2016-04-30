import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
  
        move(Greenfoot.getRandomNumber(30));
        if(isTouching(red.class))
        {
            turn(20);
           getWorld().showText("gameover",300,50);
        
    }  
}       
}      