package com.jobportal.API;


import com.jobportal.DTO.ProfileDTO;
import com.jobportal.Exception.JobPortalException;
import com.jobportal.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Validated
@RequestMapping("/profiles")
public class ProfileAPI {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/get/{id}")
    public ResponseEntity<ProfileDTO> getProfile(@PathVariable Long id) throws JobPortalException {
        return new ResponseEntity<>(profileService.getProfile(id), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ProfileDTO> updateProfile(@RequestBody ProfileDTO profileDTO) throws JobPortalException {
        return new ResponseEntity<>(profileService.updateProfile(profileDTO), HttpStatus.CREATED);
    }
}
