package modelo.blogical;

import java.util.List;

import modelo.bean.EmpresaBean;
import modelo.dao.EmpresaDao;
import modelo.dao.IOperacionesDB;

public class EmpresaBL implements IOperacionesDB<EmpresaBean>{
	EmpresaDao eDao=new EmpresaDao();

	@Override
	public List<EmpresaBean> listar() {
		// TODO Auto-generated method stub
		return eDao.listar();
	}

	@Override
	public int eliminar(int id) {
		// TODO Auto-generated method stub
		return eDao.eliminar(id);
	}

	@Override
	public int registrar(EmpresaBean a) {
		// TODO Auto-generated method stub
		return eDao.registrar(a);
	}

	@Override
	public int actualizar(EmpresaBean a) {
		// TODO Auto-generated method stub
		return eDao.actualizar(a);
	}

	@Override
	public EmpresaBean buscar(int id) {
		// TODO Auto-generated method stub
		return eDao.buscar(id);
	}

}
