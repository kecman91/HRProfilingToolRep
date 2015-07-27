package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TAGCLOUDEMP")
public class TagCloudEmp {
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDTAGCLOUD")
	private TagCloud tagCloud;
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDEMPLOYEE")
	private Employee employee;
	
	public TagCloud getTagCloud() {
		return tagCloud;
	}
	public void setTagCloud(TagCloud tagCloud) {
		this.tagCloud = tagCloud;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
