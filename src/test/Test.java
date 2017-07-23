package test;

import moka.basic.util.Util;

import java.math.BigDecimal;
import java.util.List;

public class Test {
    public static void main(String[] args){

        BigDecimal b1 = new BigDecimal("25000");
        BigDecimal b2 = new BigDecimal("7");

        BigDecimal b = Util.divide(b1,b2,1);
        List<BigDecimal> l = Util.average(b1,7);
        System.out.println(String.format("%s \n%s","2","3"));

        String msg = "1";
        msg = msg.concat("asd");
        System.out.println(msg);

        System.out.println(Util.Md532());
        System.out.println(Util.Md516());
    }
}
