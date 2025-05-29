package az.edu.itbrains.creative.services.impl;

import az.edu.itbrains.creative.dtos.index.IndexDto;
import az.edu.itbrains.creative.models.Index;
import az.edu.itbrains.creative.repositories.IndexRepository;
import az.edu.itbrains.creative.services.IndexService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IndexServiceImpl implements IndexService {
    private final IndexRepository indexRepositories;
    private final ModelMapper modelMapper;


    @Override
    public IndexDto getHomeIndex() {
        Index findIndex =indexRepositories.findById(1L).orElseThrow();
        IndexDto indexDto = new IndexDto();
        indexDto.setId(findIndex.getId());
        indexDto.setTitle(findIndex.getTitle());
        indexDto.setDescription(findIndex.getDescription());
        indexDto.setButtonTitle(findIndex.getButtonTitle());
        return indexDto;

    }
}

