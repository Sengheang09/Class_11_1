package com.example.spring_security_jwt_11_1.entity;

import com.example.spring_security_jwt_11_1.enums.RoleUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_user")
    private RoleUser name;
    public Role(RoleUser name) {
        this.name = name;
    }

}
