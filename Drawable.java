import java.awt.Graphics;


public interface Drawable {
    
    /**
     * Draws the object onto the specified Graphics object
     * 
     * @param g the graphics object on which to draw
     */
    public abstract void draw(Graphics g);
}
