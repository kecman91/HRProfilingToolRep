package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Employee;
import model.Project;

public class EmployeeDAO implements IEmployeeDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public int createEmployee(Employee e) {
		if (e != null) {
			try {
				return (Integer) sessionFactory.getCurrentSession().save(e);
			} catch (HibernateException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				return -1;
			}
		} else {
			throw new IllegalArgumentException("Employee is null!");			
		}
	}

	public boolean updateEmployee(Employee e) {
		if (e != null) {
			try {
				 sessionFactory.getCurrentSession().update(e);
				return true;
			} catch (HibernateException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("Employee is null!");			
		}
	}

	public boolean deleteEmployee(int idEmployee) {
		try{
			Employee e = getEmployee(idEmployee);
			
			if(e!=null){
				sessionFactory.getCurrentSession().delete(e);
				return true;
			}else{
				throw new IllegalArgumentException("Employee not existing.");
			}
			
		}catch(HibernateException ex){
			ex.printStackTrace();
			return false;
		}
	}

	public Employee getEmployee(int idEmployee) {
		Employee e = (Employee) sessionFactory.getCurrentSession().get(Employee.class, idEmployee);
		
		if(e!= null){
			return e;
		}
		return null;
	}

}
