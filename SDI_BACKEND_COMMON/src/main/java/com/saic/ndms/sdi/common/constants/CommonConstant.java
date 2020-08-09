
package com.saic.ndms.sdi.common.constants;

/**
 * @author SANGDELIANG 
 * @description 常量类
 * @date 2020年4月22日
 */
public class CommonConstant {

    /**
     * 文件服务器信息代码
     */
    public static final String FS_BASE_URL = "fs.base.url";

    /**
     * 文件服务器TOKEN地址
     */
    public static final String FS_TOKEN_URL = "fs.token.url";

    /**
     * 单文件上传
     */
    public static final String FS_UPLOAD_URL = "fs.upload.url";

    /**
     * 多文件上传
     */
    public static final String FS_MULTIUPLOAD_URL = "fs.multiUpload.url";

    /**
     * 文件服务器APPID
     */
    public static final String FS_APP_ID = "fs.appId";

    /**
     * 状态->有效
     */
    public static final Long VALIDITY = 90021001L;

    /**
     * 状态->无效
     */
    public static final Long UN_VALIDITY = 90021002L;

    public static final Double BASE_DISCOUNT_RATE = 0.0D;

    /**
     * 月份-1
     */
    public static final String MONTH_1 = "-1";

    /**
     * 月
     */
    public static final String PRE_MONTH_MSG = "之前到期总计";

    /**
     * 小计
     */
    public static final String TOTAL_MSG = "小计";

    /**
     * 业务模式-> 直租
     */
    public static final Long BUSINESS_MODE_TODO = 20011001L;

    /**
     * 业务模式-> 回租
     */
    public static final Long BUSINESS_MODE_RETURN = 20011002L;

    /**
     * 合同状态 ：
     */
    public static final Integer CONTRACT_STATUS = 2002;

    /**
     * 合同状态 ：草稿(待补充信息)
     */
    public static final Long CONTRACT_STATUS_DRAFT_ADD_INFO = 20021000L;

    /**
     * 合同状态 ：草稿(待提交)
     */
    public static final Long CONTRACT_STATUS_DRAFT    = 20021001L;
    /**
     * 合同状态： 审批中
     */
    public static final Long CONTRACT_STATUS_AUDITING = 20021002L;
    /**
     * 合同状态 ：审批通过
     */
    public static final Long CONTRACT_STATUS_PASS     = 20021003L;
    /**
     * 合同状态： 审批驳回
     */
    public static final Long CONTRACT_STATUS_REJECT   = 20021004L;
    /**
     * 合同状态： 回退
     */
    public static final Long CONTRACT_STATUS_ROLLBACK = 20021005L;

    /**
     * 合同状态： 审核拒绝
     */
    public static final Long CONTRACT_STATUS_REJECT_END = 20021006L;

    /**
     * 合同状态：合同到期时间变更审批中
     */
    public static final Long CONTRACT_DATE_CHANGE = 20021007L;

    /**
     * 合同状态：信息上报
     */
    public static final Long CONTRACT_STATUS_REPORT = 20021008L;

    /**
     * 合同已过期
     */
    public static final Long CONTRACT_STATUS_EXPIRE = 20021009L;

    /**
     * 补贴申请类型->常规补贴申请
     */
    public static final Long SUBSIDIES_TYPE_GENERATE = 20051001l;

    /**
     * 补贴申请类型->特殊补贴申请
     */
    public static final Long SUBSIDIES_TYPE_ESPECIAL = 20051002l;

    /**
     * 补贴申请类型->残值补贴申请
     */
    public static final Long SUBSIDIES_TYPE_RESIDUAL_VALUE = 20051003l;
    
    public static final String SUBSIDIES_TYPE_RESIDUAL_NAME = "残值补贴";

    /**
     * 补贴申请类型->达标奖
     */
    public static final Long SUBSIDIES_TYPE_TARGET = 20051004l;
    
    /**
     * 补贴申请类型->非现金
     */
    public static final Long SUBSIDIES_TYPE_MONEY = 20051005l;

    /**
     * deny 驳回：任何一个节点都直接返回给经销商
     */
    public static final Long AUDIT_TYPE_DENY = 20071001L;

    /**
     * approve 同意:进入下一个审批环节，或申请通过
     */
    public static final Long AUDIT_TYPE_APPROVE = 20071002L;

