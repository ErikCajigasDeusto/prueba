package ejemploSwingGit;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
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
		
		JMenu menuFichero = new JMenu("File");
		barraMenu.add(menuFichero);
		
		
		JMenuItem itemMostrar = new JMenuItem("Mostrar");
		menuFichero.add(itemMostrar);
		
		JMenuItem itemLimpiar = new JMenuItem("Clean");
		menuFichero.add(itemLimpiar);
		
		JMenuItem itemSalir = new JMenuItem("Salir");
		menuFichero.add(itemSalir);
		
		JTabbedPane panelTabs = new JTabbedPane();
		add(panelTabs, BorderLayout.CENTER);
		JPanel personal = new JPanel();
		JPanel preferencias = new JPanel();
		JPanel comentarios = new JPanel();
		
		panelTabs.addTab("Datos personales", personal);
		panelTabs.addTab("Preferencias", preferencias);
		panelTabs.addTab("Comentarios", comentarios);
		
		 Border lineBorder = BorderFactory.createLineBorder(Color.RED);
	     Border titledBorder = BorderFactory.createTitledBorder(lineBorder, "datos");
	     personal.setBorder(titledBorder);
		
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

