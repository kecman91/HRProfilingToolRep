package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Project;
import model.TagCloud;

@Repository
public class TagCloudDAO implements ITagCloudDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public int createTagCloud(TagCloud t) {
		if (t != null) {
			try {
				TagCloud tg = (TagCloud) sessionFactory.getCurrentSession().save(t);
				return tg.getIdTagCloud();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
		} else {
			throw new IllegalArgumentException("TagCloud is null!");			
		}
	}

	public boolean updateTagCloud(TagCloud t) {
		if (t != null) {
			try {
				sessionFactory.getCurrentSession().update(t);
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("TagCloud is null!");
		}
	}

	public boolean deleteTagCloud(int idTagCloud) {
		try {
			TagCloud tg = getTagCloud(idTagCloud);
			if (tg != null) {
				sessionFactory.getCurrentSession().delete(tg);
				return true;
			} else {
				throw new IllegalArgumentException("TagCloud not existing.");
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public TagCloud getTagCloud(int idTagCloud) {
		TagCloud tg = (TagCloud) sessionFactory.getCurrentSession().get(TagCloud.class, idTagCloud);
		if (tg != null) {
			return tg;
		}
		return null;
	}

}
