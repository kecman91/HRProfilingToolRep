package dao;

import model.TagClouds;

public interface ITagCloudsDAO {

	public TagClouds createTagClouds(TagClouds tc);
	public boolean updateTagClouds(TagClouds tc);
	public boolean deleteTagClouds(int idTagCloud, int idProject);
	public TagClouds getTagClouds(int idTagCloud, int idProject);
	
}
