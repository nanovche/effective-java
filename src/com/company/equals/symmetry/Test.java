package com.company.equals.symmetry;

import com.company.equals.symmetry.CaseInsensitiveString;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);


        System.out.println(list.contains(s));

    }

}
