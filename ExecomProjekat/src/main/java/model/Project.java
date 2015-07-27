package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProject;

	private String nameProject;
	
	private int durationOfProject;
	
	@OneToMany(mappedBy="project")
	private List<ProjectInfo> projectInfo;
	
	@OneToMany(mappedBy="project")
	private List<TagClouds> tagClouds;
	
	public int getIdProject() {
		return idProject;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public String getNameProject() {
		return nameProject;
	}
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	public int getDurationOfProject() {
		return durationOfProject;
	}
	public void setDurationOfProject(int durationOfProject) {
		this.durationOfProject = durationOfProject;
	}
	public List<ProjectInfo> getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(List<ProjectInfo> projectInfo) {
		this.projectInfo = projectInfo;
	}
	public List<TagClouds> getTagClouds() {
		return tagClouds;
	}
	public void setTagClouds(List<TagClouds> tagClouds) {
		this.tagClouds = tagClouds;
	}
	
}
