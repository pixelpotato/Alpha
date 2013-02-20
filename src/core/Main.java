package core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.Log;

public class Main extends StateBasedGame {

	public static void main (String[] args) throws SlickException {
		// Create a new game container that contains a scalable game that contains
		// our game
		AppGameContainer game = new AppGameContainer(new ScalableGame(new Main("PixelPotato - Alpha"), 1280, 720, true));
		game.setDisplayMode(1280, 720, true); // width, height, full screen
		game.setVSync(true); // set vertical synchronization
		game.setMouseGrabbed(true); // whether the mouse is visible or not
		game.setTargetFrameRate(60); // maintain 60 frames per second
		game.setShowFPS(true); // whether the current frame rate is shown in the top left
		Log.setVerbose(false); // whether to log game information
		game.start();
	}
	
	public Main(String title) {
		super(title);
	}

	public void initStatesList(GameContainer arg0) throws SlickException {
		
	}
	
}
