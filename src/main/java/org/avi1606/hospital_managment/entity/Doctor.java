package org.avi1606.hospital_managment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false,unique = true)
    private String email;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointment;

    @ManyToMany(mappedBy = "doctors")
    private List<Deparatment> departments;
}
