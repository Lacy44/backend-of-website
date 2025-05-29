package az.edu.itbrains.creative.services.impl;

import az.edu.itbrains.creative.dtos.about.AboutDto;
import az.edu.itbrains.creative.dtos.index.IndexDto;
import az.edu.itbrains.creative.models.About;
import az.edu.itbrains.creative.models.Index;
import az.edu.itbrains.creative.repositories.AboutRepository;
import az.edu.itbrains.creative.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutServiceImpl implements AboutService {

    private final AboutRepository aboutRepository;
    private final ModelMapper modelMapper;

    @Override
    public AboutDto getAllAbout() {

        About findAbout =aboutRepository.findById(1L).orElseThrow();
        AboutDto aboutDto = new AboutDto();
        aboutDto.setId(findAbout.getId());
        aboutDto.setTitle(findAbout.getTitle());
        aboutDto.setDescription(findAbout.getDescription());
        aboutDto.setButtonTitle(findAbout.getButtonTitle());
        return aboutDto;
    }
}
