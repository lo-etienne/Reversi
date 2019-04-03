package MainGame;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenu extends StateBasedGame{

	public MainMenu(String name) {
		super(name);
	}

	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new MainMenu("Reversi"));
		
		app.setDisplayMode(800, 600, false);
		app.setAlwaysRender(true);
		
		app.start();
	}
	
	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		this.addState(new GameState());
		//eferfer
	}
}
