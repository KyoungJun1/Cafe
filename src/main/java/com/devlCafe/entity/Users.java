package com.devlCafe.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {
    @Id
    @Column(name = "USER_ID", nullable = false, length = 30)
    private String id;

    @Column(name = "RANK_ID", nullable = false)
    private Integer rankId;

    @Column(name = "USER_PW", nullable = false, length = 30)
    private String userPw;

    @Column(name = "USER_EMAIL", nullable = false, length = 50)
    private String userEmail;

    @Column(name = "USER_EMAIL_AUTH_CODE", length = 10)
    private String userEmailAuthCode;

    @Column(name = "USER_AUTH_STATUS", length = 1)
    private String userAuthStatus;

    @Column(name = "USER_PHONE_NUMBER", length = 15)
    private String userPhoneNumber;

    @Column(name = "USER_ADDRESS", length = 100)
    private String userAddress;

    @Column(name = "USER_PROFILE_IMAGE", length = 150)
    private String userProfileImage;

    @Column(name = "USER_LOGIN_FAIL_COUNT")
    private Integer userLoginFailCount;

    @Column(name = "USER_SSN", nullable = false, length = 14)
    private String userSsn;

    @Column(name = "USER_POINT")
    private Integer userPoint;

    @Column(name = "USER_YN", length = 1)
    private String userYn;

    @Column(name = "USER_AVAIL_RESOURCE")
    private Integer userAvailResource;

    @Column(name = "USER_LAST_LOGIN_DATE")
    private LocalDate userLastLoginDate;

    @Column(name = "CREATED_DATE")
    private LocalDate createdDate;

    @Column(name = "UPDATED_DATE")
    private LocalDate updatedDate;

    @Column(name = "LAST_LOGIN_DATE")
    private LocalDate lastLoginDate;

    @Column(name = "USER_NAME", nullable = false, length = 10)
    private String userName;

}