    /**
     * return 退回：可以选则 退回，供应商看最后一个批注，申请方处理后，还可以再次提交申请
     */
    public static final Long AUDIT_TYPE_RETURN = 20071003L;

    /**
     * 有效 90021001
     */
    public static final Long VALIDITYS = 90021001L;

    /**
     * 无效 90021002
     */
    public static final Long NOT_VALIDITY = 90021002L;

    /**
     * 正常补贴申请
     */
    public static final Long APPLICATION_TYPE_GENERATE = 20061001L;

    /**
     * 变更补贴申请
     */
    public static final Long APPLICATION_TYPE_CHANGE = 20061002L;

    /**
     * 合同提前结束申请
     */
    public static final Long APPLICATION_TYPE_END = 20081001L;

    /**
     * 合同延期申请
     */
    public static final Long APPLICATION_TYPE_ADD = 20081002L;

    /**
     * 是
     */
    public static final Long YES = 90011002L;

    /**
     * 否
     */
    public static final Long NO = 90011001L;

    /**
     * 补贴申请创建方dealer
     */
    public static final Long CREATE_SOURCE_DEALER = 20101001L;

    /**
     * 补贴申请创建方lease
     */
    public static final Long CREATE_SOURCE_LEASE = 20101002L;

    /**
     * 补贴申请创建方SGM
     */
    public static final Long CREATE_SOURCE_SGM = 20101003L;

    /**
     * 补贴发送对象 dealer
     */
    public static final Long SEND_OBJECT_DEALER = 20091001L;

    /**
     * 补贴发送对象 SGM
     */
    public static final Long SEND_OBJECT_SGM = 20091002L;

    /**
     * 融资租赁人员岗位组织code
     */
    public static final Long LEASE_ORG_CODE_CONFIG = 20121001l;

    /**
     * 融资租赁人员岗位code
     */
    public static final Long LEASE_ORG_PORISIOTN_CODE_CONFIG = 20121002L;

    /**
     * 第三方审计人员岗位组织code
     */
    public static final Long THIRD_ORG_CODE_CONFIG = 20121003l;

    /**
     * 第三方审计人员岗位code
     */
    public static final Long THIRD_ORG_PORISIOTN_CODE_CONFIG = 20121004L;

    /**
     * 融资租赁组织二级code
     */
    public static final Long CHILD_ORG_PORISIOTN_CODE_CONFIG = 20121005L;

    /**
     * 融资租赁岗位MSG
     */
    public static final String LEASE_POSITIO_CODE_MSG = "融资租赁公司岗位";

    /**
     * 融资租赁岗位->LE_SP_PO_1000
     */
    public static final String LEASE_POSITIO_CODE = "LE_SP_PO_1000";

    /**
     * 第三方审计公司
     */
    public static final String THIRD_APPROVE_CODE_MSG = "第三方审计公司";

    /**
     * 第三方审计公司->S_PO_0561
     */
    public static final String THIRD_APPROVE_CODE = "S_PO_0561";

    /**
     * 二手车审核
     */
    public static final String SECOND_APPROVE_CODE_MSG = "二手车审核";

    /**
     * 二手车审核->S_PO_0558-残值业务产品经理
     */
    public static final String SECOND_APPROVE_CODE = "S_PO_0558";
    
    /**
     * 二手车审核->S_PO_0559-残值业务政策经理
     */

    public static final String SECOND_POLICY_APPROVE_CODE  = "S_PO_0559";

    /**
     * 二手车复核
     */
    public static final String SECOND_RECHECK_CODE_MSG = "二手车复核";

    /**
     * 二手车复核->S_PO_0560
     */
    public static final String SECOND_RECHECK_CODE = "S_PO_0560";

    /**
     * 二手车高级经理
     */
    public static final String SECOND_MANAGER_PLUS_CODE_MSG = "二手车高级经理";

    /**
     * 二手车高级经理->LE_S_PO_0004
     */
    public static final String SECOND_MANAGER_PLUS_CODE = "LE_S_PO_0004";

    /**
     * 财务审核
     */
    public static final String FINANCE_APPROVE_CODE_MSG = "财务审核";

    /**
     * 财务审核->S_PO_0556
     */
    public static final String FINANCE_APPROVE_CODE = "S_PO_0556";

