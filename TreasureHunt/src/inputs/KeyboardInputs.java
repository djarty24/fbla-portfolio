
package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_W:
			break;
			
		case KeyEvent.VK_A:
			break;
			
		case KeyEvent.VK_S:
			break;
			
		case KeyEvent.VK_D:
			break;
			
		};
	}

}
