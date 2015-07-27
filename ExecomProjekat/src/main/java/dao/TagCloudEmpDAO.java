package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.TagCloudEmp;
import model.TagClouds;

@Repository
public class TagCloudEmpDAO implements ITagCloudEmpDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public TagCloudEmp createTagCloudEmp(TagCloudEmp tce) {
		if (tce != null) {
			try {
				return (TagCloudEmp) sessionFactory.getCurrentSession().save(tce);
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			throw new IllegalArgumentException("TagCloudEmp is null!");			
		}
	}

	public boolean updateTagCloudEmp(TagCloudEmp tce) {
		if (tce != null) {
			try {
				sessionFactory.getCurrentSession().update(tce);
				return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("TagCloudEmp is null!");
		}
	}

	public boolean deleteTagCloudEmp(int idTagCloudEmp) {
		try {
			TagCloudEmp tce = getTagCloudEmp(idTagCloudEmp);
			if (tce != null) {
				sessionFactory.getCurrentSession().delete(tce);
				return true;
			} else {
				throw new IllegalArgumentException("TagCloudEmp not existing.");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public TagCloudEmp getTagCloudEmp(int idTagCloudEmp) {
		TagCloudEmp tce = (TagCloudEmp) sessionFactory.getCurrentSession().get(TagCloudEmp.class, idTagCloudEmp);
		if (tce != null) {
			return tce;
		}
		return null;
	}

}
