import javax.swing.JFrame;

public class View {
		
		JFrame frame;

		public View() {
			initialize();
		}
		
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(250, 150, 400,400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


