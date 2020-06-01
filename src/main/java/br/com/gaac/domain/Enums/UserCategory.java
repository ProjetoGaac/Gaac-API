/** Enum content the actors of the system 
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain.Enums;

public enum UserCategory {

	
	GENERAL_MANAGER(0,"ROLE_GENERAL_MANAGER"),
	GENERAL_MANAGER_COURSE(1,"ROLE_GENERAL_MANAGER_COURSE"),
	COURSE_ADMINISTRATOR(2, "ROLE_COURSE_ADMINISTRATOR"),
	COURSE_ADMINISTRATOR_GENERAL(3, "ROLE_COURSE_ADMINISTRATOR_GENERAL"),
	TEACHER(4, "ROLE_TEACHER"),
	TEACHER_ADMINISTRATOR(5, "ROLE_TEACHER_ADMINISTRATOR"),
	STUDENT(6, "ROLE_STUDENT"),
	SPECIAL_STUDENT(7, "ROLE_SPECIAL_STUDENT");
	
	private int code;
	private String description;
	
	
	private UserCategory(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescricao(String description) {
		this.description = description;
	}
	
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
