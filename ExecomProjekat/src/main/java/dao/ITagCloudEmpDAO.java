package dao;

import model.TagCloudEmp;

public interface ITagCloudEmpDAO {

	public TagCloudEmp createTagCloudEmp(TagCloudEmp tce);
	public boolean updateTagCloudEmp(TagCloudEmp tce);
	public boolean deleteTagCloudEmp(int idTagCloudEmp);
	public TagCloudEmp getTagCloudEmp(int idTagCloudEmp);
	
}
