package com.example.digitaldocs.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Approval {
    @Id
    @Column(name="approvalId", nullable=false, unique=true)
    private String approvalId;

    @Column(name="status")
    private String status;

    @Column(name= "approvalDate")
    private LocalDateTime aprovalDate;

    @ManyToOne
    private User approvedBy;

    @OneToOne
    private Submission submission;
}
