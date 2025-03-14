package com.jobportal.Service;

import com.jobportal.DTO.LoginDTO;
import com.jobportal.DTO.UserDTO;
import com.jobportal.Exception.JobPortalException;

public interface UserService {
    public UserDTO registerUser(UserDTO userDTO) throws JobPortalException;
    public UserDTO loginUser(LoginDTO loginDTO) throws JobPortalException;
}
