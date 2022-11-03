package onboarding.problem6;

public class Form {
	private final String email;
	private final String nickName;

	public Form(String email, String nickName) {
		this.email = email;
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public String getNickName() {
		return nickName;
	}
}
