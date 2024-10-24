package gr.aueb.cf.teacherapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {
    @NotNull(message = ("Firstname can not be null"))
    @Size(min = 1, max = 50, message = ("Firstname must be 1-50 chars"))
    private String firstname;
    @NotNull(message = ("lastname can not be null"))
    @Size(min = 1, max = 50, message = ("last must be 1-50 chars"))
    private String lastname;
    @Pattern(regexp =  "\\d{9,}",message = ("Vat must be at least 9 digits long"))
    private String vat;
    @NotNull(message = ("Region must not be null"))
    private Long regionId;
}

