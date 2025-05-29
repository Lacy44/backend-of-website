package az.edu.itbrains.creative.repositories;

import az.edu.itbrains.creative.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
