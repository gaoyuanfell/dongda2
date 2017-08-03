package moka.basic.util;

import moka.basic.exception.BusinessRuntimeException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by moka on 2017/4/25 0025.
 */
public class Util {

    public static String getTokenMd5() {
        BigDecimal time = BigDecimal.valueOf(System.currentTimeMillis());
        BigDecimal random = BigDecimal.valueOf(Math.floor(Math.random() * 1000));
        BigDecimal t = time.add(random);
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(t.toString().getBytes());
            return new BigInteger(1, md5.digest()).toString(16);
        } catch (Exception e) {
            throw new BusinessRuntimeException(e.getMessage(), e);
        }
    }

    private static StringBuffer Md5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf;
        } catch (Exception e) {
            return null;
        }
    }

    public static String Md516() {
        BigDecimal time = BigDecimal.valueOf(System.currentTimeMillis());
        BigDecimal random = BigDecimal.valueOf(Math.floor(Math.random() * 1000));
        BigDecimal str = time.add(random);
        StringBuffer sb = Md5(str.toString());
        if (sb != null) {
            return sb.toString().substring(8, 24);
        }
        return null;
    }

    public static String Md516(String str) {
        StringBuffer sb = Md5(str);
        if (sb != null) {
            return sb.toString().substring(8, 24);
        }
        return null;
    }

    public static String Md532() {
        BigDecimal time = BigDecimal.valueOf(System.currentTimeMillis());
        BigDecimal random = BigDecimal.valueOf(Math.floor(Math.random() * 1000));
        BigDecimal str = time.add(random);
        StringBuffer sb = Md5(str.toString());
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }

    public static String Md532(String str) {
        StringBuffer sb = Md5(str);
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public static String getMd5String(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            return new BigInteger(1, md5.digest()).toString(16);
        } catch (Exception e) {
            throw new BusinessRuntimeException(e.getMessage(), e);
        }
    }

    public static String dateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

    public static String dateFormat(Date d) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(d);
    }

    public static int differentDay(Date start, Date end) {
        Calendar sCalendar = Calendar.getInstance();
        sCalendar.setTime(start);
        Calendar eCalendar = Calendar.getInstance();
        eCalendar.setTime(end);
        int sd = sCalendar.get(Calendar.DAY_OF_YEAR);
        int ed = eCalendar.get(Calendar.DAY_OF_YEAR);
        int sy = sCalendar.get(Calendar.YEAR);
        int ey = eCalendar.get(Calendar.YEAR);
        if (sy != ey) {
            int timeDistance = 0;
            for (int i = sy; i < ey; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {//闰年
                    timeDistance += 366;
                } else {//不是闰年
                    timeDistance += 365;
                }
            }
            return timeDistance + (ed - sd);
        } else {
            return ed - sd;
        }
    }

    /**
     * 提供精确加法计算的add方法
     *
     * @param b1 被加数
     * @param b2 加数
     * @return 两个参数的和
     */
    public static BigDecimal add(BigDecimal b1, BigDecimal b2) {
        return b1.add(b2);
    }

    /**
     * 提供精确减法运算的sub方法
     *
     * @param b1 被减数
     * @param b2 减数
     * @return 两个参数的差
     */
    public static BigDecimal subtract(BigDecimal b1, BigDecimal b2) {
        return b1.subtract(b2);
    }

    /**
     * 提供精确乘法运算的mul方法
     *
     * @param b1 被乘数
     * @param b2 乘数
     * @return 两个参数的积
     */
    public static BigDecimal multiply(BigDecimal b1, BigDecimal b2) {
        return b1.multiply(b2);
    }

    /**
     * 提供精确的除法运算方法div
     *
     * @param b1    被除数
     * @param b2    除数
     * @param scale 精确范围
     * @return 两个参数的商
     */
    public static BigDecimal divide(BigDecimal b1, BigDecimal b2, int scale) {
        return b1.divide(b2, scale);
    }

    /**
     * 提供精确的除法运算方法div
     *
     * @param b1    被除数
     * @param b2    除数
     * @param scale 精确范围
     * @return 两个参数的商
     */
    public static BigDecimal divide(BigDecimal b1, int b2, int scale) {
        BigDecimal b3 = new BigDecimal(b2);
        return b1.divide(b3, scale);
    }

    public static List<BigDecimal> average(BigDecimal b1, int b2) {
        List<BigDecimal> b = new ArrayList<>();
        BigDecimal b3 = Util.divide(b1, b2, 1);
        BigDecimal b4 = new BigDecimal("0");
        for (int a = b2; a > 0; --a) {
            if (a == 1) {
                b.add(b1.subtract(b4));
            } else {
                b.add(b3);
                b4 = b4.add(b3);
            }
        }
        return b;
    }
}