    /**
     * 财务复核
     */
    public static final String FINANCE_RECHECK_CODE_MSG = "财务复核";

    /**
     * 财务复核->LE_S_PO_0006
     */
    public static final String FINANCE_RECHECK_CODE = "LE_S_PO_0006";

    /**
     * 财务高级经理
     */
    public static final String FINANCE_MANAGER_PLUS_CODE_MSG = "财务高级经理";

    /**
     * 财务高级经理->LE_S_PO_0007
     */
    public static final String FINANCE_MANAGER_PLUS_CODE = "LE_S_PO_0007";

    /**
     * 组织code
     */
    public static final String ORG_CODE = "S_OG_LE_";

    /**
     * 品牌->别克
     */
    public static final String BRAND_NAME_BUICK = "别克";

    /**
     * 品牌->雪佛兰
     */
    public static final String BRAND_NAME_CH = "雪佛兰";

    /**
     * 品牌->凯迪拉克
     */
    public static final String BRAND_NAME_CD = "凯迪拉克";

    /**
     * 
     */
    public static final String SUBSIDY_AMOUNT_MSG = "补贴金额:";

    public static final String SECOND_CAR_AMOUNT = "诚新二手车残值托底质量奖:";

    public static final Double SECOND_CAR_BASE_RATE = 0.005D;

    /**
     * 待办项 1
     */
    public static final Integer IS_BACKLOG = 1;

    /**
     * 是否发放补贴-是
     */
    public static final String FLAG_YES = "是";

    /**
     * 是否发放补贴-否
     */
    public static final String FLAG_NO = "否";

    /**
     * 融资租赁合同操作类型-融资租赁公司合同提交
     */
    public static final Long LEASE_CONTRACT_LOG_TYPE_SUBMIT = 20151000L;

    /**
     * 融资租赁合同操作类型-二手车部门申诉驳回
     */
    public static final Long LEASE_COMTRACT_LOG_TYPE_REJECT = 20151001L;

    /**
     * 融资租赁合同操作类型-经销商
     */
    public static final Long LEASE_COMTRACT_LOG_TYPE_DEALER = 20151002L;

    /**
     * 合同上报时间到期自动关闭
     */
    public static final Long LEASE_CONTRACT_LOG_TYPE_REPORT_EXPIRE = 20151003L;

    /**
     * 融资租赁公司合同信息上报
     */
    public static final Long LEASE_CONTRACT_LOG_TYPE_REPORT = 20151004L;

    /**
     * 二手车驳回信息上报合同
     */
    public static final Long LEASE_CONTRACT_LOG_TYPE_REPORT_REJECT = 20151005L;

    /**
     * 二手车重新上报
     */
    public static final Long LEASE_CONTRACT_LOG_TYPE_AGAIN_REPORT = 20151006L;

    private CommonConstant(){
        //
    }

    public static void createGCommonConstant() {
        new CommonConstant();
    }

    /**
     * 数据类型
     */
    public static final Long DATA_TYPE_PERCENT = 90101001L;// 百分比
    public static final Long DATA_TYPE_NUM     = 90101002L;// 数字

    /**
     * 发布状态
     */
    public static final Long PRODUCT_ISSUE       = 90111001L;// 已发布
    public static final Long PRODUCT_NOT_ISSUE   = 90111002L;// 未发布
    public static final Long PRODUCT_WAIT_CHANGE = 90111003L;// 待调整

    /**
     * 商务政策状态
     */
    public static final Long DB_NOT_CONFIRM   = 90121001L;// 未确认
    public static final Long DB_IN_CONFIRM    = 90121002L;// 确认中
    public static final Long DB_IN_RECHECK    = 90121003L;// 复核中
    public static final Long DB_WAIT_CHANGE   = 90121004L;// 待调整
    public static final Long DB_POLICY_CHANGE = 90121005L;// 政策调整
    public static final Long DB_CONFIRMED     = 90121006L;// 已确认

    /**
     * 融资租赁产品类型
     */
    public static final Long GENERAL_PRODUCT       = 90131001L;// 常规产品
    public static final Long RESIDAUL_INSR_PRODUCT = 90131002L;// 残值保险产品

    /**
     * 合同类型
     */
    public static final Long CONTRACT_TYPE_SOCIALLIZATION = 20141002L;
    public static final Long CONTRACT_TYPE_EMPLOYEES      = 20141001L;

