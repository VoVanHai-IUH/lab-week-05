package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "job")
@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Job {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "job_id")
    private UUID id;
    @Column(name = "job_name", nullable = false)
    private String name;
    @Column(name = "job_desc", length = 2000, nullable = false)
    private String description;


//====================RELATIONSHIPS========================
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
}
