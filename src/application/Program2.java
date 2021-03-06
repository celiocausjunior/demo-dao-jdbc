package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao deptoDao = DaoFactory.createDepartmentDao();

		System.out.println("======= TEST 1 : Departmentfind By Id ========");

		Department depto = deptoDao.findById(1);

		System.out.println(depto);

		System.out.println("======= TEST 2 : Department find All ========");

		List<Department> list = deptoDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("======= TEST 3 : Insert Department ========");

		Department newDepartment = new Department(null, "Watches");

		deptoDao.insert(newDepartment);

		System.out.println("Inserted!  New id = " + newDepartment.getId());

		System.out.println("======= TEST 4 : Update Department ========");

		depto = deptoDao.findById(1);
		depto.setName("Refrigerators");
		deptoDao.update(depto);
		System.out.println("Update Completed!");

		System.out.println("======= TEST 5 : Delete By Id Department ========");

		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();

		deptoDao.deleteById(id);

		System.out.println("Delete completed");

		sc.close();
	}
}