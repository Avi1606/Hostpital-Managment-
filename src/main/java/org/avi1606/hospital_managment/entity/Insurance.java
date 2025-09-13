package org.avi1606.hospital_managment.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true , length = 50)
    private String policyNumber;

    @Column(nullable = false , length = 100)
    private String provider;

    @Column(nullable = false )
    private String validUntil;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private String createdAt;

    @OneToOne(mappedBy = "insurance")
    private Patient patient;
}
