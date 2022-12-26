package produitModel;

import dao.util.ConnectionFactory;

public class Test {

	public static void main(String[] args) {
		
		ConnectionFactory cf = null;
		System.out.println(cf.getConnection());

	}

}
