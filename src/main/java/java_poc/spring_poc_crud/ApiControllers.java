package java_poc.spring_poc_crud;


import java_poc.spring_poc_crud.entity.UserEcart;
import java_poc.spring_poc_crud.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ecart")
public class ApiControllers {
    @Autowired
    private CartService service;

    @GetMapping("/")
    public List<UserEcart> viewAll(){
        return service.implementFindAll();
    }

    @PutMapping("/")
    public UserEcart progress(@RequestBody UserEcart details){
        return service.implementSave(details);
    }

    @DeleteMapping("/{parcellId}")
    public String discharge(@PathVariable("parcellId") Long parcellId){
        service.implementDelete(parcellId);
        return parcellId+" has discharged";
    }


    @PostMapping("/")
    public UserEcart ip(@RequestBody UserEcart details){
        return service.implementSave(details);
    }



    }


