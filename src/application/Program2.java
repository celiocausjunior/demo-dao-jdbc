package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

	DepartmentDao deptoDao = DaoFactory.createDepartmentDao();
	
	Department depto = deptoDao.findById(1);
	
	System.out.println(depto);

	}

}
