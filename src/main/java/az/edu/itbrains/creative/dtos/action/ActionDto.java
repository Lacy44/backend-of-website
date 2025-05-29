package az.edu.itbrains.creative.dtos.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActionDto {
    private long id;
    private String title;
    private String buttonTitle;
}
