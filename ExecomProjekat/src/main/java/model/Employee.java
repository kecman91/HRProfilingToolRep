package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@Column(name = "IDEMPLOYEE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmployee;
	
	@Column(name = "NAME_EMPLOYEE")
	private String nameEmployee;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Column(name = "ADRESS")
	private String address;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "EMERGENCY_PHONE_NUMBER")
	private String emergencyPhoneNumber;
	@Column(name = "START_DATE")
	private Date startDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = " START_DATE_FROM_BOOKLET")
	private Date startDateFromBooklet;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "ID_CARD_NUMBER")
	private String idCardNumber;
	@Column(name = " PASSPORT_NUMBER")
	private String passportNumber;
	@Column(name = "YEARS_OF_WORKING_EXP_IN_EXECOM")
	private int yearsOfWorkingExpInExecom;
	@Column(name = " YEARS_OF_WORKING_EXP")
	private int yearsOfWorking;
	
	@Column(name = "PLACE_OF_BIRTH")
	private String placeOfBirth;
	
	@Column(name = "TRAINING_LEARNING_PRIORITY")
	private String trainingLearningPriority;
	
	@Column(name = "LICENCES_CERTIFICATES")
	private String licencesCertificates;
	
	@Column(name = "AWARDS")
	private String awards;
	
	@Column(name = "CONTRACT_TYPE")
	private String contractType;
	
	@Column(name = "COMMUNICATION")
	private int communication;
	
	@Column(name = "FAST_LEARNING")
	private int fastLearning;
	
	@Column(name = "OPEN_TO_CHANGE")
	private int openToChange;
	
	@Column(name = "TEAM_PLAYER")
	private int teamPlayer;
	
	@Column(name = "PROACTIVE_COMMUNICATION")
	private int proactiveCommunication;
	
	@Column(name = "INTERPERSONAL_SKILLS")
	private int interpersonalSkills;
	
	@Column(name = "KNOWLEDGE_SHARING")
	private int knowledgeSharing;
	
	@Column(name = "JUDGEMENT")
	private int judgement;
	
	@Column(name = "DECISION_MAKING")
	private int decisionMaking;
	
	@Column(name = "INFLUENCING")
	private int influencing;
	
	@Column(name = "LEADERSHIP")
	private int leadership;
	
	@Column(name = "COACHING")
	private int coaching;
	
	@Column(name = "ORGANIZATIONAL_SKILLS")
	private int organizationalSkills;
	
	@OneToMany(mappedBy="employee")
	private List<TagCloudEmp> tagCloudEmps;
	
	@OneToMany(mappedBy="employee")
	private List<ProjectInfo> projectInfos;	
	
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmergencyPhoneNumber() {
		return emergencyPhoneNumber;
	}
	public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartDateFromBooklet() {
		return startDateFromBooklet;
	}
	public void setStartDateFromBooklet(Date startDateFromBooklet) {
		this.startDateFromBooklet = startDateFromBooklet;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIdCardNumber() {
		return idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public int getYearsOfWorkingExpInExecom() {
		return yearsOfWorkingExpInExecom;
	}
	public void setYearsOfWorkingExpInExecom(int yearsOfWorkingExpInExecom) {
		this.yearsOfWorkingExpInExecom = yearsOfWorkingExpInExecom;
	}
	public int getYearsOfWorking() {
		return yearsOfWorking;
	}
	public void setYearsOfWorking(int yearsOfWorking) {
		this.yearsOfWorking = yearsOfWorking;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getTrainingLearningPriority() {
		return trainingLearningPriority;
	}
	public void setTrainingLearningPriority(String trainingLearningPriority) {
		this.trainingLearningPriority = trainingLearningPriority;
	}
	public String getLicencesCertificates() {
		return licencesCertificates;
	}
	public void setLicencesCertificates(String licencesCertificates) {
		this.licencesCertificates = licencesCertificates;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public int getCommunication() {
		return communication;
	}
	public void setCommunication(int communication) {
		this.communication = communication;
	}
	public int getFastLearning() {
		return fastLearning;
	}
	public void setFastLearning(int fastLearning) {
		this.fastLearning = fastLearning;
	}
	public int getOpenToChange() {
		return openToChange;
	}
	public void setOpenToChange(int openToChange) {
		this.openToChange = openToChange;
	}
	public int getTeamPlayer() {
		return teamPlayer;
	}
	public void setTeamPlayer(int teamPlayer) {
		this.teamPlayer = teamPlayer;
	}
	public int getProactiveCommunication() {
		return proactiveCommunication;
	}
	public void setProactiveCommunication(int proactiveCommunication) {
		this.proactiveCommunication = proactiveCommunication;
	}
	public int getInterpersonalSkills() {
		return interpersonalSkills;
	}
	public void setInterpersonalSkills(int interpersonalSkills) {
		this.interpersonalSkills = interpersonalSkills;
	}
	public int getKnowledgeSharing() {
		return knowledgeSharing;
	}
	public void setKnowledgeSharing(int knowledgeSharing) {
		this.knowledgeSharing = knowledgeSharing;
	}
	public int getJudgement() {
		return judgement;
	}
	public void setJudgement(int judgement) {
		this.judgement = judgement;
	}
	public int getDecisionMaking() {
		return decisionMaking;
	}
	public void setDecisionMaking(int decisionMaking) {
		this.decisionMaking = decisionMaking;
	}
	public int getInfluencing() {
		return influencing;
	}
	public void setInfluencing(int influencing) {
		this.influencing = influencing;
	}
	public int getLeadership() {
		return leadership;
	}
	public void setLeadership(int leadership) {
		this.leadership = leadership;
	}
	public int getCoaching() {
		return coaching;
	}
	public void setCoaching(int coaching) {
		this.coaching = coaching;
	}
	public int getOrganizationalSkills() {
		return organizationalSkills;
	}
	public void setOrganizationalSkills(int organizationalSkills) {
		this.organizationalSkills = organizationalSkills;
	}
	public List<TagCloudEmp> getTagCloudEmps() {
		return tagCloudEmps;
	}
	public void setTagCloudEmps(List<TagCloudEmp> tagCloudEmps) {
		this.tagCloudEmps = tagCloudEmps;
	}
	public List<ProjectInfo> getProjectInfos() {
		return projectInfos;
	}
	public void setProjectInfos(List<ProjectInfo> projectInfos) {
		this.projectInfos = projectInfos;
	}	
}
