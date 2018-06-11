package org.alkaids.goldencat.utils;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by Gravel on 2018/6/10.
 */
public class MainUtils {
    /**
     * 得到32位大写的UUID
     * @return
     */
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    /**
     * 得到该class所有的私有属性，包括父类
     * @param object
     * @return
     */
    public static Field[] getAllFields(Object object){
        Class clazz = object.getClass();
        List<Field> fieldList = new ArrayList<>();
        while (clazz != null){
            fieldList.addAll(new ArrayList<>(Arrays.asList(clazz.getDeclaredFields())));
            clazz = clazz.getSuperclass();
        }
        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        return fields;
    }

    /***
     *  利用Apache的工具类实现SHA-256加密
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256Str(String str){
        if(StringUtils.isEmpty(str)){
           return "";
        }
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }

    /**
     * BCryptPasswordEncoder 加密
     * @param str
     * @return
     */
    public static String  getBCryptStr(String str){
        if(StringUtils.isEmpty(str)){
            return "";
        }
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        return encoder.encode(str.trim());
    }
}
