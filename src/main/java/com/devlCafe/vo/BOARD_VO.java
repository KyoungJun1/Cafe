package com.devlCafe.vo;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BOARD")
@Entity
@DynamicInsert
@DynamicUpdate
public class BOARD_VO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BOARD_NUM;

    @Column
    private String USER_ID;
    @Column
    private String BOARD_TYPE;
    @Column
    private String BOARD_TITLE;
    @Column
    private Timestamp BOARD_CREATEDATE;
    @Column
    private Timestamp BOARD_MODIFYDATE;
    @Column
    private String BOARD_CONTENT;
    @Column
    private int BOARD_VIEWS;
}
