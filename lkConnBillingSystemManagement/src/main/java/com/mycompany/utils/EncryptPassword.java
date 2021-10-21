/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 *
 * @author Suriya & Gowrisundar
 */
public class EncryptPassword {

    public static String getEncryptedPassword(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digestedPwd = md.digest(input.getBytes(StandardCharsets.UTF_8));
        BigInteger signInt = new BigInteger(1, digestedPwd);
        return signInt.toString(16);
    }
//    public static void main(String[] args) throws NoSuchAlgorithmException {
//        getEncryptedPassword("SuriyaKrishnan123!@#");
//    }

}
