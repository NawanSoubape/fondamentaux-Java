package presentation;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import metier.Produit;

public class ProduitModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] nomColonnes = new String[] {"ID_PRODUIT", "NOM_PRODUIT","PRIX","QUANTITE","CATEGORIE"};
	private Vector<String[]> rows = new Vector<>();
	@Override
	public int getRowCount() {
		return rows.size();
	}

	@Override
	public int getColumnCount() {
		return nomColonnes.length;
	}

	@Override
	public String getColumnName(int column) {
		
		return nomColonnes[column];
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return rows.get(rowIndex)[columnIndex];
	}
	
	public void loadData(List<Produit> prods) {
		rows = new Vector<>();
		for(Produit p : prods){
			rows.add(new String[]{String.valueOf(p.getIdproduct()),
					p.getName(),String.valueOf(p.getPrix()),
					String.valueOf(p.getQuantite()),
					String.valueOf(p.getCategorie().getNamecategorie())});
		}
		fireTableChanged(null);
	}

}
