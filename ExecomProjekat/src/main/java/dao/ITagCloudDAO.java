package dao;

import model.TagCloud;

public interface ITagCloudDAO {

	public int createTagCloud(TagCloud tg);
	public boolean updateTagCloud(TagCloud tg);
	public boolean deleteTagCloud(int idTagCloud);
	public TagCloud getTagCloud(int idTagCloud);
}
