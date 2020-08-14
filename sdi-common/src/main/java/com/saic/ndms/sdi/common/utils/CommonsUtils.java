
package com.saic.ndms.sdi.common.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.github.pagehelper.util.StringUtil;
import com.saic.ndms.sdi.common.constants.ScsBizConstant;

/**
 * @author SANGDELIANG 
 * @description 工具类
 * @date 2020年4月23日
 */
public class CommonsUtils {
    
    private static final Log logger = LogFactory.getLog(CommonsUtils.class);


    public static final String EMPTY_STRING = "";

    public static final int SPLIT_LIST_NUM = 500;
    
	private static final String EMPTY = "";//空字符串
	private static final String COMMA = ";";//";"
	public static final String PERCENT = "%";//"%"
	public static final String format = "yyyy-MM-dd";
	public static final String format_yyyyMMdd = "yyyyMMdd";
	public static final String ENCODING_UTF_8 = "UTF-8";
    
    /**
     * 正则
     */
    public static final String REGEX_NUM = "^[0-9]+$";//数字
    public static final String REGEX_ENGLISH_UPPER="^[A-Z]+$";//匹配大写字母

    /**
     * 返回str是否为Empty
     * 
     * @param str str
     * @return boolean
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().equals("") || str.equals("null");
    }

    public static boolean isEmpty(String[] str) {
        return str == null || str.length == 0;
    }

    public static boolean isEmpty(Long[] str) {
        return str == null || str.length == 0;
    }

    public static boolean isEmpty(int[] str) {
        return str == null || str.length == 0;
    }

    /**
     * if Collection is empty
     * 
     * @param collection Collection
     * @return boolean
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * if Map is empty
     * 
     * @param map Map
     * @return boolean
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /**
     * @author SANGDELIANG 是否数字校验
     * @date 2018年8月15日
     * @param str
     * @param isIntegral
     * @return
     */
    public static boolean isNumeric(String str, boolean isIntegral) {
        if(isEmpty(str)) {
            return false;
        }
        // ?:0或1个, *:0或多个, +:1或多个
        String patternStr = "^(\\+)?[0-9]{1,10}(.[0-9]{1,2})?$";
        if (isIntegral) {
            patternStr = "^(\\+|-)?[0-9]{1,10}$";

        }
        Pattern pattern = Pattern.compile(patternStr);
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * @author SANGDELIANG list批量操作拆分-指定数量级
     * @date 2018年9月26日
     * @param paramStringList
     * @return
     */
    public static <T> List<List<T>> splitListData(List<T> paramStringList, Integer dataNum) {

        List<List<T>> splitList = new ArrayList<List<T>>();

        int splitSize = 0;

        int totalNum = paramStringList.size();
        if (dataNum == null) {
            dataNum = SPLIT_LIST_NUM;
        }
        if(totalNum<=dataNum) {
            splitList.add(paramStringList);
            return splitList;
        }

        if (totalNum % dataNum == 0) {
            splitSize = totalNum / dataNum;
        } else {
            splitSize = totalNum / dataNum + 1;
        }

        for (int i = 0; i < splitSize; i++) {
            if (i == (splitSize - 1)) {
                splitList.add(paramStringList.subList(i * dataNum, paramStringList.size()));
            } else {
                splitList.add(paramStringList.subList(i * dataNum, i * dataNum + dataNum));
            }

        }
        return splitList;

    }

    /**
     * convert List 2 String
     * 
     * @param list List
     * @param seperator string like ";"
     * @return String
     */
    public static String list2String(List<String> list, String seperator) {
//        assert!isEmpty(list);
//        assert!isEmpty(seperator);
        //
        StringBuffer result = new StringBuffer(1024);
        //
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if (i < list.size() - 1) result.append(seperator);
        }
        return result.toString();
    }

