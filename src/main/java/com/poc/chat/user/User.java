package com.poc.chat.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
    private Boolean admin;

    public String getNickName() {
        return nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public Status getStatus() {
        return status;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}