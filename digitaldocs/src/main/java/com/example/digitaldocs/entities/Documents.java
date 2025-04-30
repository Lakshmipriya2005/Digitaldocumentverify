package com.example.digitaldocs.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Documents {
    @Id
    @Column(name="docsId", nullable=false, unique=true)
    private String documentId;

    @Column(name ="uploadedDate")
    private LocalDate uploadedDate;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="userId")
    private String userId;
}