    /**
     * 节点状态
     */
    public static final Long NODE_STATUS_READY    = 80051001L;// 未开始
    public static final Long NODE_STATUS_COMPLETE = 80051002L;// 完成

    /**
     * 流程执行状态
     */
    public static final Long PROCESS_STATUS_READY    = 80031001L;// 未开始
    public static final Long PROCESS_STATUS_IN       = 80031002L;// 进行中
    public static final Long PROCESS_STATUS_COMPLETE = 80031003L;// 完成

    /**
     * 大于小于
     */
    public static final Long CONDITION_BIGGER    = 90141001L;// >
    public static final Long CONDITION_LITER     = 90141002L;// <
    public static final Long CONDITION_BIG_EQUAL = 90141003L;// >=
    public static final Long CONDITION_LIT_EQUAL = 90141004L;// <=
    public static final Long CONDITION_EQUAL     = 90141005L;// ==

    /**
     * 流程节点定义名称
     */
    public static final String DB_SETTING_NODE = "商务政策设置";
    public static final String DB_APPROVE_NODE = "商务政策审核";

    /**
     * 正则
     */
    public static final String REGEX_NUM            = "^[0-9]+$";            // 数字
    public static final String REGEX_DOUBLE_TWO     = "^[0-9]+[. 0-9]{2,3}$";// 带两位小数的数字
    public static final String REGEX_DOUBLE_ANY     = "^[0-9]+[. 0-9]{2,9}$";// 带多位小数的数字
    public static final String REGEX_ENGLISH_LETTER = "^[A-Za-z]+$";         // 大小写英文字母
    public static final String REGEX_POSITIVE_NUM   = "^[0-9]*";             // 正整数(包括0)
    public static final String REGEX_PERCENT_NUM    = "[\\d.]+%";            // 百分数
    public static final String REGEX_ENGLISH_UPPER  = "^[A-Z]+$";            // 匹配大写字母

    /**
     * 页面权限业务类型
     */
    public static final Long PAGE_COLUMN_AUTH_CONTRACT_ONE = 20211001L;
    public static final Long PAGE_COLUMN_AUTH_CONTRACT_TWO = 20211002L;

    /**
     * 默认当前用户ID
     */
    public static final Long DEFAULT_USERID = -1L;

    /**
     * 直租对应附件type
     */
    public static final Long FILE_TYPE_TODO = 2003L;

    /**
     * 回租对应附件type
     */
    public static final Long FILE_TYPE_RETURN = 2004L;

    /**
     * 残值补贴类型code
     */
    public static final Long VALUE_TYPE_CODE = 2011L;

    /**
     * 合同附件common code
     */
    public static final Long ATTACH_COMMON_TYPE_CODE = 2020L;

    // 合同工到期天数
    public static final Long PARAM_TYPE_CONTRACT_TIME = 20141001L;

    /** 签收状态:10011001L:未签收 */
    public static final Long   ANN_PROVIDER_SIGNING_STATUS_UN      = 10011001L;
    /** 签收状态:10011002L:已签收 */
    public static final Long   ANN_PROVIDER_SIGNING_STATUS_OK      = 10011002L;
    /** 类型 0：供应商代号； */
    public static final String ANN_PROVIDER_PROVIDER_DEALER_TYPE_Z = "0";
    /** 类型 1：DEALER_CODE; */
    public static final String ANN_PROVIDER_PROVIDER_DEALER_TYPE_O = "1";

    public static final String TOP_PARENT_ORG_CODE     = "S_OG_1000";                    // 市场部
    // public static final String TOP_PARENT_ORG_CODE2K = "S_OG_2000";// 信息技术部
    // public static final String TOP_PARENT_ORG_CODE3K = "S_OG_3000";// 财务部
    public static final String TOP_PARENT_ORG_CODE_ARR = "S_OG_1000,S_OG_2000,S_OG_3000";

    /**
     * 供应商类型-托底供应商
     */
    public static final String PROVIDERTYPE_ONE = "2021001";

    /**
     * 供应商类型-金融公司
     */
    public static final String PROVIDERTYPE_TWO = "2021002";

