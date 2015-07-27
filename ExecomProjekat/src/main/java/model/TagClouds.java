package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TAGCLOUDS")
public class TagClouds {

	@Id
	@ManyToOne
	@JoinColumn(name="IDTAGCLOUD")
	private TagCloud tagCloud;
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDPROJECT")
	private Project project;

	public TagCloud getTagCloud() {
		return tagCloud;
	}

	public void setTagCloud(TagCloud tagCloud) {
		this.tagCloud = tagCloud;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	

}
