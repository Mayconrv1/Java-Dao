package model.down;

import java.util.List;

import model.entities.Department;

public interface DepartmetDown {
	void insert (Department obj);
	void update (Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	

}
