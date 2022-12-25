package dao.util;

public final class Singleton {
	
	 private static final Singleton INSTANCE = new Singleton();

	    private Singleton() {
	    }

	    public static Singleton getInstance() {
	        return INSTANCE;
	    }
	    public static void getMessage() {
	    	System.out.println("Connexion réussie !");
	    }
}
