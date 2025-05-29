package az.edu.itbrains.creative.dtos.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {
    private long id;
    private String title;
    private String description;
    private String icon;
}
