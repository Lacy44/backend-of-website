package az.edu.itbrains.creative.services.impl;

import az.edu.itbrains.creative.dtos.action.ActionDto;
import az.edu.itbrains.creative.dtos.contact.ContactDto;
import az.edu.itbrains.creative.models.Action;
import az.edu.itbrains.creative.models.Contact;
import az.edu.itbrains.creative.repositories.ContactRepository;
import az.edu.itbrains.creative.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;
    private final ModelMapper modelMapper;


    @Override
    public ContactDto getContact() {
        Contact findContact=contactRepository.findById(1L).orElseThrow();
        ContactDto contactDto = new ContactDto();
        contactDto.setId(findContact.getId());
        contactDto.setTitle(findContact.getTitle());
        contactDto.setDescription(findContact.getDescription());
        contactDto.setButtonTitle(findContact.getButtonTitle());
        contactDto.setPhoneNumber(findContact.getPhoneNumber());
        return contactDto;
    }
}
