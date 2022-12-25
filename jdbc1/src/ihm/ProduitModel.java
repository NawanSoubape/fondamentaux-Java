package ihm;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import metier.Produit;

public class ProduitModel extends AbstractTableModel {
	private String [] nombreColonnes = new String[] {"id","nom","quantite"};
	private List<String[]> tableValues = new ArrayList<>();
	@Override
	public int getRowCount() {
		return tableValues.size();
	}

	@Override
	public int getColumnCount() {
		return nombreColonnes.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return tableValues.get(rowIndex)[columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		return nombreColonnes[column];
	}
	public void setData(List<Produit> produits) {
		tableValues = new ArrayList<>();
		for(Produit p : produits) {
			tableValues.add(new String[] {
			    ""+p.getIdProduit(),
			    p.getNomProduit(),
			    String.valueOf(p.getQuantite())
		});
		}
		fireTableDataChanged();
}
}
