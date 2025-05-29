package az.edu.itbrains.creative.services.impl;

import az.edu.itbrains.creative.dtos.service.ServiceDto;
import az.edu.itbrains.creative.repositories.ServiceRepository;
import az.edu.itbrains.creative.services.ServiceService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ServiceDto> getAllServices() {

        List<az.edu.itbrains.creative.models.Service> findService = serviceRepository.findAll();
        List<ServiceDto> services=findService.stream().map(service -> modelMapper.map(service,ServiceDto.class)).collect(Collectors.toList());
        return services;
    }
}
