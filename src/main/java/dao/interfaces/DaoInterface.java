package dao.interfaces;

import java.util.List;

/**
 * INTERFAZ GENERAL PARA Dao EN DB
 * @param <E> The Entity
 */

public interface DaoInterface<E>{

	boolean insert(E element);
	boolean update(int id, E element);
	boolean delete(int id);

	E get(int id);
	List<E> getAll();
	
}
