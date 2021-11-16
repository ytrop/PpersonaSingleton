package persona;

public class main {

	public static void main(String[] args) {
		    persona Maria = persona.getSingletonInstance("Maria Cabrera");
	        persona Jose = persona.getSingletonInstance("Jose Portero");
	        
	      
	        System.out.println(Maria.getNombre());
	        System.out.println(Jose.getNombre());   

	}

}
