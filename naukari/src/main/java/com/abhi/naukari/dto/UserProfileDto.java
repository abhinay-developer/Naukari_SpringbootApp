package com.abhi.naukari.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDto {
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
    private String id;
	private String createdDate;
	private String modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private String status;
}
