package com.devlCafe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "STATUS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @Id
    @Column(name = "USER_ID", nullable = false, length = 30)
    private String id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private Users user;

    @Column(name = "SATUS_MUSIC", length = 100)
    private String satusMusic;

    @Column(name = "STATUS_FONT", length = 100)
    private String statusFont;

    @Column(name = "REGISTER_DATE")
    private LocalDate registerDate;

}