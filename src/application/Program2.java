package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== Teste3: department findAll===");
		List<Department> list  = departmentDao.findAll();
		for (Department obj : list){
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste4: department Insert ===");
		Department newDepartment = new Department(null, "TI");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== Teste5: department Update ===");
		department = departmentDao.findById(6);
		department.setName("Help Desk");
		departmentDao.update(department);
		System.out.println("Update complete");
		
		System.out.println("\n=== Teste6: department delete ===");
		System.out.println("Enter id to delete");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println(id + " deleted");
		
		sc.close();

	}

}
