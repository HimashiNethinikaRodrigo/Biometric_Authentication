/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric_authentication_hand;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import database.Hand_detail_database;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Himashi Nethinika
 */
public class HandDetailController {

    public int addNewUser(Hand_Detail hand_Detail) throws ClassNotFoundException, SQLException {
       
        Hand_Detail encryptedData = getEncryptedData(hand_Detail);
        encryptedData.setUserName(hand_Detail.getUserName());
        int addNewUser = new Hand_detail_database().addNewUser(encryptedData);
        return addNewUser;

    }
    
        public String searchUser(Hand_Detail hand_Detail) throws ClassNotFoundException, SQLException {
        String addNewUser = new Hand_detail_database().searchUser(getEncryptedData(hand_Detail));
        return addNewUser;

    }

    public Hand_Detail getEncryptedData(Hand_Detail hand_Detail) {
        //round off values to first decimal place
        double text1 = Math.round(Double.parseDouble(hand_Detail.getLength_finger1()) * 10.0) / 10.0;
        double text2 = Math.round(Double.parseDouble(hand_Detail.getLength_finger2()) * 10.0) / 10.0;
        double text3 = Math.round(Double.parseDouble(hand_Detail.getLength_finger3()) * 10.0) / 10.0;
        double text4 = Math.round(Double.parseDouble(hand_Detail.getLength_finger4()) * 10.0) / 10.0;
        double text5 = Math.round(Double.parseDouble(hand_Detail.getLength_finger5()) * 10.0) / 10.0;

        double text6 = Math.round(Double.parseDouble(hand_Detail.getDistal_finger1()) * 10.0) / 10.0;
        double text7 = Math.round(Double.parseDouble(hand_Detail.getDistal_finger2()) * 10.0) / 10.0;
        double text8 = Math.round(Double.parseDouble(hand_Detail.getDistal_finger3()) * 10.0) / 10.0;
        double text9 = Math.round(Double.parseDouble(hand_Detail.getDistal_finger4()) * 10.0) / 10.0;
        double text10 = Math.round(Double.parseDouble(hand_Detail.getDistal_finger5()) * 10.0) / 10.0;

        double text11 = Math.rint(Double.parseDouble(hand_Detail.getMiddle_phalanx_finger1()) * 10.0) / 10.0;
        double text12 = Math.rint(Double.parseDouble(hand_Detail.getMiddle_phalanx_finger2()) * 10.0) / 10.0;
        double text13 = Math.rint(Double.parseDouble(hand_Detail.getMiddle_phalanx_finger3()) * 10.0) / 10.0;
        double text14 = Math.rint(Double.parseDouble(hand_Detail.getMiddle_phalanx_finger4()) * 10.0) / 10.0;

        double text15 = Math.round(Double.parseDouble(hand_Detail.getLength1()) * 10.0) / 10.0;
        double text16 = Math.round(Double.parseDouble(hand_Detail.getLength2()) * 10.0) / 10.0;

        ArrayList<Double> list = new ArrayList<>();
        list.add(text1);
        list.add(text2);
        list.add(text3);
        list.add(text4);
        list.add(text5);
        list.add(text6);
        list.add(text7);
        list.add(text8);
        list.add(text9);
        list.add(text10);
        list.add(text11);
        list.add(text12);
        list.add(text13);
        list.add(text14);
        list.add(text15);
        list.add(text16);

        ArrayList<String> send_db = new ArrayList<>();

        for (Double text_value : list) {
            String encryptData = encryptData(text_value);
            send_db.add(encryptData);
        }

        return new Hand_Detail(send_db.get(0), send_db.get(1), send_db.get(2), send_db.get(3), send_db.get(4), send_db.get(5), send_db.get(6), send_db.get(7), send_db.get(8), send_db.get(9), send_db.get(10), send_db.get(11), send_db.get(12), send_db.get(13), send_db.get(14), send_db.get(15));

    }


    //encrypt data before saving
    public String encryptData(double data) {
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        String numberAsString = sb.toString();
        String encodeToString = null;
        try {
            byte[] bytes = numberAsString.getBytes("UTF-8");
            encodeToString = DatatypeConverter.printBase64Binary(bytes);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(HandDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encodeToString;
    }
}
