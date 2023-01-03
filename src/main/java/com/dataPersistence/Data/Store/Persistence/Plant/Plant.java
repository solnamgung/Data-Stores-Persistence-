package com.dataPersistence.Data.Store.Persistence.Plant;

import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Plant {

    @Id
    @GeneratedValue
    private Long id;

    @JsonView(Views.Public.class)
    @Nationalized // should use @Nationalized instead of @Type=nstring
    private String name;

    @JsonView(Views.Public.class)
    @Column(precision=12, scale=4)
    private BigDecimal price; // BigDecimal is the standard Java class for currency math

    @ManyToOne //many plants can belong to one delivery
    @JoinColumn(name = "delivery_id")  //map the join column in the plant table
    private Delivery delivery;

    /* getters and setters*/
}
