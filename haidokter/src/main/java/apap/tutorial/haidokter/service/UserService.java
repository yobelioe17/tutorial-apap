package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.UserModel;

public interface UserService{
    UserModel addUser(UserModel user);

    String encrypt(String password);

    UserModel getUserByUsername(String username);

    void updatePassword(UserModel userModel,String password);

}