    /**
     * 截取PackageIdArray 返回 逗号分割数组
     * 
     * @param packageIdArray
     * @return
     */
    public static String[] getPackIdArrays(String[] packageIdArray) {
        String[] newPackageIdArray = null;
        List<String> list = new ArrayList<String>();
        if (packageIdArray != null && packageIdArray.length > 0) {
            for (int i = 0; i < packageIdArray.length; i++) {
                if (packageIdArray[i].contains("_")) {
                    String replace = packageIdArray[i].replace("_", ",");
                    String[] split = replace.split(",");
                    for (int j = 0; j < split.length; j++) {
                        list.add(split[j]);
                    }
                } else {
                    list.add(packageIdArray[i]);
                }

            }
            newPackageIdArray = list.toArray(new String[list.size()]);
        }
        return newPackageIdArray;
    }

    /*
     * 解析EXCLE返回list数据
     * @author caoYong
     * @date 2020年1月10日
     * @param sheet
     * @return
     */
    public static List<List<String>> analysisExcelData(HSSFSheet sheet) {
        List<List<String>> arrayList = new ArrayList<List<String>>();

        if (sheet == null) {
            return arrayList;
        }
        int lastRowNum = sheet.getLastRowNum();
        if (lastRowNum < 1) {
            return arrayList;
        }
        short lastCellNum = sheet.getRow(0).getLastCellNum();// 表头有效列数
        for (int i = 1; i < lastRowNum + 1; i++) {
            HSSFRow row = sheet.getRow(i);// 行数据
            List<String> list = new ArrayList<String>();

            String cellValue = "";
            for (int j = 0; j < lastCellNum; j++) {
                HSSFCell cell = row.getCell(j);
                if (cell == null) {
                    list.add("");
                } else {
                    switch (cell.getCellType()) {
                        case HSSFCell.CELL_TYPE_STRING:// 字符串类型
                            cellValue = cell.getStringCellValue();
                            if (StringUtil.isEmpty(cellValue.trim())) cellValue = "";
                            break;
                        case HSSFCell.CELL_TYPE_NUMERIC: // 数值类型
                            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                            cellValue = cell.getStringCellValue();
                            if (StringUtil.isEmpty(cellValue.trim())) cellValue = "";
                            break;
                        case HSSFCell.CELL_TYPE_FORMULA: // 公式
                            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                            cellValue = cell.getStringCellValue();
                            if (StringUtil.isEmpty(cellValue.trim())) cellValue = "";
                            break;
                        case HSSFCell.CELL_TYPE_BLANK:
                            cellValue = "";
                            break;
                        case HSSFCell.CELL_TYPE_BOOLEAN:
                            break;
                        case HSSFCell.CELL_TYPE_ERROR:
                            break;
                        default:
                            break;
                    }
                    list.add(cellValue);
                }
            }
            arrayList.add(list);
        }

        return arrayList;
    }
    
    ///匹配数字+大写字母组合
    public static boolean matcherInfo(String str) {
           if(str.length()<3||str.length()>100||str.indexOf("+")<1||str.indexOf("+")==str.length()) {
               return false;
           }
           String firstHalf=str.substring(0, str.indexOf("+"));
           String secondHalf=str.substring(str.indexOf("+")+1, str.length());
           if((firstHalf.matches(REGEX_NUM)&&secondHalf.matches(REGEX_ENGLISH_UPPER))||(firstHalf.matches(REGEX_ENGLISH_UPPER)&&secondHalf.matches(REGEX_NUM))){
               return true;
           }
           return false;
    }
    
    
    /*
     * 校验首付比例和保证金比例间隔
     */
    public static boolean isTrue(Double a,Double b ,Double c,String flag) {
        
            BigDecimal a1 = new BigDecimal(a.toString());
            BigDecimal b1 = new BigDecimal(b.toString());
            BigDecimal c1 = new BigDecimal(c.toString());
            //如果是下限   输入-下限
            BigDecimal b4 = null;
            if("X".equals(flag)){
                 b4 = a1.subtract(b1);//相减的数
            }else {
                //如果是上限  上限 - 输入
                 b4 = b1.subtract(a1);//相减的数
            }
            BigDecimal bigDecimal = new BigDecimal("100");
            double v = b4.multiply(bigDecimal).doubleValue();
            double v1 = c1.multiply(bigDecimal).doubleValue();
            double i = v % v1;
            if(i== 0){
                return true;
            }else{
                return false;
            }
    }
    
    
    /**
    *
    * @author SANGDELIANG
    * uuid生成
    * @date 2020年7月10日
    * @return
    */
    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    
    
