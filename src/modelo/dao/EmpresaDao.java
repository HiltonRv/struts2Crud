package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.bean.EmpresaBean;

public class EmpresaDao implements IOperacionesDB<EmpresaBean>{

	@Override
	public List<EmpresaBean> listar() {
		List<EmpresaBean> lst=new ArrayList<EmpresaBean>();
		Connection cn=null;
		try {
			String sql="SELECT * FROM EMPRESA";
			cn=Util.getConnection();
			PreparedStatement pst=cn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				EmpresaBean e=new EmpresaBean();
				e.setId(rs.getInt("id"));
				e.setRuc(rs.getString("ruc"));
				e.setNombre(rs.getString("nombre"));
				e.setDireccion(rs.getString("direccion"));
				e.setCorreo(rs.getString("correo"));
				e.setAniocreacion(rs.getInt("aniocreacion"));
				e.setEstado(rs.getBoolean("estado"));
				lst.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public int eliminar(int id) {
		int rs=0;
		Connection cn=null;
		try {
			String sql="DELETE FROM EMPRESA WHERE id=?";
			cn=Util.getConnection();
			PreparedStatement pst=cn.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int registrar(EmpresaBean a) {
		int rs=0;
		Connection cn=null;
		try {
			String sql=" INSERT INTO EMPRESA VALUES(?,?,?,?,?,?,?)";
			cn=Util.getConnection();
			PreparedStatement pst=cn.prepareStatement(sql);
			pst.setInt(1,a.getId());
			pst.setString(2,a.getRuc());
			pst.setString(3,a.getNombre());
			pst.setString(4,a.getDireccion());
			pst.setString(5,a.getCorreo());
			pst.setInt(6,a.getAniocreacion());
			pst.setBoolean(7,a.isEstado());
			rs=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int actualizar(EmpresaBean a) {
		int rs=0;
		Connection cn=null;
		try {
			String sql=" UPDATE EMPRESA SET ruc=?, nombre=?, direccion=?, correo=?, aniocreacion=?, estado=? WHERE id=?";
			cn=Util.getConnection();
			PreparedStatement pst=cn.prepareStatement(sql);
			pst.setInt(7,a.getId());
			pst.setString(1,a.getRuc());
			pst.setString(2,a.getNombre());
			pst.setString(3,a.getDireccion());
			pst.setString(4,a.getCorreo());
			pst.setInt(5,a.getAniocreacion());
			pst.setBoolean(6,a.isEstado());
			rs=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public EmpresaBean buscar(int id) {
		Connection cn=null;
		try {
			String sql="SELECT * FROM EMPRESA WHERE id=?";
			cn=Util.getConnection();
			PreparedStatement pst=cn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				EmpresaBean e=new EmpresaBean();
				e.setId(rs.getInt("id"));
				e.setRuc(rs.getString("ruc"));
				e.setNombre(rs.getString("nombre"));
				e.setDireccion(rs.getString("direccion"));
				e.setCorreo(rs.getString("correo"));
				e.setAniocreacion(rs.getInt("aniocreacion"));
				e.setEstado(rs.getBoolean("estado"));
				return e;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