    /**
     * 有效无效
     */
    public static final Long PROVIDER_YES_STATUS = 10011001L;// 有效
    public static final Long PROVIDER_NO_STATUS  = 10011002L;// 无效

    // userType
    public static final long USER_TYPE_SGM = 10021000;// SGM

    /**
     * 商务政策操作类型
     */
    public static final Long DB_TYPE          = 2018L;    // 商务政策操作类型
    public static final Long APPLY_DB_FIRST   = 20181001L;// 申请商务政策
    public static final Long COMMIT_DB_FIRST  = 20181002L;// 提交商务政策审核
    public static final Long APPLY_DB_SECOND  = 20181003L;// 重新申请商务政策
    public static final Long COMMIT_DB_SECOND = 20181004L;// 重新提交商务政策审核
    public static final Long DB_CONFIRM       = 20181005L;// 商务政策确认
    public static final Long DB_CHANGE        = 20181006L;// 调整商务政策
    public static final Long PRODUCT_CHANGE   = 20181007L;// 调整产品
    public static final Long DB_ISSUE         = 20181008L;// 产品发布
    public static final Long DB_UNISSUE       = 20181009L;// 产品下架
    public static final Long PRODUCT_DELAY    = 20181010L;// 调整产品延期

    /**
     * 拖底供应商组织code
     */
    public static final String SUPPLIER_ORG_CODE = "S_OG_LE_1000";

    /**
     * 补贴附件
     */
    public static final Long BACH_FILE_TYPE = 2222L;

    /**
     * 合同变更附件
     */
    public static final Long CHANGE_FILE_TYPE = 1111L;

    /**
     * 融资租赁补贴申请操作-经销商提交补贴申请
     */
    public static final Long APPLICATION_BATCH_LOG_TYPE_DEALER = 20161000L;

    /**
     * 融资租赁补贴申请操作-融资租赁公司提交补贴申请
     */
    public static final Long APPLICATION_BATCH_LOG_TYPE_SUPPLIER = 20161001L;

    /**
     * 业务模式名称->直租
     */
    public static final String BUSINESS_MODE_NAME = "直租";

    /**
     * 业务模式名称->回租
     */
    public static final String BUSINESS_MODE_BACKNAME = "回租";

    /**
     * 合同类型->员工车
     */
    public static final String CONTRACT_TYPE_EMPLOYEE_MSG = "员工车";

    /**
     * 合同类型->社会化
     */
    public static final String CONTRACT_TYPE_SOCIETY_MSG = "社会化";

    /**
     * 合同类型->员工车->20141001
     */
    public static final Long CONTRACT_TYPE_EMPLOYEE = 20141001L;

    /**
     * 合同类型->社会化->20141002
     */
    public static final Long CONTRACT_TYPE_SOCIETY = 20141002L;

    /**
     * 合同变更审核
     */
    public static final Long CONTRACT_STATUS_CHANGE = 20021007L;

    public static final Long CONTRACT_TYPE_SOCIAL = 20141002L; // 合同类型 : 社会化

    public static final String AUTH_APP_ID_KEY = "x-app-id";
    public static final String AUTH_TOKEN_KEY  = "x-access-token";

    public static final String SUCCESS = "success";
    public static final String FAIL    = "fail";

    /*
     * @author Ji Ning
     * @date 2020/6/13 20:13
     * @description 产品延期操作类型
     * @param
     * @return
     */
    public static final Long PRODUCT_DELAY_COMMIT        = 21101004L;// 产品延期申请
    public static final Long PRODUCT_DELAY_NOTAGGREE     = 21101005L;// 延期申请二手车审核同意
    public static final Long PRODUCT_DELAY_AGEREE        = 21101006L;// 延期申请二手车审核驳回
    public static final Long PRODUCT_DELAY_SECONDNOAGREE = 21101007L;// 延期申请二手车复审驳回
    public static final Long PRODUCT_DELAY_SECONDAGREE   = 21101008L;// 延期申请二手车审核同意

    public static final Long IS_DISABOAD         = 20021001L; // 代办项
    // 产品延期状态
    public static final Long DELAY_IN_CONFIRM    = 90161004L; // 确认中
    public static final Long DELAY_IN_RECHECK    = 90161005L; // 延期驳回
    public static final Long DELAY_WAIT_CHANGE   = 90161006L; // 审核同意
    public static final Long DELAY_POLICY_CHANGE = 90161007L; // 政策调整
    public static final Long DELAY_CONFIRMED     = 90161008L; // 已确认
    
