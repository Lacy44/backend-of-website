package az.edu.itbrains.creative.dtos.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {
    private long id;
    private String title;
    private String description;
    private String buttonTitle;
    private String phoneNumber;
}
