package com.estefannloaiza.users_microservice.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String status;
    @Column(name = "created_at", updatable = false, nullable = false)
    private Timestamp createdAt;
    @Column(name = "updated_at", updatable = false)
    private Timestamp updatedAt;

    @Override
    public String toString() {
        return "User{id=%s, name='%s', email='%s', password='%s', status='%s', createdAt=%s, updatedAt=%s}"
                .formatted(id, name, email, password, status, createdAt, updatedAt);
    }
}