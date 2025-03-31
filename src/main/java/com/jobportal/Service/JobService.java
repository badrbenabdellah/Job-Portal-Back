package com.jobportal.Service;

import com.jobportal.DTO.ApplicantDTO;
import com.jobportal.DTO.JobDTO;
import com.jobportal.DTO.ResponseDTO;
import com.jobportal.Exception.JobPortalException;
import jakarta.validation.Valid;

import java.util.List;

public interface JobService {
    public JobDTO postJob(JobDTO jobDTO) throws JobPortalException;
    public List<JobDTO> getAllJobs() throws JobPortalException;
    public JobDTO getJob(Long id) throws JobPortalException;

    public void  applyJob(Long id, ApplicantDTO applicantDTO) throws JobPortalException;
}
