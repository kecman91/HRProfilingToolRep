package dao;

import model.TagClouds;

public interface ITagCloudsDAO {

	public TagClouds createTagClouds(TagClouds tc);
	public boolean updateTagClouds(TagClouds tc);
	public boolean deleteTagClouds(int idTagClouds);
	public TagClouds getTagClouds(int idTagClouds);
	
}
