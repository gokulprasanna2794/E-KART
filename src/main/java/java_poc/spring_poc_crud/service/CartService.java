package java_poc.spring_poc_crud.service;


import java_poc.spring_poc_crud.Repo.EcartRepo;
import java_poc.spring_poc_crud.entity.UserEcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CartService {
    @Autowired
    EcartRepo remote;

//    public UserEcart implementSave(UserEcart courier){
//        return remote.save(courier);
//    }

    public void implementDelete(Long parcellId){
        remote.deleteById(parcellId);
    }



    public List<UserEcart> implementFindAll(){
        return remote.findAll();
    }


    public UserEcart implementSave(UserEcart details ){
        return remote.save(details);
    }







}
