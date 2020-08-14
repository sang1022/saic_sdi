package com.saic.ndms.sdi.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.saic.ndms.sdi.common.exception.UtilException;



public class StringUtils {

    public final static String EMPTY_STRING        = "";
    public final static String BLANK_SPRING_STRING = " ";
    public static final char   CHAR_TILDE          = '~';

    public static UUID getRandomUUID() {
        return UUID.randomUUID();
    }



    /**
     * check if null or empty string
     */
    public static boolean isNullOrEmpty(String str) {
        return (null == str || EMPTY_STRING.equals(str));
    }



    /**
     * substring with utf-8 bytes length
     * 
     * @param utfStr the string with utf-8 encoding
     */
    public static String subStringWithBytesLength(String utfStr, int bytesLength) throws UtilException {
        if (null == utfStr) {
            throw new UtilException("input string cannot be null");
        }
        if (bytesLength <= 0) {
            throw new UtilException("bytesLength should >0");
        }
        byte[] bytes = null;
        try {
            bytes = utfStr.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UtilException("not support encoding", e);
        }
        if (bytes.length <= bytesLength) {
            return utfStr;
        }
        int index = bytesLength;
        String temp1 = new String(bytes, 0, index);
        String temp2 = new String(bytes, 0, index + 1);
        // when temp2 is end with a new char
        if (temp2.length() > temp1.length()) {
            return temp1;
        }
        // when temp2.length()=temp1.length()
        temp2 = new String(bytes, 0, index - 1);
        // when temp2 is end with a whole char
        if (temp2.length() < temp1.length()) {
            return temp2;
        }
        // when the new String(bytes, 0, index) is in the middle char
        return new String(bytes, 0, index - 2);
    }

    /**
     * split string(bytes) into list
     */
    public static List<String> subStringToListWithBytesLength(String utfStr, int bytesLength) throws UtilException {
        if (null == utfStr) {
            throw new UtilException("input string cannot be null");
        }
        if (bytesLength <= 0) {
            throw new UtilException("bytesLength should >0");
        }
        List<String> list = new ArrayList<String>();
        String temp = utfStr;
        String data = EMPTY_STRING;
        while (temp.length() != data.length()) {
            temp = temp.substring(data.length());
            data = subStringWithBytesLength(temp, bytesLength);
            list.add(data);
        }
        return list;
    }

    /**
     * get last size string with maxsize,if string.length> maxsize , return string 'ABC' to '~BC'
     * 
     * @throws UtilException
     */
    public static String getLastStringWithTilde(String str, int maxSize) throws UtilException {
        if (maxSize <= 3) {
            throw new UtilException("max size should >3");
        }
        byte[] bytes = str.getBytes();
        if (bytes.length <= maxSize) {
            return str;
        }
        String temp1 = new String(bytes, bytes.length - maxSize + 1, maxSize - 1);

        // the first char is not messy code
        if (temp1.getBytes().length <= maxSize - 1) {
            return CHAR_TILDE + temp1;
        }
        String temp2 = new String(bytes, bytes.length - maxSize + 2, maxSize - 2);
        // the first char is not messy code
        if (temp2.getBytes().length <= maxSize - 2) {
            return CHAR_TILDE + temp2;
        }
        String temp3 = new String(bytes, bytes.length - maxSize + 3, maxSize - 3);
        // the first char is not messy code
        if (temp3.getBytes().length <= maxSize - 3) {
            return CHAR_TILDE + temp3;
        }
        throw new UtilException("this cannot be true in utf-8");
    }


    /*
     * @author zhangxc 生成指定长度的随机
     * @date 2016年3月31日
     * @param length
     * @return
     */

    public static String getRandomString(int length) {
        String[] randStr = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                             "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                             "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1",
                             "2", "3", "4", "5", "6", "7", "8", "9" };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomValue = (int) Math.round(Math.random() * (randStr.length - 1));
            sb.append(randStr[randomValue]);
        }
        return sb.toString();
    }
}
