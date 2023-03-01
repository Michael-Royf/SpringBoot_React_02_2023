package com.michael.springboot.payload.response;

import com.michael.springboot.entity.Gender;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentResponse {
    private String name;
    private String email;
    private Gender gender;
    private String id;
}
