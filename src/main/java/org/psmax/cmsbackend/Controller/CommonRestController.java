package org.psmax.cmsbackend.Controller;

import org.psmax.cmsbackend.Entity.ClientMaster;
import org.psmax.cmsbackend.Repository.ClientMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.psmax.cmsbackend.Exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@CrossOrigin
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

    // Get a Single Client
    @GetMapping("/client/{id}")
    public ClientMaster getClientById(@PathVariable(value = "id") Long clientId) {
        return clientMasterRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("ClientMaster", "id", clientId));
    }


    // Update a Client
    @PutMapping("/client/{id}")
    public ClientMaster updateClientMaster(@PathVariable(value = "id") Long clientId,
                           @Valid @RequestBody ClientMaster clientMasterDetails ){

        ClientMaster clientMaster = clientMasterRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        clientMaster.setClientName(clientMasterDetails.getClientName());
        clientMaster.setCity(clientMasterDetails.getCity());
        clientMaster.setCopyRightsYear(clientMasterDetails.getCopyRightsYear());
        clientMaster.setCountry(clientMasterDetails.getCountry());
        clientMaster.setEmailId(clientMasterDetails.getEmailId());
        clientMaster.setCopyRightsYear(clientMasterDetails.getCopyRightsYear());
        clientMaster.setFacebookLink(clientMasterDetails.getFacebookLink());
        clientMaster.setPhoneNo(clientMasterDetails.getPhoneNo());
        clientMaster.setStreet(clientMaster.getStreet());
        clientMaster.setTwitterLink(clientMaster.getTwitterLink());
        clientMaster.setWebsiteName(clientMaster.getWebsiteName());

        ClientMaster updatedClient = clientMasterRepository.save(clientMaster);
        return updatedClient;
    }



    // Delete a Client
    @DeleteMapping("/client/{id}")
    public ResponseEntity<?> deleteClientMaster(@PathVariable(value = "id") Long clientId) {
        ClientMaster clientMaster = clientMasterRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("ClientMaster", "id", clientId));

        clientMasterRepository.delete(clientMaster);

        return ResponseEntity.ok().build();
    }





}