    /**
     * @author SANGDELIANG 自动创建文件
     * @date 2018年8月20日
     * @param filePath
     * @param fileName
     */
    public static boolean creatFile(String filePath, String fileName) {
        File folder = new File(filePath);
        // 文件夹路径不存在
        if (!folder.exists() && !folder.isDirectory()) {
            folder.mkdirs();
        }

        // 如果文件不存在就创建
        File file = new File(filePath + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return true;
    }
        

    /**
     * 去空
    *
    * @author lijing
    * @description trimStr
    * @date Jul 24, 2019
    * @param str
    * @return
     */
    public static String trimStr(String value){
        if(isEmpty(value)){
            return "";
        }else{
            return value.trim();
        }
    }

    /**
     * @author SANGDELIANG list批量操作拆分-每500与数据库交互一次
     * @date 2018年8月27日
     * @param paramStringList
     * @return
     */
    public static <T> List<List<T>> splitListData(List<T> paramStringList) {

        List<List<T>> splitList = new ArrayList<List<T>>();

        int splitSize = 0;

        int totalNum = paramStringList.size();

        if (totalNum % SPLIT_LIST_NUM == 0) {
            splitSize = totalNum / SPLIT_LIST_NUM;
        } else {
            splitSize = totalNum / SPLIT_LIST_NUM + 1;
        }

        for (int i = 0; i < splitSize; i++) {
            if (i == (splitSize - 1)) {
                splitList.add(paramStringList.subList(i * SPLIT_LIST_NUM, paramStringList.size()));
            } else {
                splitList.add(paramStringList.subList(i * SPLIT_LIST_NUM,
                                                      i * SPLIT_LIST_NUM + SPLIT_LIST_NUM));
            }

        }
        return splitList;
    }

    /**
     * 判断字符串最大长度
     * true: 长度大于数据最大长度
     * @param str
     * @param max
     * @return
     */
    public static boolean isLength(String str,int dbMax){
		int strLen = 0;
		for (int i = 0; str!=null && i < str.length(); i++) {
		    int val = str.charAt(i);
		    if(val >0 && val<=128){
		    	strLen +=1;
		    }else{
		    	strLen +=3;//oracle数据库一个汉字对应3个字符
		    }
		}
		
		if(strLen>dbMax){
		    return true;
		}else{
		    return false;
		}
    }
    
    
    /**
    *
    * @author SANGDELIANG
    * @description 表分数校验
    * @date 2020年8月19日
    * @param str
    * @param isIntegral
    * @return
    */
    public static boolean isPercent(String str, boolean isIntegral) {
        if(isEmpty(str)) {
            return false;
        }
        // ?:0或1个, *:0或多个, +:1或多个
        String patternStr = "^(\\+)?[0-9]{1,10}(.[0-9]{1,4})?$";
        if (isIntegral) {
            patternStr = "^(\\+|-)?[0-9]{1,10}$";

        }
        Pattern pattern = Pattern.compile(patternStr);
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
    
    /**
    *
    * @author SANGDELIANG
    * @description 期数校验
    * @date 2020年8月19日
    * @param str
    * @return
    */
    public static boolean isPeriod(String str) {
        
        if(isEmpty(str)) {
            return false;
        }
        String patternStr = "^([0-9]+[/]?)+$";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;

        
    }

    /**
     * @author JI Ning
     * @description  导出共用校验
     * @date 2020/8/21 20:30
     * @param [obj]
     * @return java.lang.String
     **/
    public static String changeObject(Object obj) {
        if (obj == null) {
            return "";
        } else {
            return obj.toString();
        }
    }
    
    /**
    *
    * @author SANGDELIANG
    * @description 折扣率校验
    * @date 2020年8月25日
    * @param str
    * @return
    */
    public static boolean isDiscountRate(String str) {
        if(isEmpty(str)) {
            return false;
        }
        // ?:0或1个, *:0或多个, +:1或多个
        String patternStr = "^(\\+)?[0-9]{1,10}(.[0-9]+)?$";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }


	public static double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}
	
	public static double mulWithDefaultScale(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		double result = b1.multiply(b2).doubleValue();
		return round(result, 2) ;
	}	
	
	
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	/**
	* * 两个Double数相减 *
	* 
	* @param v1 *
	* @param v2 *
	* @return Double
	*/
	public static Double sub(Double v1, Double v2) {
	   BigDecimal b1 = new BigDecimal(v1.toString());
	   BigDecimal b2 = new BigDecimal(v2.toString());
	   return new Double(b1.subtract(b2).doubleValue());
	}

	/**
	* * 两个Double数相除 *
	* 
	* @param v1 *
	* @param v2 *
	* @return Double
	*/
	public static Double div(Double v1, Double v2) {
	   BigDecimal b1 = new BigDecimal(v1.toString());
	   BigDecimal b2 = new BigDecimal(v2.toString());
	    int DEF_DIV_SCALE = 2;
	   return new Double(b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP)
	     .doubleValue());
	}

