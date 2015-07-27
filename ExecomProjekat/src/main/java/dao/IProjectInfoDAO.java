package dao;

import model.ProjectInfo;

public interface IProjectInfoDAO {
	
	public boolean createProjectInfo(ProjectInfo pi);
	public boolean updateProjectInfo(ProjectInfo pi);
	public boolean deleteProjectInfo(int idProject, int idEmployee);
	public ProjectInfo getProjectInfo(int idProject, int idEmployee);

}
