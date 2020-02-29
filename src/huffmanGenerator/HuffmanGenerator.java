/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package huffmanGenerator;

public class HuffmanGenerator {
    private String userInputStringInLowerCase;

    public HuffmanGenerator(String userInputStringInLowerCase) {

        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToHuffmanString() {
        String[] huffman=new String[]{"1010","100000","00000","10110","010","110011","1000010","0001","01110","1100001010","11000011","10111","110010","01111","1001","100001",
                "1100001001","0010","0011","1101","00001","1100000","110001","1100001000","100011","1100001010"};
        StringBuilder hf=new StringBuilder("");
        for (int i = 0; i <userInputStringInLowerCase.length() ; i++) {
            hf=hf.append(huffman[userInputStringInLowerCase.charAt(i)-97]);
        }
        System.out.println("Huffman String:- "+hf);


        return hf.toString();
    }
}