	/**
	* * 两个Double数相除，并保留scale位小数 *
	* 
	* @param v1 *
	* @param v2 *
	* @param scale *
	* @return Double
	*/
	public static Double div(Double v1, Double v2, int scale) {
	   if (scale < 0) {
	    throw new IllegalArgumentException(
	      "The scale must be a positive integer or zero");
	   }
	   BigDecimal b1 = new BigDecimal(v1.toString());
	   BigDecimal b2 = new BigDecimal(v2.toString());
	   return new Double(b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue());
	}
	
	/**
	 * 
	 * 功能说明    : 特殊字符转化(值对象)
	 * 创建者         : admin
	 * 修改日期    : 2015年8月19日
	 * @param model value
	 * @return value
	 */
	public static void filterSpecialWord(Object model){
		if(model != null){
			Field[] field = model.getClass().getDeclaredFields();//获取实体类的所有属性，返回Field数组  
	        for(int j=0 ; j<field.length ; j++){//遍历所有属性
	        	try{
	                String name = field[j].getName();//获取属性的名字
	                String upperName = firstWordToUpper(name);//首字母变大写            
	               String type = field[j].getGenericType().toString();//获取属性的类型
	               if(type.equals("class java.lang.String")){//如果type是类类型，则前面包含"class "，后面跟类名
	                   Method m = model.getClass().getMethod("get" + upperName);
	                   String value = (String) m.invoke(model);//调用getter方法获取属性值
	                   if (!StringUtils.isNullOrEmpty(value)) {
	                	   Method n = model.getClass().getDeclaredMethod("set" + upperName, String.class);
	                	   n.setAccessible(true);
	                	   n.invoke(model,parseSpecialWord(value));//调用setter方法设定属性值
	                   }
	               } 
	        	} catch (Exception e) {
	        		logger.error(e);
	        		//不对该错误进行处理
	        	} 
	        }
		}
    }
	
	/**
	 * 
	 * 功能说明    : 首字母转大写
	 * 创建者         : admin
	 * 修改日期    : 2015年8月19日
	 * @param name name
	 * @return name
	 */
	public static String firstWordToUpper(String name){
		String firstWord = EMPTY;
		String otherWord = EMPTY;;
		if(!isEmpty(name)){
			firstWord = name.substring(0, 1).toUpperCase();
			otherWord = name.substring(1, name.length());
			name = firstWord.concat(otherWord);
		}
		return name;
	}
	
