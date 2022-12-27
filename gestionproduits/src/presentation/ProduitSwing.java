package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import metier.Produit;
import metier.ProduitMetierImpl;

public class ProduitSwing extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelMC = new JLabel("Mot clé");
	private JTextField jTexfieldMC = new JTextField(10);
	private JButton jButtonOk = new JButton("Chercher");
	private JTable jtable;
	private ProduitModel produitModel;
	ProduitMetierImpl metier = new ProduitMetierImpl();
	
	public ProduitSwing() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel jpanelN = new JPanel();
		jpanelN.setLayout(new FlowLayout());
		jpanelN.add(jLabelMC);
		jpanelN.add(jTexfieldMC);
		jpanelN.add(jButtonOk);
		this.add(jpanelN, BorderLayout.NORTH);
		
		JPanel JpanelC = new JPanel();
		produitModel = new ProduitModel();
		jtable = new JTable(produitModel);
		JScrollPane jscrollPane = new JScrollPane(jtable);
		JpanelC.setLayout(new GridLayout());
		this.add(jscrollPane, BorderLayout.CENTER);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		
		jButtonOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mc = jTexfieldMC.getText();
				List<Produit> prods = metier.getProduitsParMC(mc);
				produitModel.loadData(prods);
				
			}
		});
		

	}
	
	public static void main(String[] args) {
		new ProduitSwing();
	}
}
