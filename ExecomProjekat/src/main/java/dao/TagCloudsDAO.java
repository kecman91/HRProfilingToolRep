package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.TagCloudEmp;
import model.TagClouds;

@Repository
public class TagCloudsDAO implements ITagCloudsDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public TagClouds createTagClouds(TagClouds tc) {
		if (tc != null) {
			try {
				return (TagClouds) sessionFactory.getCurrentSession().save(tc);
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			throw new IllegalArgumentException("TagClouds is null!");			
		}
	}

	public boolean updateTagClouds(TagClouds tc) {
		if (tc != null) {
			try {
				sessionFactory.getCurrentSession().update(tc);
				return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("TagClouds is null!");
		}
	}

	public boolean deleteTagClouds(int idTagCloud, int idProject) {
		try {
			TagClouds tc = getTagClouds(idTagCloud,idProject);
			if (tc != null) {
				sessionFactory.getCurrentSession().delete(tc);
				return true;
			} else {
				throw new IllegalArgumentException("TagClouds not existing.");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public TagClouds getTagClouds(int idTagCloud, int idProject) {
		String hql = "FROM TagCloudEmp WHERE TagClouds.idTagCloud = " + idTagCloud + "AND TagClouds.idProject = " + idProject;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<TagClouds> list = query.list();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
