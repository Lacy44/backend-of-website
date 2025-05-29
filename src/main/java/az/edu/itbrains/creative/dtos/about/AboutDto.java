package az.edu.itbrains.creative.dtos.about;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AboutDto {
    private long id;
    private String title;
    private String description;
    private String buttonTitle;
}
