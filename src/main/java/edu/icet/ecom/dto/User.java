package edu.icet.ecom.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private  Integer id;

    private String email;

    private String password;
}
