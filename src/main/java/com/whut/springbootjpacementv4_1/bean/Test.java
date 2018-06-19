package com.whut.springbootjpacementv4_1.bean;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        String pas="dadadadad";
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String pasencode=bCryptPasswordEncoder.encode(pas);
        String pasencode2=bCryptPasswordEncoder.encode(pas);
        System.out.println(pasencode);
        System.out.println(pasencode2);

    }
}
