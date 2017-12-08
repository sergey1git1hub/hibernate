package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "USER_DETAILS")
public class UserDetails {

	int userId;
	
	@Id
	@Column(name = "USER_ID")
	public int getUserId() {
		return userId;
	}
	

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName + " from getter.";
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	String userName;
}
