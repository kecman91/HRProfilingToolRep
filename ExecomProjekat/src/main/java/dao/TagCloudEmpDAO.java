package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.TagCloudEmp;

@Repository
@Transactional
public class TagCloudEmpDAO implements ITagCloudEmpDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean createTagCloudEmp(TagCloudEmp tce) {
		if (tce != null) {
			try {
				 sessionFactory.getCurrentSession().save(tce);
				 return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
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

	public boolean deleteTagCloudEmp(int idTagCloud, int idEmployee) {
		try {
			TagCloudEmp tce = getTagCloudEmp(idTagCloud,idEmployee);
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

	public TagCloudEmp getTagCloudEmp(int idTagCloud, int idEmployee) {
		String hql = "FROM TagCloudEmp WHERE TagCloudEmp.idTagCloud = " + idTagCloud + "AND TagCloudEmp.idEmployee = " + idEmployee;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<TagCloudEmp> list = query.list();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
