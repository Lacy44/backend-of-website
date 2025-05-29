package az.edu.itbrains.creative.dtos.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
    private long id;
    private String category;
    private String name;
    private String imgUrl;
}
