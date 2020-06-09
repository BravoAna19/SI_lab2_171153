package main.java;

public class SILab2 {
	public boolean function (User user, List<String> allUsers) {		//A
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";		//B
        if (user!=null) {							//C
            if (user.getUsername()!=null && user.getPassword()!=null) {		//D
                String password = user.getPassword();				//E
                String passwordLower = password.toLowerCase();			//F
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) {	//G
                    boolean digit = false, upper = false, special = false;	//H
                    for (int i=0;i<password.length();i++) {			//I
                        if (Character.isDigit(password.charAt(i)))		//J
                            digit = true;					//K
                        if (Character.isUpperCase(password.charAt(i)))		//L
                            upper = true;					//M
                        if (specialCharacters.contains(String.valueOf(password.charAt(i))))			//N
                            special = true;					//O
                    }								
                    if (digit && upper && special)				//P
                        return true;						//Q
                }
            }
        }
        return false;				//R
    }						//S
}
