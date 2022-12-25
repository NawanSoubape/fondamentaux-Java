package ihm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.tools.Tool;

import metier.Produit;
import metier.ProduitMetierImpl;

public class ProduitSwing extends JFrame {
	private JLabel JlabelMotCle = new JLabel("Mot clé");
	private JTextField JtextFieldMC = new JTextField(10);
	private JButton JbuttonChercher = new JButton("Chercher");
	private JTable JtableProduits  = new JTable();
	private ProduitModel jTableModel;
	
	public ProduitSwing() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel JpanelN = new JPanel();
		JpanelN.setLayout(new FlowLayout());
		JpanelN.add(JlabelMotCle);
		JpanelN.add(JtextFieldMC);
		JpanelN.add(JbuttonChercher);
		this.add(JpanelN,BorderLayout.NORTH);
		
		JPanel JpanelC = new JPanel();
		jTableModel = new ProduitModel();
		JtableProduits = new JTable(jTableModel);
		JScrollPane jScrollPane = new JScrollPane(JtableProduits);
		JpanelC.add(jScrollPane);
		JpanelC.setLayout(new GridLayout());
		this.add(JpanelC,BorderLayout.CENTER);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		
		JbuttonChercher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mc = JtextFieldMC.getText();
				ProduitMetierImpl metier = new ProduitMetierImpl();
				List<Produit> prods = metier.produitsParMC(mc);
				jTableModel.setData(prods);
				
			}
		});
	}
	
	public static void main(String[] args) {
		new ProduitSwing();
	}
	
	
	
	
}
