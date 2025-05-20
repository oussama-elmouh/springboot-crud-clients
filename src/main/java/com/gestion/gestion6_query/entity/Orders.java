package com.gestion.gestion6_query.entity;



import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float total;

    @Temporal(TemporalType.DATE)
    private Date dateC;
}
