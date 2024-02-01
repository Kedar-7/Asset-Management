package com.hexaware.assetmanagement.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@Column(name = "UserId")
	private int userId;
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
    private String password;
	@Column(name = "Name")
    private String name;
	@Column(name = "Gender")
    private String gender;
	@Column(name = "ContactNumber")
    private String contactNumber;
	@Column(name = "Address")
    private String address;
	

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<AssetRequest> assetRequests;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<AssetServiceRequest> assetServiceRequests;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<AssetAudit> assetAudits;

	public User() {
		super();
	}

	public User(int userId, String username, String password, String name, String gender, String contactNumber,
			String address, List<AssetRequest> assetRequests, List<AssetServiceRequest> assetServiceRequests,
			List<AssetAudit> assetAudits) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.address = address;
		this.assetRequests = assetRequests;
		this.assetServiceRequests = assetServiceRequests;
		this.assetAudits = assetAudits;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<AssetRequest> getAssetRequests() {
		return assetRequests;
	}

	public void setAssetRequests(List<AssetRequest> assetRequests) {
		this.assetRequests = assetRequests;
	}

	public List<AssetServiceRequest> getAssetServiceRequests() {
		return assetServiceRequests;
	}

	public void setAssetServiceRequests(List<AssetServiceRequest> assetServiceRequests) {
		this.assetServiceRequests = assetServiceRequests;
	}

	public List<AssetAudit> getAssetAudits() {
		return assetAudits;
	}

	public void setAssetAudits(List<AssetAudit> assetAudits) {
		this.assetAudits = assetAudits;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}
    
    
}
