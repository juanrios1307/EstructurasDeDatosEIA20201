package principal;

public class Persona2 implements Comparable<Persona2>{
	private int edad;
	private String nombre,sexo;
	public Persona2(int edad, String nombre, String sexo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	
	
	public Persona2( String nombre,int edad) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	@Override
	public int compareTo(Persona2 p) {
		// TODO Auto-generated method stub
		return nombre.compareTo(p.getNombre());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Persona: [nombre: "+nombre+", edad: "+edad+"]";
	}
	
	
}
