package com.nnxi.auth;

public interface UserDao {
    boolean verifyPassword(String AccountId, String passWord);
}
