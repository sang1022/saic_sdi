/*
* Copyright 2016 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : flag.common
*
* @File name : SerializeUtils.java
*
* @Author : 
*
* @Date : 
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1.         1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.saic.ndms.sdi.common.utils;

import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.saic.ndms.sdi.common.exception.JsonSerializeException;

/*
*
* @author 
* SerializeUtils
* @date 
*/
public class SerializeUtils {

    private static Log logger = LogFactory.getLog(SerializeUtils.class);
    /**
     * serialize data
     */
    public static String serialize(Object data) throws JsonSerializeException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        try {
            return objMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new JsonSerializeException(e);
        }
    }

    /**
     * 适用于复杂情况，包括以下
     * 1-Collection 返回 （list/map）
     * 2-抽象类/子类返回
     * 详细见testCase
     * @param   data      string data
     * @param   ref       类型参数
     * @return  static <T> T
     * @throws JsonSerializeException
     */

    /**
     * 针对list的反序列化
     * @param   data            string data
     * @param   t1              集合类型
     * @param   elementClass    元素类型
     * @return  T
     * @throws JsonSerializeException
     */
    public static <T> T deserializeCollection(String data,@SuppressWarnings("rawtypes") Class<? extends Collection> t1, Class<?> elementClass) throws JsonSerializeException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        try {
            return objMapper.readValue(data,TypeFactory.defaultInstance().constructCollectionType(t1,elementClass));
        } catch (Exception e) {
            logger.error(e);
            throw new JsonSerializeException(e);
        }
    }

    /**
     * 针对list的反序列化
     * @param   fis             输入流
     * @param   t1              集合类型
     * @param   elementClass    元素类型
     * @return  T
     * @throws JsonSerializeException
     */
    public static <T> T deserializeCollection(InputStream fis,@SuppressWarnings("rawtypes") Class<? extends Collection> t1, Class<?> elementClass) throws JsonSerializeException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        try {
            return objMapper.readValue(fis,TypeFactory.defaultInstance().constructCollectionType(t1,elementClass));
        } catch (Exception e) {
            logger.error(e);
            throw new JsonSerializeException(e);
        }
    }
    /**
     * 针对Map的反序列化
     * @param   data              数据
     * @param   mapClass          map类型
     * @param   keyClass          key类型
     * @param   valueClass        value类型
     * @return  T
     * @throws JsonSerializeException
     */
    public static <T> T deserializeHash(String data,@SuppressWarnings("rawtypes") Class<? extends Map> mapClass, Class<?> keyClass, Class<?> valueClass) throws JsonSerializeException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        try {
            return objMapper.readValue(data,TypeFactory.defaultInstance().constructMapType(mapClass, keyClass, valueClass));
        } catch (Exception e) {
            logger.error(e);
            throw new JsonSerializeException(e);
        }
    }

    /**
     * 针对继承类
     * @param   data      string data
     * @param   ref       类型参数
     * @return  static <T> T
     * @throws JsonSerializeException
     */
    public static <T> T deserializeRef(String data,TypeReference<?> ref) throws JsonSerializeException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        //TypeFactory.defaultInstance().
        try {
            return objMapper.readValue(data,ref);
        } catch (Exception e) {
            logger.error(e);
            throw new JsonSerializeException(e);
        }
    }


    /**
     * 适用于一般pojo的反序列化
     * @param   data      string data
     * @param   clazz     result clazz
     * @return  T
     * @throws JsonSerializeException
     */
    public static <T> T deserialize(String data, Class<T> clazz) throws JsonSerializeException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        try {
            return objMapper.readValue(data, clazz);
        } catch (Exception e) {
            logger.error(e);
            throw new JsonSerializeException(e);
        }
    }

}
