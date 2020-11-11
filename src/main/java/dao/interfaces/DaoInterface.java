package dao.interfaces;

import java.util.List;

/**
 * INTERFAZ GENERAL PARA Dao EN DB
 */

public interface DaoInterface<T>{

	boolean insert(T element);
	boolean update(int id, T element);
	boolean delete(int id);

	T get(int id);
	List<T> getAll();
	
}
