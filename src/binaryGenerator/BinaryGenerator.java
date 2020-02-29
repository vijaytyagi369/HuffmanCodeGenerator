/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToBinaryString() {
        StringBuilder as=new StringBuilder("");
        String[] binaryString=new String[userInputStringInLowerCase.length()];
        int reqzero=0;
        for (int i = 0; i <userInputStringInLowerCase.length() ; i++) {
            binaryString[i]=Integer.toBinaryString(userInputStringInLowerCase.charAt(i));
            reqzero = 8-binaryString[i].length();
            binaryString[i]="0".repeat(reqzero)+binaryString[i];
            as=as.append(binaryString[i]);
        }
        System.out.println("Binary String :- "+as);
        return as.toString();
    }
}
