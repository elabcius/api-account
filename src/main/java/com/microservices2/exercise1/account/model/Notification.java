package com.microservices2.exercise1.account.model;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;
    private String email;
    private String mobile;
}
