package com.example.digitaldocs.entities;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class  Submission {
    @Id
    @Column(name="submissionId", nullable=false, unique=true)
    private String submissionId;

    @Column(name="status")
    private String status;

    @Column(name="subDate")
    private LocalDateTime submissionDate;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="userId")
    private String userId;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name= "approvalId")
    private String approvalId;
}
