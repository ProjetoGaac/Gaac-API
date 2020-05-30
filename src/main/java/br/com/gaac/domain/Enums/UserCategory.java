/** Enum content the actors of the system 
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain.Enums;

public enum UserCategory {

	/** Constant that represents the General Manager */
	GENERAL_MANAGER(0,"ROLE_GENERAL_MANAGER"),
	
	/** Constant that represents the General Manager Course */
	GENERAL_MANAGER_COURSE(1,"ROLE_GENERAL_MANAGER_COURSE"),
	
	/** Constant that represent the Course Administrator */
	COURSE_ADMINISTRATOR(2, "ROLE_COURSE_ADMINISTRATOR"),
	
	/** Constant that represent the Course Administrator General */
	COURSE_ADMINISTRATOR_GENERAL(3, "ROLE_COURSE_ADMINISTRATOR_GENERAL"),
	
	/** Constant that represent the Teacher */
	TEACHER(4, "ROLE_TEACHER"),
	
	/** Constant that represent the Teacher Administrator */
	TEACHER_ADMINISTRATOR(5, "ROLE_TEACHER_ADMINISTRATOR"),
	
	/** Constant that represent the Student */
	STUDENT(6, "ROLE_STUDENT"),
	
	/** Constant that represent the Special Student */
	SPECIAL_STUDENT(7, "ROLE_SPECIAL_STUDENT");
	
	private int code;
	private String description;
	
	
	/** Default Constructor
	 * @param int - code
	 * @param String - description */
	private UserCategory(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	/** Method to return the code
	 * @return int - Code */
	public int getCode() {
		return code;
	}

	/** Method to set the code
	 * @param int - Code */
	public void setCode(int code) {
		this.code = code;
	}

	/** Method to return the description
	 * @return String - description */
	public String getDescription() {
		return description;
	}

	/** Method to set the description
	 * @param String - description */
	public void setDescricao(String description) {
		this.description = description;
	}
	
	/** Method to get a userCategory from code
	 * @param Integer - code */
	public static UserCategory toEnum(Integer code) {
		if(code == null) {
			return null;
		}
		
		for(UserCategory x: UserCategory.values()) {
			if(code.equals(x.getCode())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Invalid id " + code);
	}
	
}
