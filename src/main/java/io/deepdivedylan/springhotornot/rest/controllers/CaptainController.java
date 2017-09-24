package io.deepdivedylan.springhotornot.rest.controllers;

import io.deepdivedylan.springhotornot.rest.dto.CaptainDTO;
import io.deepdivedylan.springhotornot.services.CaptainService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/captain")
public class CaptainController {
    private CaptainService admirality;

    @GetMapping(value = "/{captainId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public CaptainDTO getCaptain(Long captainId) {
        return(admirality.getCaptain(captainId));
    }

    @GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<CaptainDTO> getAllCaptains() {
        return(admirality.getAllCaptains());
    }

}
