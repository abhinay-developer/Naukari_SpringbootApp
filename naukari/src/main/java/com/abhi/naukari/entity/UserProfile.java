package com.abhi.naukari.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "USER_PROFILE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile extends ObjectUtil{
    private String firstName;
    private String lastName;
    private String username;
    private String fullName;
    private String emailId;
    private String password;
    private String organisationName;
    private String totalExpInYears;
    private String totalExpInMonths;
    private String annualSalary;
    private String currentLocation;
    private Long   mobileNumber;
    private Long  telePhoneNumber;
    private String noticePeriod;    
}
