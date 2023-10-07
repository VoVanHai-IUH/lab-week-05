package vn.edu.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    @Column(name = "number", length = 20)
    private String number;
    @Column(name = "Street", length = 150)
    private String Street;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "zipcode", length = 7)
    private String zipcode;
    @Column(name = "country", length = 30)
    private CountryCode country;


    public Address(String number, String street, String city, String zipcode, CountryCode country) {
        this.number = number;
        Street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

//    @OneToOne
//    @JoinColumn
//    private Candidate candidate;
//
//    @OneToOne
//    @JoinColumn
//    private Company company;
}
