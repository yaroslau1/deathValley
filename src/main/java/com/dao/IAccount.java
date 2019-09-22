package com.dao;

import com.entity.AccountEntity;

import java.util.List;

public interface IAccount {
    List<AccountEntity> selectUsers();
    void insertUsers(AccountEntity accountEntity );
    void  delete(AccountEntity  accountEntity );
    AccountEntity findById();
    List<AccountEntity> findBySum( int sum);


}
