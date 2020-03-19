package modelo.dao;

import java.util.List;

public interface IOperacionesDB<E> {
	public List<E> listar();
	public int eliminar(int id);
	public int registrar(E a);
	public int actualizar(E a);
	public E buscar(int id);
}
