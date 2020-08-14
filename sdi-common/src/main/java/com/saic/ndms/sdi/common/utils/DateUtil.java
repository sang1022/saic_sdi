/**
* Copyright 2019 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : flag-common
*
* @File name : DateUtil.java
*
* @Author : SANGDELIANG
*
* @Date : 2019年4月23日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2019年4月23日    SANGDELIANG    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/
	
package com.saic.ndms.sdi.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
*
* @author SANGDELIANG
* @description 时间相关工具类
* @date 2020年4月23日
*/
public class DateUtil {
    
    private static Log logger = LogFactory.getLog(DateUtil.class);

    public static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_PATTERN_DEFAULT = "yyyy-MM-dd";
    public final static String IOS_8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    
    public static final String DATE_PATTERN_DEFAULT_SHOW = "yyyyMMdd";
    
    /**
    *
    * @author
    * @description 以指定的格式来格式化日期
    * @date 2020年4月23日
    * @param date
    * @param format
    * @return
    */
    public static String formatDateByFormat(Date date, String format) {
        String result = "";
        if (date != null) {
            if (CommonsUtils.isEmpty(format)) {
                format = DateUtil.DATE_PATTERN_DEFAULT;
            }
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            result = sdf.format(date);
        }
        return result;
    }
    
    
    /**
    *
    * @author
    * @description 字符串格式化为日期
    * @date 2020年4月23日
    * @param str
    * @param format
    * @return
    */
    public static Date formatToDate(String str, String format) {

        Date date = null;
        try {
            if (CommonsUtils.isEmpty(format)) {
                format = DateUtil.DATE_PATTERN_DEFAULT;
            }
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(str);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return date;
    }
    
    /**
     * @description 比较时间大小 end>=start true 俩个参数不能为空否则返回false
     * @param startDate
     * @param endDate
     * @return
     */
    public static boolean compareDate(Date startDate,Date endDate){

        if(startDate!=null&&endDate!=null){
          if(subtract(startDate,endDate)>=0){
              return true;
          }else{
              return false;
          }
        }else{
            return false;
        }
    }
    
    /***
     * 
     * @description 方法描述
     * @param subtrahend  减数
     * @param minuend   被减
     * @return
     *
     */
    public static long subtract(Date subtrahend,Date minuend){
        long day=0;
        if(minuend!=null&&subtrahend!=null){
          day=(minuend.getTime() - subtrahend.getTime())/(24*60*60*1000);
        }
        return day;
    }
    
    /**
    * @author lijing
    * @description 将Long类型的日期毫秒数转换成Date类型 将Long类型的日期毫秒数转换成Date类型
    * @date Aug 2, 2019
    * @param dateMilliseconds
    * @return
     */
    public static Date longToDate(Long dateMilliseconds) {
    	Calendar c = Calendar.getInstance();
        c.setTimeInMillis(dateMilliseconds);
        return c.getTime();
    }

    /**
    * @author lijing
    * @description 获取间隔天数
    * @date Aug 2, 2019
    * @param date
    * @param date1
    * @return
     */
    public static int diffDate(java.util.Date date, java.util.Date date1) {
        return (int) ((getMillis(date) - getMillis(date1)) / (24 * 3600 * 1000));
    }

    /**
     * 
    *
    * @author lijing
    * @description getMillis
    * @date Aug 2, 2019
    * @param date
    * @return
     */
    public static long getMillis(java.util.Date date) {
        return date.getTime();
    }

}
