package az.edu.itbrains.creative.services;

import az.edu.itbrains.creative.dtos.project.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getAllProjects();
}
