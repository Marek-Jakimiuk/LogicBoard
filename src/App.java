import java.awt.EventQueue;

public class App {

public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RxtxController LogicRxtx = new RxtxController();
					View window = new View();
					LogicRxtx.listPorts();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}