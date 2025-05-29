package az.edu.itbrains.creative.services.impl;

import az.edu.itbrains.creative.dtos.project.ProjectDto;
import az.edu.itbrains.creative.dtos.service.ServiceDto;
import az.edu.itbrains.creative.models.Project;
import az.edu.itbrains.creative.repositories.ProjectRepository;
import az.edu.itbrains.creative.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProjectDto> getAllProjects() {

        List<Project> findProject = projectRepository.findAll();
        List<ProjectDto> projects=findProject.stream().map(project -> modelMapper.map(project,ProjectDto.class)).collect(Collectors.toList());
        return projects;
    }
}
