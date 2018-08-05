package org.psmax.cmsbackend.Controller;

import org.psmax.cmsbackend.Entity.UserMaster;
import org.psmax.cmsbackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController{

    @Autowired
   private UserRepository userRepository;

    @GetMapping(path = "/welcome")
public String newmethod(){

    return "Welcome";
}

    @GetMapping(path="/add") // Map ONLY GET Requests
    public
    String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        UserMaster n = new UserMaster();
        n.setUserName(name);
        n.setUserId(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public Iterable<UserMaster> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }




}

