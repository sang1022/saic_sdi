
package com.saic.ndms.sdi.common.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.saic.ndms.sdi.common.exception.UtilException;

/**
 * 
 * @author 
 * @description 对象转化工具类
 * @date 2017年10月25日
 */
public class BeanMapperUtil {

    /**
     * @author  
     * @description 将对象dest的属性值复制到对象orig中
     * @date 2017年10月25日
     * @param orig
     * @param clazz
     * @return
     * @throws UtilException
     */
    public static <T> T copyProperties(Object orig, Class<T> clazz) {
        if (orig == null) {
            throw new UtilException("input cannot be none");
        }
        T t;
        try {
            t = clazz.newInstance();
        } catch (Exception e) {
            throw new UtilException(e);
        }
        BeanUtils.copyProperties(orig, t);
        return t;
    }

    /**
     * @author  
     * @description 把origList 的属性值复制到 destList中
     * @date 2017年10月25日
     * @param origList
     * @param destClass
     * @return
     * @throws UtilException
     */

    public static <T> List<T> copyList(List<?> origList, Class<T> destClass) {
        List<T> destList = new ArrayList<T>();
        for (Object orig : origList) {
            destList.add(copyProperties(orig, destClass));
        }
        return destList;
    }
    

    /*
     * 
    *
    * @author chenPeiYu
    * 字段增加附属信息
    * @date 2020年2月20日
    * @param clazz
    * @param t
    * @param createBy
    * @return
    * @throws UtilException
     */
    private static <T> T setPOAddField(Class<T> clazz, T t, String createBy) throws UtilException {
        try {
            Method createByMethod = clazz.getMethod("setCreateBy", String.class);
            createByMethod.invoke(t, createBy);
        } catch (Exception e) {
            throw new UtilException("setCreateBy error", e);
        }

        try {
            Method updateByMethod = clazz.getMethod("setUpdateBy", String.class);
            updateByMethod.invoke(t, createBy);
        } catch (Exception e) {
            throw new UtilException("setUpdateBy error", e);
        }

        try {
            Method updateByMethod = clazz.getMethod("setCreateDate", Date.class);
            updateByMethod.invoke(t, new Date());
        } catch (Exception e) {
            throw new UtilException("setCreateDate error", e);
        }

        try {
            Method updateByMethod = clazz.getMethod("setUpdateDate", Date.class);
            updateByMethod.invoke(t, new Date());
        } catch (Exception e) {
            throw new UtilException("setUpdateDate error", e);
        }
        return t;

    }

}
