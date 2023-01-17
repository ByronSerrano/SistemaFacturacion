package ec.edu.puce;

public class Cliente {
	private String ci;
	private String name;
	private String direccion;
	private String tlf;
	private String email;
	
	public Cliente(String ci, String name, String direccion, String tlf, String email){
		this.ci = ci;
		this.name = name;
		this.direccion = direccion;
		this.tlf = tlf;
		this.email = email;
	}
	
	public Cliente() {};
	
	public String getCi() {
		return ci;
	}
	
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTlf() {
		return tlf;
	}
	
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
