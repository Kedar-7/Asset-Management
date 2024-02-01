package com.hexaware.assetmanagement.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AssetServiceRequests")
public class AssetServiceRequest {
	
	@Id
	@Column(name = "ServiceRequestID")
	private int serviceRequestId;
	@Column(name = "EmployeeID")
    private int employeeId;
	@Column(name = "AssetID")
    private int assetId;
	@Column(name = "IssueType")
    private String issueType;
	@Column(name = "DateRequested")
    private Date dateRequested;
	@Column(name = "Status")
    private String status;
	
	@ManyToOne
    @JoinColumn(name = "EmployeeID")
    private User employee;

    @ManyToOne
    @JoinColumn(name = "AssetID")
    private Asset asset;

	public AssetServiceRequest() {
		super();
	}

	public AssetServiceRequest(int serviceRequestId, int employeeId, int assetId, String issueType, Date dateRequested,
			String status, User employee, Asset asset) {
		super();
		this.serviceRequestId = serviceRequestId;
		this.employeeId = employeeId;
		this.assetId = assetId;
		this.issueType = issueType;
		this.dateRequested = dateRequested;
		this.status = status;
		this.employee = employee;
		this.asset = asset;
	}

	public int getServiceRequestId() {
		return serviceRequestId;
	}

	public void setServiceRequestId(int serviceRequestId) {
		this.serviceRequestId = serviceRequestId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Date getDateRequested() {
		return dateRequested;
	}

	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getEmployee() {
		return employee;
	}

	public void setEmployee(User employee) {
		this.employee = employee;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "AssetServiceRequest [serviceRequestId=" + serviceRequestId + ", employeeId=" + employeeId + ", assetId="
				+ assetId + ", issueType=" + issueType + ", dateRequested=" + dateRequested + ", status=" + status
				+ ", employee=" + employee + ", asset=" + asset + "]";
	}
    
    
}
