/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biometric_authentication_hand;

/**
 *
 * @author Himashi Nethinika
 */
public class Hand_Detail {
    
    //length of fingers from thumb to pinky
    private String length_finger1; 
    private String length_finger2; 
    private String length_finger3; 
    private String length_finger4; 
    private String length_finger5; 
    
    //length from finger tip to distal phalanx from thumb to pinky
    private String distal_finger1; 
    private String distal_finger2; 
    private String distal_finger3; 
    private String distal_finger4; 
    private String distal_finger5; 
    
    private String middle_phalanx_finger1; 
    private String middle_phalanx_finger2; 
    private String middle_phalanx_finger3; 
    private String middle_phalanx_finger4; 
    
    private String length1;
    private String length2;
    
    private String userName;

    public Hand_Detail(String length_finger1, String length_finger2, String length_finger3, String length_finger4, String length_finger5, String distal_finger1, String distal_finger2, String distal_finger3, String distal_finger4, String distal_finger5, String dist_finger1, String dist_finger2, String dist_finger3, String dist_finger4, String length1, String length2, String userName) {
        this.length_finger1 = length_finger1;
        this.length_finger2 = length_finger2;
        this.length_finger3 = length_finger3;
        this.length_finger4 = length_finger4;
        this.length_finger5 = length_finger5;
        this.distal_finger1 = distal_finger1;
        this.distal_finger2 = distal_finger2;
        this.distal_finger3 = distal_finger3;
        this.distal_finger4 = distal_finger4;
        this.distal_finger5 = distal_finger5;
        this.middle_phalanx_finger1 = dist_finger1;
        this.middle_phalanx_finger2 = dist_finger2;
        this.middle_phalanx_finger3 = dist_finger3;
        this.middle_phalanx_finger4 = dist_finger4;
        this.length1 = length1;
        this.length2 = length2;
        this.userName = userName;
    }

    public Hand_Detail(String length_finger1, String length_finger2, String length_finger3, String length_finger4, String length_finger5, String distal_finger1, String distal_finger2, String distal_finger3, String distal_finger4, String distal_finger5, String middle_phalanx_finger1, String middle_phalanx_finger2, String middle_phalanx_finger3, String middle_phalanx_finger4, String length1, String length2) {
        this.length_finger1 = length_finger1;
        this.length_finger2 = length_finger2;
        this.length_finger3 = length_finger3;
        this.length_finger4 = length_finger4;
        this.length_finger5 = length_finger5;
        this.distal_finger1 = distal_finger1;
        this.distal_finger2 = distal_finger2;
        this.distal_finger3 = distal_finger3;
        this.distal_finger4 = distal_finger4;
        this.distal_finger5 = distal_finger5;
        this.middle_phalanx_finger1 = middle_phalanx_finger1;
        this.middle_phalanx_finger2 = middle_phalanx_finger2;
        this.middle_phalanx_finger3 = middle_phalanx_finger3;
        this.middle_phalanx_finger4 = middle_phalanx_finger4;
        this.length1 = length1;
        this.length2 = length2;
    }
    
    

    /**
     * @return the length_finger1
     */
    public String getLength_finger1() {
        return length_finger1;
    }

    /**
     * @param length_finger1 the length_finger1 to set
     */
    public void setLength_finger1(String length_finger1) {
        this.length_finger1 = length_finger1;
    }

    /**
     * @return the length_finger2
     */
    public String getLength_finger2() {
        return length_finger2;
    }

    /**
     * @param length_finger2 the length_finger2 to set
     */
    public void setLength_finger2(String length_finger2) {
        this.length_finger2 = length_finger2;
    }

    /**
     * @return the length_finger3
     */
    public String getLength_finger3() {
        return length_finger3;
    }

    /**
     * @param length_finger3 the length_finger3 to set
     */
    public void setLength_finger3(String length_finger3) {
        this.length_finger3 = length_finger3;
    }

    /**
     * @return the length_finger4
     */
    public String getLength_finger4() {
        return length_finger4;
    }

