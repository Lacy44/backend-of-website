package az.edu.itbrains.creative.services.impl;

import az.edu.itbrains.creative.dtos.action.ActionDto;
import az.edu.itbrains.creative.models.Action;
import az.edu.itbrains.creative.repositories.ActionRepository;
import az.edu.itbrains.creative.services.ActionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {
    private final ActionRepository actionRepository;
    private final ModelMapper modelMapper;


    @Override
    public ActionDto getAllAction() {
        Action findAction=actionRepository.findById(1L).orElseThrow();
        ActionDto actionDto = new ActionDto();
        actionDto.setId(findAction.getId());
        actionDto.setTitle(findAction.getTitle());
        actionDto.setButtonTitle(findAction.getButtonTitle());
        return actionDto;
    }
}
