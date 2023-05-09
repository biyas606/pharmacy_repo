package controllers;

import models.LoginModel;
import models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import repositories.PharmacyRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    UserModel GlobalUserModel = new UserModel();
    List<UserModel> userLists = new ArrayList<>();

    @Autowired
    PharmacyRepository pharmacyRepository;

    @PostMapping(path = "login", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public HashMap login(@RequestBody LoginModel loginModel) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int value=pharmacyRepository.login(loginModel.getUserName(), loginModel.getPassword());
        //System.out.println("value"+value);
        if(value>=1)
            hashMap.put("status","Login success");
        else
            hashMap.put("status","Login failed");
        return hashMap;
    }

    @PostMapping(path = "adduser", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public HashMap addUser(@RequestBody UserModel userModel) {
        GlobalUserModel = userModel;
        pharmacyRepository.save(userModel);
        userLists.add(userModel);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("status", "User successfully added");
        hashMap.put("data", userLists);
        return hashMap;
    }






}
