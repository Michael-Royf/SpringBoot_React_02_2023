package com.michael.springboot.payload.request;

import com.michael.springboot.entity.Gender;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentRequest {
    private String name;
    private String email;
    private Gender gender;
}
