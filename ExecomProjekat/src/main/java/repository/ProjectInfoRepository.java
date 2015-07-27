package repository;

import org.springframework.data.repository.CrudRepository;

import model.Employee;
import model.Project;
import model.ProjectInfo;

public interface ProjectInfoRepository extends CrudRepository<ProjectInfo, Integer> {
	
	ProjectInfo findByProjectAndEmployee(Project project, Employee employee);

}
