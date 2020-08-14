
package com.saic.ndms.sdi.common.constants;

/**
*
* @author SANGDELIANG
* @description 业务常量-例如tc_code相关定义
* @date 2020年4月23日
*/
public class BusinessConstant {

	/**
	 * 导出最大条数限制
	 */
	public static final int EXPORT_MAX_SIZE = 100000;
	
	/**
	 * 保值率系统接口成功状态；
	 * 保值率版本接口URL；
	 * 价格预测-非固定车龄接口URL；
	 * 价格预测-固定车龄接口URL；
	 * 价格评估接口URL；
	 * 优惠价配置查询接口URL
	 * 第一车网品牌接口URL
	 * 第一车网车系接口URL
	 * 第一车网车型接口URL
	 * 第一车网厂商接口URL
	 */
	public static final int API_RESIDUAL_STATUS_SUCCESS = 100000;
	public static final String API_RESIDUAL_VERSION_URL = "/api/app/version";
	public static final String API_RESIDUAL_RV_URL = "/api/frv/modelRv";
	public static final String API_RESIDUAL_MODEL_RV_URL = "/api/frvn/modelRv";
	public static final String API_RESIDUAL_CALCULATE_URL = "/api/assess/calculate";
	public static final String API_RESIDUAL_DISCOUNT_PRICE_URL = "/api/basic/newest/discountPrice/confs";
	public static final String API_RESIDUAL_BRAND_URL = "/api/basic/brand/list";
	public static final String API_RESIDUAL_SERIES_URL = "/api/basic/series/list";
	public static final String API_RESIDUAL_MODEL_URL = "/api/basic/modelGM/list";
	public static final String API_RESIDUAL_MFRS_URL = "/api/basic/mfrs/list";
	
	/**
	 * 期数code type
	 */
	public static final String CODE_TYPE_PERIOD = "9015";
	
	/**
	 * 运营类型 1-运营 2-非运营 3-融资非运营
	 */
	public static final int API_OPERATE_TYPE1 = 1;
	public static final int API_OPERATE_TYPE2 = 2;
	public static final int API_OPERATE_TYPE3 = 3;

	/**
	 * 年均里程(万公里)
	 */
	public static final long COMFIG_PARAM_CODE_CADI = 30000000;
	public static final long COMFIG_PARAM_CODE_BUICK = 30000001;
	public static final long COMFIG_PARAM_CODE_CHEV = 30000002;
	
	/**
	 * 商务政策审批状态
	 */
    public static final long FLAG_DB_APPROVAL_STATUS_DRAFT = 10781001;//草稿
    public static final long FLAG_DB_APPROVAL_STATUS_APPENDING = 10781002;//待审批
    public static final long FLAG_DB_APPROVAL_STATUS_REJECT = 10781003;//驳回
    public static final long FLAG_DB_APPROVAL_STATUS_FINISHED = 10781004;//审批通过

    /**
     * 商务政策policy 规则类型
     */
    public static final int FLAG_DB_POLICY_CODE_TYPE = 1079;

	
}
