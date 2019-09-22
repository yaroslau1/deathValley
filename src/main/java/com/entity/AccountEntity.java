package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "account", schema = "userbanklist", catalog = "")
public class AccountEntity {

    private int idAccount;
    private int account;
    private  int idUser;


    @Column(name = "idUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }



    @Id
    @Column(name = "idAccount", nullable = false)
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "account", nullable = false)
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (idAccount != that.idAccount) return false;
        if (account != that.account) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccount;
        result = 31 * result + account;
        return result;
    }
}
