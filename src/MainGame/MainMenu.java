package MainGame;




import org.newdawn.slick.Color;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class MainMenu extends BasicGameState{


	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		arg2.setColor(Color.cyan);
		arg2.fillRect(0, 0, 800, 600);
		arg2.setColor(Color.white);
		arg2.drawString("Main menu", 50, 50);
		arg2.drawString("press H for Human vs Human", 70, 90);
		arg2.drawString("press M for Human vs Machine", 70, 110);
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame arg1, int arg2) throws SlickException {
		if(container.getInput().isKeyDown(Input.KEY_H)) {
			arg1.enterState(1,new FadeOutTransition(),new FadeInTransition());
		}else if(container.getInput().isKeyDown(Input.KEY_M)){
			arg1.enterState(2,new FadeOutTransition(),new FadeInTransition());
		}else if(container.getInput().isKeyDown(Input.KEY_Q)) {
			container.exit();
		}
		
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
