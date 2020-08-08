

package com.saic.ndms.sdi.admin.config;

/**
 * @author LiuJun 
 * @description CommonAgentConstants
 * @date 2019年7月11日
 */
public class CommonAdminConstants {

    public static final int HTTP_RESPONSE_SUCCESS = 200;

    /**
     * 请求的安全验证失败
     */
    public static final int HTTP_RESPONSE_ERROR_FORBIDDEN = 401;

    /**
     * 数据检查失败 1、字段限制检查失败 （比如长度、非空、日期格式） 2、必须的业务数据检查失败 （比如省份城市）
     */
    public static final int HTTP_RESPONSE_ERROR_PRECONDITION_FAILED = 412;

    /**
     * 待更新或者删除的资源不存在
     */
    public static final int HTTP_RESPONSE_ERROR_NOT_FOUND    = 404;
    /**
     * 对象状态冲突，已接受到更新状态的数据
     */
    public static final int HTTP_RESPONSE_ERROR_STATUS_ERROR = 451;
    /**
     * 非本系统关系信息
     */
    public static final int HTTP_RESPONSE_SYSTEN_NOT_NEED    = 452;
    /**
     * 内部无法捕捉异常
     */
    public static final int HTTP_RESPONSE_UNKNOWN_ERROR      = 500;
    /**
     * 内部可捕捉业务异常
     */
    public static final int HTTP_RESPONSE_APPLICATION_ERROR  = 550;

    public static final int HTTP_RESPONSE_SUCCESS_NOT_NEED = 220;
    
    
    public static final String RESULT_ADD_OK = "add success!";

    public static final String RESULT_UPDATE_OK = "update success!";

    public static final String RESULT_DELETE_OK = "delete success!";

    public static final String ERROR_MESSAGE_PRECONDITION_FAILED = "数据检查失败";

    public static final String ERROR_MESSAGE_ACTIONTYPE_IS_NULL = "Key is null!";

    public static final String ERROR_MESSAGE_DATA_IS_NULL = "Data is null!";
    
    public static final String DPMAPPING_TYPE_PROVINCE_EN = "PROVINCE";

    public static final String DPMAPPING_TYPE_CITY_EN = "CITY";

    public static final String DPMAPPING_TYPE_TOWNCITY_EN = "COUNTY";
    
    
    /**
     * 残值系统接口相关
     */
    public static final Long CONFIG_PARAM_PPKEY = 2018l;
    public static final Long CONFIG_PARAM_APPPRIVATEKEY = 2019l;
    
    public static final Long CONFIG_PARAM_RESIDAUL_URL =30051001l;
    
    
    
    /**
     ** 合作伙伴登录岗位
     */
    public static final String PARTNER_POSITIONCODE_LEASE = "LE_SP_PO_1000";
    public static final String PARTNER_POSITIONNAME_LEASE = "融资租赁公司岗位";
    
    public static final String PARTNER_POSITIONCODE_ADDIT_COMPANY = "S_PO_0561";
    public static final String PARTNER_POSITIONNAME_ADDIT_COMPANY = "审计公司";
    
    public static final String PARTNER_POSITIONCODE_FINACE_COMPANY = "LE_SP_PO_0002";
    public static final String PARTNER_POSITIONNAME_FINACE_COMPANY = "保险审计公司";
    
    public static final String PARTNER_POSTIONCODE_TEST = "S_PO_1001";
    public static final String PARTNER_POSITIONNAME_TEST = "测试岗位";

    
    /**
              * 供应商公司类型 20221001-融资租聘公司 20221002-审计公司 20221003-审计公司
     */
    public static final long PROVIDER_COMPANY_TYPE_LEASE = 20221001;
    public static final long PROVIDER_COMPANY_TYPE_ADDIT_COMPANY = 20221002;
    public static final long PROVIDER_COMPANY_TYPE_FINACE_COMPANY = 20221003;

    /**
     * 保值率系统接口查询条件
     */
    public static final String API_RESIDUAL_BRAND_PARAM = "?brandId=%s";
	public static final String API_RESIDUAL_MFRS_PARAM = "&mfrsId=%s";
	public static final String API_RESIDUAL_SERIES_PARAM = "&seriesId=%s";


}
