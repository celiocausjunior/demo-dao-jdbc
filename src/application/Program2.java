package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao deptoDao = DaoFactory.createDepartmentDao();

		System.out.println("======= TEST 1 : Departmentfind By Id ========");

		Department depto = deptoDao.findById(1);

		System.out.println(depto);

		System.out.println("======= TEST 1 : Departmentfind By Id ========");

		List<Department> list = deptoDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
