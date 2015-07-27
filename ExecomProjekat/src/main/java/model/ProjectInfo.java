package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="PROJECTINFO")
public class ProjectInfo {
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDPROJECT")
	private Project project;
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDEMPLOYEE")
	private Employee employee;
	
	@Column(name="JOB_RESPONSIBILITIES")
	private String jobResponsibilities;
	
	@Column(name="PROJECT_EXP")
	private String projectExp;
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getJobResponsibilities() {
		return jobResponsibilities;
	}
	public void setJobResponsibilities(String jobResponsibilities) {
		this.jobResponsibilities = jobResponsibilities;
	}
	public String getProjectExp() {
		return projectExp;
	}
	public void setProjectExp(String projectExp) {
		this.projectExp = projectExp;
	}
	
	
}
