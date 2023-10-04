package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "company")
@Data
//@NoArgsConstructor @RequiredArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private long id;

    @Column(name = "comp_name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @Column(name = "web_url")
    private String webURL;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "about", length = 2000)
    private String about;

    //==================RELATIONSHIPS=====================
    @OneToMany(mappedBy = "company")
//    @JoinColumn(name = "jobs")
    private List<Job> jobs;
}
