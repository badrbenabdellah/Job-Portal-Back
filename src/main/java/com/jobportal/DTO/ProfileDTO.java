package com.jobportal.DTO;

import com.jobportal.Entity.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Base64;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileDTO {
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String company;
    private String location;
    private String about;
    private String picture;
    private Long totalExp;
    private List<String> skills;
    private List<Experience> experiences;
    private List<Certification> certifications;
    private List<Long>savedJobs;
    /*public Long getId() {
        return null;this.picture!=null?Base64.getDecoder().decode(this.picture):null
    }*/
    public Profile toEntity() {
        return new Profile( this.id, this.name, this.email, this.jobTitle, this.company, this.location,
                this.about, this.picture != null ? Base64.getDecoder().decode(this.picture) : null,
                this.totalExp, this.skills, this.experiences, this.certifications, this.savedJobs);
    }
}
