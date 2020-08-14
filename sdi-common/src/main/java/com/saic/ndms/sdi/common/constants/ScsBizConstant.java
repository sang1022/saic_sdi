package com.saic.ndms.sdi.common.constants;

public class ScsBizConstant {

    // 默认计划任务等后台JOB的创建人为9999
    public static String DEFAULT_CREATE_BY = "9999";

    // 售后索赔单状态 0：待索赔, 1：无需5050索赔, 2：人工处理, 9:已关闭
    public static int AFTERSALES_STATUS_WAIT_CLAIM    = 0;
    public static int AFTERSALES_STATUS_NO_5050_CLAIM = 1;
    public static int AFTERSALES_STATUS_PERSON_HANDLE = 2;
    public static int AFTERSALES_STATUS_CLOSE         = 9;

    // 售后索赔单功能模块类型（包括1整车，2发动机，3变速箱，4新能源）
    public static int AFTERSALES_FUNCTION_TYPE_VEHICLE      = 10151001;
    public static int AFTERSALES_FUNCTION_TYPE_ENGINEE      = 10151002;
    public static int AFTERSALES_FUNCTION_TYPE_SWITCH_SPEER = 10151003;
    public static int AFTERSALES_FUNCTION_TYPE_NEW_ENERGY   = 10151004;
    
    public static String AFTERSALES_FUNCTION_TYPE_VEHICLE_STRING      = "Vehicle";
    public static String AFTERSALES_FUNCTION_TYPE_ENGINEE_STRING      = "Engine";
    public static String AFTERSALES_FUNCTION_TYPE_SWITCH_SPEER_STRING = "Transmission";
    public static String AFTERSALES_FUNCTION_TYPE_NEW_ENERGY_STRING   = "NEW Energy";
    
    // 计划任务等的处理状态 0:待处理 1:已处理
    public static int ETL_JOB_PROCESSING_STATUS_WAIT = 0;
    public static int ETL_JOB_PROCESSING_STATUS_DONE = 1;

    /*
     * 5050索赔单状态
     */
    public static int SCS_CLAIM_STATUS_DRAFT    = 10191001; // 草稿
    public static int SCS_CLAIM_STATUS_ING      = 10191002; // 索赔中
    public static int SCS_CLAIM_STATUS_COMPLETE = 10191003; // 索赔完成
    public static int SCS_CLAIM_STATUS_CANCEL   = 10191009; // 取消索赔

    /*
     * 售后索赔单状态
     */
    public static Long AFTER_CLAIM_STATUS_DEFAULT  = 10171001L; // 缺省
    public static Long AFTER_CLAIM_STATUS_DRAFT    = 10171002L; // 草稿
    public static Long AFTER_CLAIM_STATUS_ING      = 10171003L; // 索赔中
    public static Long AFTER_CLAIM_STATUS_NOT_NEED = 10171004L; // 无需索赔(取消)
    public static Long AFTER_CLAIM_STATUS_COMPLETE = 10171005L; // 索赔完成
    public static Long AFTER_CLAIM_STATUS_CLOSE = 10171007L; // 索赔完成
    

    /*
     * 售后索赔单GROUP分组状态
     */
    public static Long    AFTER_CLAIM_GROUP_STATUS_DEFAULT  = 10211001L; // 缺省
    public static Long    AFTER_CLAIM_GROUP_STATUS_DRAFT    = 10211002L; // 草稿
    public static Long    AFTER_CLAIM_GROUP_STATUS_ING      = 10211003L; // 索赔中
    public static Long    AFTER_CLAIM_GROUP_STATUS_NOT_NEED = 10211004L; // 无需索赔(取消)
    public static Long    AFTER_CLAIM_GROUP_STATUS_COMPLETE = 10211005L; // 索赔完成
    /*
     * 附件类型
     */
    public static Integer FILE_TYPE_NTF                     = 10121001;  // NFTS比例附件
    public static Integer FILE_TYPE_CLAIM_AMOUNT            = 10121002;  // 索赔金额附件

