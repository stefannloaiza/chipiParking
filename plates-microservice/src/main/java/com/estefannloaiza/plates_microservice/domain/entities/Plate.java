package com.estefannloaiza.plates_microservice.domain.entities;

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
@Table(name = "plates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plate {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Column(updatable = false, nullable = false)
    private UUID id;
    @Column(updatable = false, nullable = false)
    private String description;
    @Column(name = "created_at", updatable = false, nullable = false)
    private Timestamp createdAt;

    @Override
    public String toString() {
        return "Plate{id=%s, description='%s', createdAt=%s}"
                .formatted(id, description, createdAt);
    }
}