    //合同标识类型==>dfms
    public static final Long CONTRACT_BS_TYPE_DFMS = 10771001L;//合同标识类型-DFMS
    public static final Long SEND_DFMS_DAYS = 20161001L;//推送DFMS合同天数
    
    
    //接口地址
    public static final Long DFMS_SCHEDULE_URL = 20171001L;//融资租赁URL地址
    public static final Long FINANCE_DESCRIPTION_URL = 20171002L;//查询财务描述url地址
    public static final Long PROVIDER_VALIDATION_URL = 20171003L;//供应商效验url
    public static final Long FINANCE_DBR_BACKINFO_URL = 20171004L;//销售补贴&残值补贴&金融DBR回传接口url


    //到期预检
    public static final String CHECK = "check";
    // 到期处置
    public static final String MANAGE = "manage";
    // 残值预警
    public static final String WARNING = "warning";

    // 残值预警状态位 状态位
    public static final Long NEED_EXPIRATION = 90011002L;//是否需要 预检 是
    public static final Long NOTNEED_EXPIRATION = 90011001L; // 否
    public static final Long CUSTOMER_BACK = 90181000L;//  客户还回
    public static final Long CUSTOMER_SAVE = 90181001L;//  客户留购
    public static final Long SAVE_SALE = 90181002L;//SAVE竞拍
    public static final Long SELF_MANAGE = 90181003L;//自行处置
    public static final Long DELAER_BUY_OUT = 90181004L;//经销商买断
    //SAVE车源接口 topic tag
    public static final String TOPIC = "customers_saveinfo";

    public static final String TAG = "contract";
    
    public static final String SUPPLIER_TAG = "supplier";
    
    // 商务政策policy_code序列范围定义
    public static final String  POLICY_CODE_NUM = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // 经销商端 二手车经理
    public static final String  MANAGE_DEALER_CODE =  "D_PO_4001";
    

    // S_PO_0553凯迪拉克租赁业务经理
    public static final String CADI_BUSINESS_MANAGER = "S_PO_0553";
    // S_PO_0551 别克
    public static final String BUKE_BUSINESS_MANAGER = "S_PO_0551";
    //S_PO_0552 雪佛兰
    public static final String CHEVROLET_BUSINESS_MANAGER = "S_PO_0552";
    
    // 奖金类型type=2005   
    public static final Long  REWARD_TYPE = 2005L;
    //有效状态type =1001
    public static final Long  VALID_STATUS = 1001L;
    //分摊方式 type=9019
    public static final Long APPORTIONMENT_WAY = 9019L;
    
    // 商务政策流程id
    public static final String FLOW_BUSINESS_NO = "LE_2002_1007";

        //分隔符
    public static final String SEPARATOR = "##";
    
    public static final String FALG_DB_IMPORT_CACHE_TYPE_BRANDNAME = "brand";
    public static final String FALG_DB_IMPORT_CACHE_TYPE_SERIESNAME = "series";
    public static final String FALG_DB_IMPORT_CACHE_TYPE_MARKETNAME = "market";
    public static final String FALG_DB_IMPORT_CACHE_TYPE_ENGINEERINGCODE = "engineeringCode";
    
    // 有效无效名称
    public static final String VALID_YES_NAME = "有效";
    public static final String VALID_NO_NAME = "无效";
    
    public static final String[] VALID_STATUS_NAME_ARRAY = {"有效","无效"};
    public static final String[] REWARD_TYPE_NAME_ARRAY = {"贴息支持","残值补贴"};

    //有效 无效
    public static final Long STATUS_YES = 10011001L;// 有效
    public static final Long STATUS_NO  = 10011002L;// 无效

    //产品中心消息发送状态
    public static final Long PRODUCT_CENTER_SEND_TURE = 90231002l;//已发送
    
    public static final Long PRODUCT_CENTER_SEND_FALSE = 90231001L;//未发送
    

    public static final Long PRODUCT_UPDATE_URL = 20171005L;//产品修改地址
    public static final Long PRODUCT_POSTPONE_URL = 20171006l;//产品延期地址
    public static final Long PRODUCT_SOLD_OUT_URL = 20171007l;//产品下架


}
