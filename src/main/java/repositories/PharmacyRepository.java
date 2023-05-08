package repositories;

import models.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PharmacyRepository extends JpaRepository<LoginModel,Integer> {

    @Query(value = "select count(*) from pharmacy_users where user_name=:username and user_password=:password",nativeQuery = true)
    public int login(@Param("username") String username, @Param("password") String password);



}
