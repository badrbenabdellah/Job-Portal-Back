package com.jobportal.Service;

import com.jobportal.DTO.UserDTO;
import com.jobportal.Exception.JobPortalException;

public interface UserService {
    public UserDTO registerUser(UserDTO userDTO) throws JobPortalException;
}
