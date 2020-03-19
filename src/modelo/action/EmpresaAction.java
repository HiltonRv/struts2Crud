package modelo.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import modelo.bean.EmpresaBean;
import modelo.blogical.EmpresaBL;

public class EmpresaAction {
	
	private List<EmpresaBean> lstEmpresa;
	private EmpresaBean empresa;
	private String resultado;
	
	public EmpresaBean getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaBean empresa) {
		this.empresa = empresa;
	}
	public List<EmpresaBean> getLstEmpresa() {
		return lstEmpresa;
	}
	public String getResultado() {
		return resultado;
	}
	@Action(value="listar",results= {
			@Result(name="ok",location="/listar.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String listarAlumno() {
		try {
			lstEmpresa=(new EmpresaBL()).listar() ;
			return "ok";
		} catch (Exception e) {
			resultado="Error: "+e.getMessage();
			return "error";
		}
		
	}
	@Action(value="registrar",results= {
			@Result(name="ok",location="/listar.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String registrarEmpresa() {
		try {
			(new EmpresaBL()).registrar(empresa);
			lstEmpresa=(new EmpresaBL()).listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error "+e.getMessage();
			return "error";
		}
		
	}
	@Action(value="actualizar",results= {
			@Result(name="ok",location="/listar.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String actualizarEmpresa() {
		try {
			(new EmpresaBL()).actualizar(empresa);
			lstEmpresa=(new EmpresaBL()).listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error "+e.getMessage();
			return "error";
		}
		
	}
	@Action(value="eliminar",results = {
			@Result(name="ok",location="/listar.jsp"),
			@Result(name="error",location = "/error.jsp")
	})
	public String eliminarEmpresa() {
		try {
			(new EmpresaBL()).eliminar(empresa.getId());
			lstEmpresa=(new EmpresaBL()).listar();
			return "ok";
		} catch (Exception e) {
			resultado = "Error: "+e.getMessage();
			return "error";
		}
	}
	@Action(value="buscarEmpresa",results= {
			@Result(name="ok",location="/buscar.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String buscarAlumno() {
		try {
			empresa=(new EmpresaBL()).buscar(empresa.getId());
			return "ok";
		} catch (Exception e) {
			resultado="ERROR "+e.getMessage();
			return "error";
		}
	}
	
	

}
