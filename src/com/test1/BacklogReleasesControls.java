package com.test1;

public class BacklogReleasesControls {
	private Integer backlogReleaseIndicator;
	private String deploymentMode;
	private String adoEnabled;
	private String adoAttestations;
	private String adoMigratedOn;
	private Integer reposMigrated;
	private boolean testControlsMet;
	private boolean testEvidencesAttached;
	private Integer testCoverage;
	private String testManagerContact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BacklogReleasesControls() {

	}

	public BacklogReleasesControls(Integer backlogReleaseIndicator, String deploymentMode, String adoEnabled,
			String adoAttestations, String adoMigratedOn, Integer reposMigrated, boolean testControlsMet,
			boolean testEvidencesAttached, Integer testCoverage, String testManagerContact, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.backlogReleaseIndicator = backlogReleaseIndicator;
		this.deploymentMode = deploymentMode;
		this.adoEnabled = adoEnabled;
		this.adoAttestations = adoAttestations;
		this.adoMigratedOn = adoMigratedOn;
		this.reposMigrated = reposMigrated;
		this.testControlsMet = testControlsMet;
		this.testEvidencesAttached = testEvidencesAttached;
		this.testCoverage = testCoverage;
		this.testManagerContact = testManagerContact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getBacklogReleaseIndicator() {
		return backlogReleaseIndicator;
	}

	public void setBacklogReleaseIndicator(Integer backlogReleaseIndicator) {
		this.backlogReleaseIndicator = backlogReleaseIndicator;
	}

	public String getDeploymentMode() {
		return deploymentMode;
	}

	public void setDeploymentMode(String deploymentMode) {
		this.deploymentMode = deploymentMode;
	}

	public String getAdoEnabled() {
		return adoEnabled;
	}

	public void setAdoEnabled(String adoEnabled) {
		this.adoEnabled = adoEnabled;
	}

	public String getAdoAttestations() {
		return adoAttestations;
	}

	public void setAdoAttestations(String adoAttestations) {
		this.adoAttestations = adoAttestations;
	}

	public String getAdoMigratedOn() {
		return adoMigratedOn;
	}

	public void setAdoMigratedOn(String adoMigratedOn) {
		this.adoMigratedOn = adoMigratedOn;
	}

	public Integer getReposMigrated() {
		return reposMigrated;
	}

	public void setReposMigrated(Integer reposMigrated) {
		this.reposMigrated = reposMigrated;
	}

	public boolean isTestControlsMet() {
		return testControlsMet;
	}

	public void setTestControlsMet(boolean testControlsMet) {
		this.testControlsMet = testControlsMet;
	}

	public boolean isTestEvidencesAttached() {
		return testEvidencesAttached;
	}

	public void setTestEvidencesAttached(boolean testEvidencesAttached) {
		this.testEvidencesAttached = testEvidencesAttached;
	}

	public Integer getTestCoverage() {
		return testCoverage;
	}

	public void setTestCoverage(Integer testCoverage) {
		this.testCoverage = testCoverage;
	}

	public String getTestManagerContact() {
		return testManagerContact;
	}

	public void setTestManagerContact(String testManagerContact) {
		this.testManagerContact = testManagerContact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
