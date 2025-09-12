package org.avi1606.hospital_managment.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.avi1606.hospital_managment.entity.type.bloodGroup;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(
        name = "patient_list",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email"})      //every email must be unique
        },
        indexes = {@Index(name = "idx_patient_birthdate",columnList = "birthDate")}

)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "patient")
    private String name;

    private String email;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group")
    private bloodGroup bloodGroup;

    @OneToOne
    @JoinColumn(name = "patient_insurance_id")
    private Insurance insurance;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointment;


}
