package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

	public boolean deleteTagClouds(int idTagClouds) {
		try {
			TagClouds tc = getTagClouds(idTagClouds);
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

	public TagClouds getTagClouds(int idTagClouds) {
		TagClouds tc = (TagClouds) sessionFactory.getCurrentSession().get(TagClouds.class, idTagClouds);
		if (tc != null) {
			return tc;
		}
		return null;
	}

}
