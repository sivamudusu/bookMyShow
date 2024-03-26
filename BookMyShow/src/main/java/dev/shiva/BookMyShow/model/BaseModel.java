package dev.shiva.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.jdbc.env.internal.LobCreationLogging;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass

public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_BY")
    private String updatedBy;



}