    /*
     * 5050索赔单模块类型
     */
    public static final String FUNCTION_MODULE_TYPE_VEHICLE    = "10151001"; // 整车
    public static final String FUNCTION_MODULE_TYPE_ENGINE     = "10151002"; // 发动机
    public static final String FUNCTION_MODULE_TYPE_GEARBOX    = "10151003"; // 变速箱
    public static final String FUNCTION_MODULE_TYPE_NEW_ENERGY = "10151004"; // 新能源
    public static final String FUNCTION_MODULE_TYPE_NULL       = "10301001"; // 空模块

    
    //模拟登陆的登录密码和用户账号起始字母
    public static final String LOGIN_MOCK_USER_PASS = "1";
    public static final String LOGIN_MOCK_USER_NAME_BEGIN = "test";
    
    public static final String SIMBLE_COMMON_DOUHAO = ",";
    public static final String SIMBLE_COMMON_FENHAO = ";";
    public static final String SIMBLE_COMMON_ATHAO = "@";
    public static final String SIMBLE_COMMON_SPLITHAO = "#@#";
    public static final String SIMBLE_COMMON_TYPEDESC_SPLITH = "/";
    
    //有效，无效
    public static final Long CODE_COMMON_VALID_STATUS_YES = 10011001L;
    public static final Long CODE_COMMON_VALID_STATUS_NO = 10011002L;
    
    //权限类型  SGM,供应商,经销商
    public static final Long CODE_COMMON_AUTH_SGM = 10021001L;
    public static final Long CODE_COMMON_AUTH_SUPPLIER = 10021002L;
    public static final Long CODE_COMMON_AUTH_DEALER = 10021003L;
    
    //是否抵扣，1：是   0：否
    public static final Integer AFTERSALES_DEBIT_YES = 1;
    public static final Integer AFTERSALES_DEBIT_NOT = 0;
    public static final Integer AFTERSALES_DEBIT_CODE_YES = 10071001;
    public static final Integer AFTERSALES_DEBIT_CODE_NOT = 10071002;
    
    //是否追加，1：是   0：否
    public static final Integer AFTERSALES_CREDIT_YES = 1;
    public static final Integer AFTERSALES_CREDIT_NOT = 0;
    public static final Integer AFTERSALES_CREDIT_CODE_YES = 10281001;
    public static final Integer AFTERSALES_CREDIT_CODE_NOT = 10281002;

    
    //是否主配件 10061001 
    public static final Integer IS_MAIN_PART_INTEGER_YES = 1;
    public static final Integer IS_MAIN_PART_INTEGER_NOT = 0;
    public static final Integer IS_MAIN_PART_YES = 10061001;
    public static final Integer IS_MAIN_PART_NOT = 10061002;
    
    
    //售后索赔单查询分类(3个六合一的)
    //待分配清单-经销商索赔清单(待分配的索赔单)
    public static final Integer AFTER_CLAIM_SELECT_ONE = 1;
    //5050明细界面-经销商索赔清单(5050对应的售后索赔单)
    public static final Integer AFTER_CLAIM_SELECT_TWO = 2;
    //待索赔清单的明细
    public static final Integer AFTER_CLAIM_SELECT_THREE = 3;
    
    public static final Integer AFTER_CLAIM_CLOSE_FOUR = 4;
    
    //是否海外供应商
    public static final Integer IS_OVERSEAD_SUPPLIER_YES = 10091001;
    public static final Integer IS_OVERSEAD_SUPPLIER_NOT = 10091002;
    
    //5050签署状态
    public static final Integer FIFTY_SIGN_STATUS_INTEGER_Y = 10161001;
    public static final Integer FIFTY_SIGN_STATUS_INTEGER_N = 10161002;
    public static final Integer FIFTY_SIGN_STATUS_INTEGER_NA = 10161003;
    public static final Integer FIFTY_SIGN_STATUS_INTEGER_NULL = 10161004;
    
    //5050签署状态
    public static final String FIFTY_SIGN_STATUS_STR_Y = "Y";
    public static final String FIFTY_SIGN_STATUS_STR_N = "N";
    public static final String FIFTY_SIGN_STATUS_STR_NA = "N/A";
    public static final String FIFTY_SIGN_STATUS_STR_NULL = "";

