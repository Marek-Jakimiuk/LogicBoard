import gnu.io.CommPortIdentifier;

public class RxtxController {

	
	public RxtxController() {
	}
	
	
	public  void listPorts()
    {
        java.util.Enumeration<CommPortIdentifier > portEnum = CommPortIdentifier.getPortIdentifiers();
        while ( portEnum.hasMoreElements() ) 
        {
            CommPortIdentifier portIdentifier = portEnum.nextElement();
            System.out.println(portIdentifier.getName() );
        }        
    }
}
