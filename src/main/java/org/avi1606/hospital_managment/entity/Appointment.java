package org.avi1606.hospital_managment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CurrentTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CurrentTimestamp
    private LocalDateTime dateTime;

    private String description;

    private String status;

    @Column(nullable = false)
    private Long drId;

    @ManyToOne
    @JoinColumn(name = "Patient_id",nullable = false) // owner side
    private Patient patient;

}
