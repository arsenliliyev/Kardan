package com.kardan.api.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="crated_at")
    protected LocalDateTime createdAt;

    @Column(name ="update_at")
    protected LocalDateTime updateDate;

    @Column(name="state")
    private boolean state;



}
