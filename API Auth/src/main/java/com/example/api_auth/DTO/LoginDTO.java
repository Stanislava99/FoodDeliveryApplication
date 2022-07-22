package com.example.api_auth.DTO;

import lombok.Data;

@Data
public class LoginDTO {
    private String login;
    private String password;
    private String token;
}
