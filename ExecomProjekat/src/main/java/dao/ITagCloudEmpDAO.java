package dao;

import model.TagCloudEmp;

public interface ITagCloudEmpDAO {

	public boolean createTagCloudEmp(TagCloudEmp tce);
	public boolean updateTagCloudEmp(TagCloudEmp tce);
	public boolean deleteTagCloudEmp(int idTagCloud, int idEmployee);
	public TagCloudEmp getTagCloudEmp(int idTagCloud,int idEmployee);
	
}
