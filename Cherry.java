
public class Cherry extends GameItem {
    //the value of all cherries
    private static final int VALUE = 5;
    
    /**
     * Creates a new cherry at the given location
     * @param location
     */
    public Cherry(Location location){
	 	super(location,PacmanGamePanel.CHERRY_IMAGE,VALUE);
    }
}       
