package com.devlCafe.dto;

import com.devlCafe.entity.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private String id;

    private String userPw;

    private Integer rankId;

    private String userEmail;

    private String userSsn;

    private String userName;


    public Users toEntity() {
        return Users.builder()
                .id(id)
                .userPw(userPw)
                .rankId(rankId)
                .userEmail(userEmail)
                .userSsn(userSsn)
                .userName(userName)
                .build();
    }

    @Builder
    public UserDto(String id,String userPw,Integer rankId,String userEmail,String userSsn,String userName) {
        this.id = id;
        this.userPw = userPw;
        this.rankId = rankId;
        this.userEmail = userEmail;
        this.userSsn = userSsn;
        this.userName = userName;
    }
}