package vo;

public class UserVO {
	private int userNumber;
	private String userId;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String userNickname;
	private String userEmail;
	private String userAddress;
	private String userBirth;
	private String userGender;
	private String userRecommenderId;
	
	public UserVO() {;}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserRecommenderId() {
		return userRecommenderId;
	}

	public void setUserRecommenderId(String userRecommenderId) {
		this.userRecommenderId = userRecommenderId;
	}
	
	@Override
	public String toString() {
		String str = userNumber + ","
		 + userId + ","
		 + userName + ","
		 + userPassword + ","
		 + userPhone + ","
		 + userNickname + ","
		 + userEmail + ","
		 + userAddress + ","
		 + userBirth + ","
		 + userGender + ","
		 + userRecommenderId;
		
		return str;
	}
}
