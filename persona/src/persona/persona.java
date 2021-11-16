package persona;

public class persona {
	
	 private String nombre;
	    private static persona persona;

	  
	    
	    private persona(String nombre) {
	        this.nombre = nombre;
	        System.out.println("Mi nombre es: " + this.nombre);
	    }

	    public static persona getSingletonInstance(String nombre) {
	        if (persona == null){
	            persona = new persona(nombre);
	        }
	        else{
	            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase persona");
	        }
	        
	        return persona;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public static persona getPersona() {
			return persona;
		}

		public static void setPersona(persona persona) {
			persona.persona = persona;
		}

}
