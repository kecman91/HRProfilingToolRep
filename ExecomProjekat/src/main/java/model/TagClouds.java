package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TAGCLOUDS")
public class TagClouds {

	@ManyToOne
	@JoinColumn(name="IDTAGCLOUD")
	private TagCloud tagCloud;
	
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
