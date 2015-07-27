package dao;

import model.Employee;

public interface IEmployeeDAO {
	
	public int createEmployee(Employee e);
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(int idEmployee);
	public Employee getEmployee(int idEmployee);

}
