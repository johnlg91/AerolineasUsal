package dao.interfaces;

import java.util.List;

/**
 * INTERFAZ GENERAL PARA Dao EN DB
 */

public interface Dao<T>{

	boolean insert(T element);
	boolean modify(int id);
	boolean delete(int id);
	T get(int id);
	List<T> getAll();
	
}