    //结算状态
    public static final Integer PAYMENT_STATUS_INTEGER_NOT = 10251001;
    public static final Integer PAYMENT_STATUS_INTEGER_SUB = 10251002;
    public static final Integer PAYMENT_STATUS_INTEGER_HAS_MONEY = 10251003;
    public static final Integer PAYMENT_STATUS_INTEGER_HAS_PAYMENT = 10251004;
    
    public static final String PAYMENT_STATUS_STR_NOT = "未结算"; 
    public static final String PAYMENT_STATUS_STR_SUB = "部分锁款";
    public static final String PAYMENT_STATUS_STR_HAS_MONEY = "已锁款";
    public static final String PAYMENT_STATUS_STR_HAS_PAYMENT = "已结算";
    
    
    public static final Integer WORK_FOLW_BIZ_TYPE_5050     = 10221001;      // 5050索赔流程
    
    // 开票方式
    public static final Integer BILLING_TYPE_SUPPLIER     = 10241002;      // 供应商自行开票
    public static final Integer BILLING_TYPE_SGM          = 10241001;      // SGM开具普票
    
    // PLANT
    public static final Integer CLAIM_DEDUCTION_PLANT          = 10271001;     

    // SUBJECT
    public static final Integer CLAIM_DEDUCTION_SUBJECT          = 10291001;      

    //PQE协调员角色
    public static final String ROLE_CODE_PQEKEEPERALL = "PqeKeeperAll";
    //时间大于等于
    //金额大于等于
    //回运数量大于等于
    public static final String CONFIG_CODE_TIME_MAX_EQUAL = "1001";
    public static final String CONFIG_CODE_AMOUNT_MAX_EQUAL = "1002";
    public static final String CONFIG_CODE_RETURNSUM_MAX_EQUAL = "1003";
    
    public static final String DEFAULT_SECURITY_AUTH = "DEFAULTAUTH";
    
    //5050系统邮件默认发件人
    public static final Integer EMAIL_SEND_FROM = 10311001;
    //海外供应商为空，收件人
    public static final Integer EMAIL_SEND_TO_MDM_OVERSEA_NULL = 10311002;
    
    //默认采购协调员
    public static final Integer DEFAULT_BUYER_XIETIAO = 10321001;
    
   //成功与否标志
    public static final Integer SCS_STATUS_SUCCESS = 1;
    public static final Integer SCS_STATUS_FAIL = 0;
    public static final Integer SCS_STATUS_CODE_SUCCESS = 10371001;
    public static final Integer SCS_STATUS_CODE_FAIL = 10371002;  
    
    //计划任务日志类型
    //系统自动从接口表同步增量的售后索赔单明细信息
    public static final Integer JOB_TYPE_AFTERSALE_SYN = 10111001;
    //系统自动更新所有待索赔的售后索赔单的配件售后供应商及价格信息 计划任务
    public static final Integer JOB_TYPE_SUPPLIER_PRICE_SYN = 10111002;
    //每天定时同步5050状态和BUYER信息
    public static final Integer JOB_TYPE_5050_SIGNSTATUS_SYN = 10111003;
    //自动生成财务报表
    public static final Integer JOB_TYPE_5050_FINANCE_REPORT = 10111004;
    //索赔日志归档
    public static final Integer JOB_TYPE_5050_LOG_ARCHEVE = 10111005;


    // 采购员标签
    public static final Integer FIFTY_CLAIM_TAG_BUYER = 10361001;
    // sqe标签
    public static final Integer FIFTY_CLAIM_TAG_SQE = 10361002;
    
    // 标签类型
    public static final String BUYER_TAG_TYPE = "1";
    public static final String SQE_TAG_TYPE = "2";
    
    //关闭审核中
    public static final Long CLOSE_CLAIM_ING = 10351001L;
    //审核完成
    public static final Long CLOSE_CLAIM_OVER = 10351002l;
    //已退回
    public static final Long CLOSE_CLAIM_BACK = 10351003l;
    
}
