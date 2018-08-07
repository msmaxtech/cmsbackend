package org.psmax.cmsbackend.Controller;

import org.psmax.cmsbackend.Entity.ClientMaster;
import org.psmax.cmsbackend.Repository.ClientMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/CommonConfig")
public class CommonRestController {

    @Autowired
    private ClientMasterRepository clientMasterRepository;




    // Client Master logic Start


    // Get Client List

    @GetMapping("/client/all")
    public Iterable<ClientMaster> getClientList(){

       return clientMasterRepository.findAll();
    }

    // Add New Client

    @PostMapping("client/add")
    public ClientMaster addClient(@RequestBody ClientMaster client){

        return clientMasterRepository.save(client);

    }






}
