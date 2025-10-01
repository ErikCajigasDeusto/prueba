package ejemploSwingGit;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

public class VentanaSwingGit extends JFrame{
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hola swing");
		setSize(640,480);
		setLocationRelativeTo(null);
		
		JMenuBar barraMenu = new JMenuBar();
		//LAs barras no se añade como un componente sino de la siguiente forma
		setJMenuBar(barraMenu);
		
		JMenu menuFichero = new JMenu("FIchero");
		barraMenu.add(menuFichero);
		
		
		JMenuItem itemMostrar = new JMenuItem("Mostrar");
		menuFichero.add(itemMostrar);
		
		JMenuItem itemLimpiar = new JMenuItem("Limpiar");
		menuFichero.add(itemLimpiar);
		
		JMenuItem itemSalir = new JMenuItem("Salir");
		menuFichero.add(itemSalir);
		
		JTabbedPane panelTabs = new JTabbedPane();
		add(panelTabs, BorderLayout.CENTER);
		
		panelTabs.addTab("Datos personales", new JPanel());
		panelTabs.addTab("Preferencias", new JPanel());
		panelTabs.addTab("Comentarios", new JPanel());
		
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
