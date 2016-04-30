import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg extends World
{

    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new car(),50,100);
        addObject(new bus(),50,350);
        addObject(new red(),500,100);
        addObject(new red(),200,350);
    }
}
