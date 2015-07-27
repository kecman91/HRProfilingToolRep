package dao;

import model.Project;

public interface IProjectDAO {

	public int createProject(Project p);
	public boolean updateProject(Project p);
	public boolean deleteProject(int idProject);
	public Project getProject(int idProject);
	
}
