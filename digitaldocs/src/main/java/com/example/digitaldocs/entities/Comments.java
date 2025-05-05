package com.example.digitaldocs.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comments {
    @Id
    @Column(name="commentId", nullable=false, unique=true)
    private String commentId;

    @Column(name="description")
    private String desc;

    @Column(name="commentDate")
    private LocalDateTime commentDate;

    @ManyToOne
    private Submission submission;

    @ManyToOne
    private User commentedBy;
}