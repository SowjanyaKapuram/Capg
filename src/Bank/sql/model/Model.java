package Bank.sql.model;

 

public class Model {

	 
		private String firstName;
		private String lastName;
		private long aadharNo;
		private  long accountNo;
		private String password;
		private  String accountType;
		private String panCard;
		private  long phoneNo;
		private String address;
		private Double balance;
		
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public Double getBalance() {
			return balance;
		}
		public void setBalance(Double balance) {
			this.balance = balance;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(long aadharNo) {
			this.aadharNo = aadharNo;
		}
		public long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}
		public String getPanCard() {
			return panCard;
		}
		public void setPanCard(String panCard) {
			this.panCard = panCard;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		 
		
		
		
		

	

}
