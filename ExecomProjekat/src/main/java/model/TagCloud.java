package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TagCloud {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTagCloud;
	
	private String nameTagCloud;
	
	private String tipTagCloud;
	
	@OneToMany(mappedBy="tagCloud")
	private List<TagClouds> tagClouds;
	
	@OneToMany(mappedBy="tagCloud")
	private List<TagCloudEmp> tagCloudEmps;
	
	public int getIdTagCloud() {
		return idTagCloud;
	}
	public void setIdTagCloud(int idTagCloud) {
		this.idTagCloud = idTagCloud;
	}
	public String getNameTagCloud() {
		return nameTagCloud;
	}
	public void setNameTagCloud(String nameTagCloud) {
		this.nameTagCloud = nameTagCloud;
	}
	public String getTipTagCloud() {
		return tipTagCloud;
	}
	public void setTipTagCloud(String tipTagCloud) {
		this.tipTagCloud = tipTagCloud;
	}
	public List<TagClouds> getTagClouds() {
		return tagClouds;
	}
	public void setTagClouds(List<TagClouds> tagClouds) {
		this.tagClouds = tagClouds;
	}
	public List<TagCloudEmp> getTagCloudEmps() {
		return tagCloudEmps;
	}
	public void setTagCloudEmps(List<TagCloudEmp> tagCloudEmps) {
		this.tagCloudEmps = tagCloudEmps;
	}
}
