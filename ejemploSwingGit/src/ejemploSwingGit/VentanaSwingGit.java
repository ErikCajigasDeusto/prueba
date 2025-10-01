package ejemploSwingGit;

import javax.swing.JFrame;

public class VentanaSwingGit extends JFrame{
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hola swing");
		setSize(640,480);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VentanaSwingGit();
	}

}
