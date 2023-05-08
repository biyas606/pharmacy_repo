package controllers;

import models.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import repositories.PharmacyRepository;

import java.util.HashMap;

@RestController
public class LoginController {

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

}
