package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "userbanklist", catalog = "")
public class UserEntity {
    private int idUser;
    private String nameUser;
    private String surnameUser;

    @Id
    @Column(name = "idUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "nameUser", nullable = false, length = 45)
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Basic
    @Column(name = "surnameUser", nullable = false, length = 45)
    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (nameUser != null ? !nameUser.equals(that.nameUser) : that.nameUser != null) return false;
        if (surnameUser != null ? !surnameUser.equals(that.surnameUser) : that.surnameUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (nameUser != null ? nameUser.hashCode() : 0);
        result = 31 * result + (surnameUser != null ? surnameUser.hashCode() : 0);
        return result;
    }
}
