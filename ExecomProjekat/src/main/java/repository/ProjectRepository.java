package repository;

import org.springframework.data.repository.CrudRepository;

import model.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
