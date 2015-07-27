package dao;

import javax.persistence.Query;

import model.ProjectInfo;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ProjectInfoDAO implements IProjectInfoDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	public ProjectInfo createProjectInfo(ProjectInfo pi) {
		if (pi != null) {
			try {
				ProjectInfo pnew = (ProjectInfo) sessionFactory.getCurrentSession().save(pi);
				return pnew;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} else {
			throw new IllegalArgumentException("ProjectInfo is null!");			
		}
	}

	public boolean updateProjectInfo(ProjectInfo pi) {
		if (pi != null) {
			try {
				sessionFactory.getCurrentSession().update(pi);
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("ProjectInfo is null!");
		}
	}

	public boolean deleteProjectInfo(int idProject, int idEmployee) {
		try {
			ProjectInfo pi = getProjectInfo(idProject, idEmployee);
			if (pi != null) {
				sessionFactory.getCurrentSession().delete(pi);
				return true;
			} else {
				throw new IllegalArgumentException("ProjectInfo not existing.");
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public ProjectInfo getProjectInfo(int idProject, int idEmployee) {
		String hql = "FROM ProjectInfo PI WHERE PI.project = : projectID and PI.employee = : employeeID";
		Query query =  (Query) sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("projectID", idProject);
		query.setParameter("employeeID", idEmployee);
		
		ProjectInfo pi = (ProjectInfo) query.getSingleResult();
		
		if(pi!=null){
			return pi;
		}
		return null;
	}
	

}
