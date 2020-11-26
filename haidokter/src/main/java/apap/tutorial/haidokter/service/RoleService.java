package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.RoleModel;

import java.util.List;

public interface RoleService{
    RoleModel addRole(RoleModel role);
    List<RoleModel> findAll();
}