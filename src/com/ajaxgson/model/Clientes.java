package com.ajaxgson.model;
import java.util.Date;

public class Clientes {
	private int idClient;
	private String ClientName;
	private Date BirthDate;
	private Date BirthTime;
	private String BloodType;
	private String MaritalStatus;
	private String Sex;
	
	//Get and Set methods
	
	public void setIdClient(int idClient)
	{
		this.idClient=idClient;
	}
	public int getIdCliente()
	{
		return idClient;
	}
	public void setClientName(String ClientName)
	{
		this.ClientName=ClientName;
	}
	public String getClientName()
	{
		return ClientName;
	}
	public void setBirthDate(Date BirthDate)
	{
		this.BirthDate=BirthDate;
	}
	public Date getBirthDate()
	{
		return BirthDate;
	}
	
	public void setBirthTime(Date BirthTime)
	{
		this.BirthTime=BirthTime;
	}
	public Date getBirthTime()
	{
		return BirthTime;
	}
	
	public String getBloodType() {
		return BloodType;
	}
	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	
}
