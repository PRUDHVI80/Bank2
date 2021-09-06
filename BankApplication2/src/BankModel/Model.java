package BankModel;

import java.sql.Date;

public class Model 
{
	private int AccountNumber;
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public int getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}
	public int getAverageBalance() {
		return AverageBalance;
	}
	public void setAverageBalance(int averageBalance) {
		AverageBalance = averageBalance;
	}
	public int getCuid() {
		return cuid;
	}
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	private String AccountType;
	private int AccountBalance;
	private int AverageBalance;
	private int cuid;
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPanNo() {
		return PanNo;
	}
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	private String UserName;
    private int PhoneNo;
	private String Address;
	private String City;
	private int Pincode;
	private String Country;
	private String PanNo;
	private String  EMail;
	private Date  DOB;
	private Date Date;
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getCreditDebitAmount() {
		return CreditDebitAmount;
	}
	public void setCreditDebitAmount(int creditDebitAmount) {
		CreditDebitAmount = creditDebitAmount;
	}
	public int getClosingBalance() {
		return ClosingBalance;
	}
	public void setClosingBalance(int closingBalance) {
		ClosingBalance = closingBalance;
	}
	private String Description;
	private int CreditDebitAmount;
	private int ClosingBalance;

}
