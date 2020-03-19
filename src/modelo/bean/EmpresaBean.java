package modelo.bean;

public class EmpresaBean {
	private int id;
	private String ruc;
	private String nombre;
	private String direccion;
	private String correo;
	private int aniocreacion;
	private boolean estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getAniocreacion() {
		return aniocreacion;
	}
	public void setAniocreacion(int aniocreacion) {
		this.aniocreacion = aniocreacion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	
}