    /**
     * @param length_finger4 the length_finger4 to set
     */
    public void setLength_finger4(String length_finger4) {
        this.length_finger4 = length_finger4;
    }

    /**
     * @return the length_finger5
     */
    public String getLength_finger5() {
        return length_finger5;
    }

    /**
     * @param length_finger5 the length_finger5 to set
     */
    public void setLength_finger5(String length_finger5) {
        this.length_finger5 = length_finger5;
    }

    /**
     * @return the distal_finger1
     */
    public String getDistal_finger1() {
        return distal_finger1;
    }

    /**
     * @param distal_finger1 the distal_finger1 to set
     */
    public void setDistal_finger1(String distal_finger1) {
        this.distal_finger1 = distal_finger1;
    }

    /**
     * @return the distal_finger2
     */
    public String getDistal_finger2() {
        return distal_finger2;
    }

    /**
     * @param distal_finger2 the distal_finger2 to set
     */
    public void setDistal_finger2(String distal_finger2) {
        this.distal_finger2 = distal_finger2;
    }

    /**
     * @return the distal_finger3
     */
    public String getDistal_finger3() {
        return distal_finger3;
    }

    /**
     * @param distal_finger3 the distal_finger3 to set
     */
    public void setDistal_finger3(String distal_finger3) {
        this.distal_finger3 = distal_finger3;
    }

    /**
     * @return the distal_finger4
     */
    public String getDistal_finger4() {
        return distal_finger4;
    }

    /**
     * @param distal_finger4 the distal_finger4 to set
     */
    public void setDistal_finger4(String distal_finger4) {
        this.distal_finger4 = distal_finger4;
    }

    /**
     * @return the distal_finger5
     */
    public String getDistal_finger5() {
        return distal_finger5;
    }

    /**
     * @param distal_finger5 the distal_finger5 to set
     */
    public void setDistal_finger5(String distal_finger5) {
        this.distal_finger5 = distal_finger5;
    }

    /**
     * @return the middle_phalanx_finger1
     */
    public String getMiddle_phalanx_finger1() {
        return middle_phalanx_finger1;
    }

    /**
     * @param middle_phalanx_finger1 the middle_phalanx_finger1 to set
     */
    public void setMiddle_phalanx_finger1(String middle_phalanx_finger1) {
        this.middle_phalanx_finger1 = middle_phalanx_finger1;
    }

    /**
     * @return the middle_phalanx_finger2
     */
    public String getMiddle_phalanx_finger2() {
        return middle_phalanx_finger2;
    }

    /**
     * @param dist_finger2 the middle_phalanx_finger2 to set
     */
    public void setMiddle_phalanx_finger2(String dist_finger2) {
        this.middle_phalanx_finger2 = dist_finger2;
    }

    /**
     * @return the middle_phalanx_finger3
     */
    public String getMiddle_phalanx_finger3() {
        return middle_phalanx_finger3;
    }

    /**
     * @param middle_phalanx_finger3 the middle_phalanx_finger3 to set
     */
    public void setMiddle_phalanx_finger3(String middle_phalanx_finger3) {
        this.middle_phalanx_finger3 = middle_phalanx_finger3;
    }

    /**
     * @return the middle_phalanx_finger4
     */
    public String getMiddle_phalanx_finger4() {
        return middle_phalanx_finger4;
    }

    /**
     * @param middle_phalanx_finger4 the middle_phalanx_finger4 to set
     */
    public void setMiddle_phalanx_finger4(String middle_phalanx_finger4) {
        this.middle_phalanx_finger4 = middle_phalanx_finger4;
    }

    /**
     * @return the length1
     */
    public String getLength1() {
        return length1;
    }

    /**
     * @param length1 the length1 to set
     */
    public void setLength1(String length1) {
        this.length1 = length1;
    }

    /**
     * @return the length2
     */
    public String getLength2() {
        return length2;
    }

    /**
     * @param length2 the length2 to set
     */
    public void setLength2(String length2) {
        this.length2 = length2;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
}
