package org.avi1606.hospital_managment.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CurrentTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CurrentTimestamp
    private LocalDateTime dateTime;

    private String description;

    private String status;

    @ManyToOne
    @JoinColumn(name = "Patient_id",nullable = false) // owner side
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "Doctor_id",nullable = false)
    private Doctor doctor;

}