	/**
	 * 
	 * 功能说明    : 特殊字符转化(String)
	 * 创建者         : admin
	 * 修改日期    : 2015年8月19日
	 * @param value value
	 * @return value
	 */
	public static String parseSpecialWord(String value){
        //You'll need to remove the spaces from the html entities below
		value = value.replaceAll("<script>", "");
		value = value.replaceAll("</script>", "");
		value = value.replaceAll("alert", "");
        //value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        //value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
        value = value.replaceAll("'", "&#39;");
        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        
		return value;
	}
	
	
	//DOUBLE的精度，用于浮点数计算
	private static final double DOUBLE_EPSILON = 0.000001;
	
	/**
	 * 判断2个double类型是否相同 精度取0.000001
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static boolean isDoubleEquals(double num1, double num2) {
		//如果2个数字都为NULL_DOUBE
		if (Double.isInfinite(num1) && Double.isInfinite(num2)) {
			return true;
		}
		//如果一个数字为NULL_DOUBLE,另一个不是
		if (Double.isInfinite(num1) || Double.isInfinite(num2)) {
			return false;
		}
		if (Math.abs(num1 - num2) < DOUBLE_EPSILON) {
			return true;
		}
		return false;
	}

	/**
	 * 判断DOUBLE数字是否为0
	 * @param num
	 * @return
	 */
	public static boolean isDoubleZero(double num) {
		if (Double.isInfinite(num)) {
			return false;
		} 
		if (Double.isNaN(num)) {
			return false;
		}
		if (Math.abs(num) < DOUBLE_EPSILON) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断DOUBLE是否为空
	 * @param 	num	num
	 * @return	boolean
	 */
	public static boolean isDoubleNull(double num) {
		return Double.isInfinite(num);
	}
	
	/**
	 * 把2个字符串以 / 组合
	 * @param str1
	 * @param str2
	 */
	public static String combineString(String str1, String str2) {
		String combine = "";
		if (str1 != null && !str1.equals("")) {
			combine += str1 ;
		} 
		if (str2 != null && !str2.equals("")) {
			combine = combine + ScsBizConstant.SIMBLE_COMMON_TYPEDESC_SPLITH + str2;
		} else {
			combine = combine + ScsBizConstant.SIMBLE_COMMON_TYPEDESC_SPLITH ;
		}
		return combine;
	}
	
	

	/**
	 * 根据两个签署状态返回 大的一个
	 * 
	 * N<Y<N/A<空 
	 * @remark
	 * @author sangdeliang
	 * @date 2020年3月12日
	 */
	public static Long compareFiftyStatus(Long thisFiftyStatusL, Long finalFiftyStatusL) {
		int N = 1;
		int Y = 2;
		int N_A =3;
		int KONG = 4;
		
		int thisNumber = 0;
		int finalNumber = 0;
		if (thisFiftyStatusL == null || finalFiftyStatusL == null) {
			return Long.parseLong(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_NULL + "");
		}
		
		Integer thisFiftyStatus = Integer.parseInt(thisFiftyStatusL + "");
		Integer finalFiftyStatus = Integer.parseInt(finalFiftyStatusL + "");
		
		if (thisFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_Y)) {
			thisNumber = Y;
		} else if (thisFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_N)) {
			thisNumber = N;
		} else if (thisFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_NA)) {
			thisNumber = N_A;
		} else if (thisFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_NULL)) {
			thisNumber = KONG;
		} else {
			thisNumber = KONG;
		}

		if (finalFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_Y)) {
			finalNumber = Y;
		} else if (finalFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_N)) {
			finalNumber = N;
		} else if (finalFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_NA)) {
			finalNumber = N_A;
		} else if (finalFiftyStatus.equals(ScsBizConstant.FIFTY_SIGN_STATUS_INTEGER_NULL)) {
			finalNumber = KONG;
		} else {
			finalNumber = KONG;
		}
		
		//返回大的那个
		if (thisNumber < finalNumber) {
			return finalFiftyStatusL;
		} else {
			return thisFiftyStatusL;
		}
		
	}
	
	/**
	 * 转换STRING，安全测试
	 * @remark
	 * @author sangdeliang
	 * @date 2020年3月30日
	 */
	public static String getFormatStr(String partamStr) {
		if (CommonsUtils.isEmpty(partamStr)) {
			return "";
		}
		String resStr = new String(partamStr);
		return resStr;
	}
	/**
	 * 转换STRING，安全测试
	 * @remark
	 * @author sangdeliang
	 * @date 2020年3月30日
	 */
	public static Long getFormatLong(Long partamStr) {
		if (partamStr == null) {
			return null;
		}
		Long res = new Long(partamStr);
		return res;
	}
	/**
	 * 转换STRING，安全测试
	 * @remark
	 * @author sangdeliang
	 * @date 2020年3月30日
	 */
	public static Integer getFormatInt(Integer partamStr) {
		if (partamStr == null) {
			return null;
		}
		Integer res = new Integer(partamStr);
		return res;
	}
	
	public static List<Long> getFormatLongList(List<Long> longList){
	    List<Long> longList1 = new ArrayList<>();
	    if (!CommonsUtils.isEmpty(longList)) {
	        for (Long id : longList) {
	            longList1.add(id);
	        }
	    }
        return longList;
	    
	}
	
	public static Date addDay(Date date){
	    if (date != null){
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.add(Calendar.DATE, 1);
	        return cal.getTime();
	    } else {
	        return null;
	    }
	}
	
    /**
    *
    * @author SANGDELIANG
    * @description 指定字符替换
    * @date 2020年12月4日
    * @param str
    * @return
    * @throws PatternSyntaxException
    */
    public static String speciaWordRepalce(String str) throws PatternSyntaxException {
    	return str;
//        String regEx = "[<>{}`'\"&$\\'\\\"|\\t\\n\\r”“’\\\\]";
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(str);
//        return m.replaceAll("").trim();
    }    
    
    
    /**
    *
    * @author SANGDELIANG
    * @description 是否包含特殊字符
    * @date 2020年12月6日
    * @param str
    * @return
    */
    public static boolean jugdeIsContainSpeciaWord(String str) {
    	return false;
//        if (isEmpty(str)) {
//            return false;
//        }
//        String regEx = "[<>`'$\\'|\\t\\n\\r”“’\\\\]";
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(str);
//        
//        return m.find();
    }
    
    
    /**
    *
    * @author SANGDELIANG
    * @description containsIgnoreCase
    * @date 2020年12月4日
    * @param str
    * @param searchString
    * @return
    */
    public static boolean containsIgnoreCase(String str, String searchString) {
        return !isEmpty(str) && !isEmpty(searchString) && str.toLowerCase().contains(searchString.toLowerCase());
    }

    public static Map<String,String> getPerporties() {
        Map<String, String> map = new HashMap<>();
        try {
            Properties props = PropertiesUtil.loadPropertiesFromFile("commonsConfig.properties");
            map.put("appId", props.getProperty("appId"));
            map.put("smsSendOneUrl", props.getProperty("sms.sendOne.url"));
            map.put("emailUrl", props.getProperty("email.url"));
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
	
	public static void main(String[] args) {
		Double a = 19.9922324234;
		Double b = 11.122423423;
		System.out.println(mulWithDefaultScale(a,b));
		System.out.println(mul(a,b));
		
		BigDecimal partsAmountBig = new BigDecimal(a * b);
		partsAmountBig = partsAmountBig.setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.println(partsAmountBig.doubleValue());
		
	}
}
