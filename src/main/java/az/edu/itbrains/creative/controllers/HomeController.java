package az.edu.itbrains.creative.controllers;

import az.edu.itbrains.creative.dtos.about.AboutDto;
import az.edu.itbrains.creative.dtos.action.ActionDto;
import az.edu.itbrains.creative.dtos.contact.ContactDto;
import az.edu.itbrains.creative.dtos.index.IndexDto;
import az.edu.itbrains.creative.dtos.project.ProjectDto;
import az.edu.itbrains.creative.dtos.service.ServiceDto;
import az.edu.itbrains.creative.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final IndexService indexService;
    private final AboutService aboutService;
    private final ActionService actionService;
    private final ServiceService serviceService;
    private final ProjectService projectService;
    private final ContactService contactService;

    @GetMapping("/")
    public String index(Model model){

        IndexDto findIndex = indexService.getHomeIndex();
        AboutDto findAbout=aboutService.getAllAbout();
        ActionDto findAction=actionService.getAllAction();
        List<ServiceDto> findServices=serviceService.getAllServices();
        List<ProjectDto> findProjects=projectService.getAllProjects();
        ContactDto findContact=contactService.getContact();

        model.addAttribute("index",findIndex);
        model.addAttribute("about",findAbout);
        model.addAttribute("action",findAction);
        model.addAttribute("services",findServices);
        model.addAttribute("projects",findProjects);
        model.addAttribute("contact",findContact);
        return "index.html";
    }



}
