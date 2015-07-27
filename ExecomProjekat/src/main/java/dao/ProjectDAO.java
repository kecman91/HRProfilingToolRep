package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Project;

@Repository
@Transactional
public class ProjectDAO implements IProjectDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public int createProject(Project p) {
		if (p != null) {
			try {
				return (Integer) sessionFactory.getCurrentSession().save(p);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
		} else {
			throw new IllegalArgumentException("Project is null!");			
		}
	}

	
	public boolean updateProject(Project p) {
		if (p != null) {
			try {
				sessionFactory.getCurrentSession().update(p);
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("Project is null!");
		}
	}

	
	public boolean deleteProject(int idProject) {
		try {
			Project p = getProject(idProject);
			if (p != null) {
				sessionFactory.getCurrentSession().delete(p);
				return true;
			} else {
				throw new IllegalArgumentException("Project not existing.");
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	
	public Project getProject(int idProject) {
		Project p = (Project) sessionFactory.getCurrentSession().get(Project.class, idProject);
		if (p != null) {
			return p;
		}
		return null;
	}

}
