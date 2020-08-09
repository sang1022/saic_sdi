/**
 * Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
 *
 * This software is published under the terms of the SGM Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * @Project Name : workflow.service
 *
 * @File name : ProcessConstant.java
 *
 * @Author : SANGDELIANG
 *
 * @Date : 2017年10月16日
 *
----------------------------------------------------------------------------------
 *     Date       Who       Version     Comments
 * 1. 2017年10月16日    SANGDELIANG    1.0
 *
 *
 *
 *
----------------------------------------------------------------------------------
 */

package com.saic.ndms.sdi.common.constants;

/**
 *
 * @author SANGDELIANG 
 * @description 流程定义相关常量
 * @date 2017年10月16日
 */
public class ProcessConstant {

	/**
	 * 合同到期时间变更code
	 */
	public static final String CONTRACT_DATE_CHANGE_CODE = "LE_2002_1004";

	/**
	 * 租赁合同第三方审计公司审批code
	 */
	public static final String LEASE_PROCCOSS_AUDIT_CODE = "LE_2002_1001";
	
	/**
	 * 租赁合同第三方审计公司审批code
	 */
	public static final String LEASE_PROCCOSS_CAR_AUDIT_CODE = "LE_2002_1006";

	/**
	 * 补贴申请类型->常规补贴申请流程code
	 */
	public static final String APPLICATION_CODE_GENERATE = "LE_2002_1002";

	/**
	 * 补贴申请类型->特殊补贴申请流程code
	 */
	public static final String APPLICATION_CODE_ESPECIAL = "";

	/**
	 * 补贴申请类型->残值补贴申请流程code
	 */
	public static final String APPLICATION_CODE_RESIDUAL_VALUE = "LE_2002_1003";

	/**
	 * 补贴申请变更流程code
	 */
	public static final String APPLICATION_CODE_CHANGE = "LE_2002_1005";
	
	/**
	 * 融资租赁商务政策审批流程code
	 */
	public static final String DB_APPROVE_CODE = "LE_2002_1007";

	public static final String EMPTY_STRING = "";

	// 流程定义相关常量
	/**
	 * 未处理
	 */
	public static final int HANDLE_STATUS_NOTSTART = 80021001;
	/**
	 * 已处理
	 */
	public static final int HANDLE_STATUS_END = 80021002;
	/**
	 * 驳回状态-如果调用completeTaskByNotAuto 只是扭转到下一节点，如果调用refuseOrEndProcess直接结束流程
	 */
    public static final int HANDLE_STATUS_REJECT_END = 80021003;
    
    /**
     * 直接结束流程
     */
    public static final int HANDLE_STATUS_STOP_END = 80021004;

	/**
	 * 流程为开始
	 */
	public static final int PROCESS_STATUS_NOSTART = 80031001;
	/**
	 * 流程进行中
	 */
	public static final int PROCESS_STATUS_ING = 80031002;
	/**
	 * 流程结束
	 */
	public static final int PROCESS_STATUS_END = 80031003;
	/**
	 * 流程暂停
	 */
	public static final int PROCESS_PAUSE = 80041001;
	/**
	 * 流程未暂停
	 */
	public static final int PROCESS_PAUSE_NOT = 80041002;
	/**
	 * 节点跳过
	 */
	public static final int IS_JUMP = 80071001;
	/**
	 * 节点不跳过
	 */
	public static final int IS_NOT_JUMP = 80071002;
	/**
	 * 处理中-任务状态
	 */
	public static final int TASK_STATUS_AWAIT_HANDLE = 80051001;
	/**
	 * 已处理-任务状态
	 */
	public static final int TASK_STATUS_ALREADY_HANDLE = 80051002;
	/**
	 * 代理状态-未代理
	 */
	public static final int AGENT_STATUS_NO = 80061001;
	/**
	 * 代理状态-已代理
	 */
	public static final int AGENT_STATUS_YES = 80061002;
	/**
	 * 独占
	 */
	public static final int SINGLE_OWN = 80011001;
	/**
	 * 会签
	 */
	public static final int NOT_SINGLE_OWN = 80011002;
	/**
	 * 任务提醒状态-已提醒1 未提醒0
	 */
	public static final int ALERT_STATUS_YES = 80071001;
	public static final int ALERT_STATUS_NO = 80071002;
	/**
	 * 发送方式 1表示邮件发送 0表示短信发送
	 */
	public static final int SEND_WAY_SMS = 80081001;
	public static final int SEND_WAY_EMAIL = 80081002;
	/**
	 * 是否重复发送 1是 0否
	 */
	public static final int REPEAT_SEND_YES = 80071001;
	public static final int REPEAT_SEND_NO = 80071002;

	/**
	 * 业务类型 0默认 1经销商短信邮件激活码
	 */
	public static final int BUSINESS_TYPE_DEFAULT = 0;
	public static final int BUSINESS_TYPE_ACTIVECODE = 1;

	// ===流程返回状态
	/**
	 * 成功
	 */
	public static final String RESULT_TYPE_SUCCESS = "success";

	/**
	 * 成功-标志流程结束
	 */
	public static final String RESULT_TYPE_SUCCESS_END = "successEnd";

	/**
	 * 整个流程节点都是跳过的
	 */
	public static final String RESULT_TYPE_PROCESSUNSTART = "ProcessUnStart";

	/**
	 * 错误
	 */
	public static final String RESULT_TYPE_ERROR = "error";
	/**
	 * 参数错误
	 */
	public static final String RESULT_TYPE_PARAM_ERROR = "paramError";

	/**
	 * 重复操作
	 */
	public static final String RESULT_TYPE_REPEAT_OPERATION = "repeatOperation";

	// ===流程定义类型
	/**
	 * 流程类型-审批
	 */
	public static final int PROCESS_CATEGORY_APPROVE = 1;

	/**
	 * 流程类型-业务
	 */
	public static final int PROCESS_CATEGORY_BUSSINESS = 2;

	/**
	 * 流程编码定义====
	 */

	public static final String START_NQA_MEMO = "START_NQA_MEMO";

	/**
	 * 发送失分点流程
	 */
	public static final String START_CMAP_MEMO = "START_CMAP_MEMO";

	/**
	 * 启动一次申诉流程
	 */
	public static final String START_NQL_APL1 = "START_NQL_APL1";

	/**
	 * 启动二次申诉流程
	 */
	public static final String START_NQL_APL2 = "START_NQL_APL2";

	/**
	 * 一次申诉反馈流程
	 */
	public static final String NQL_FEEDBACK1 = "NQL_FEEDBACK1";

	/**
	 * 二次申诉反馈流程
	 */
	public static final String NQL_FEEDBACK2 = "NQL_FEEDBACK2";
	/**
	 * 一次申诉流程
	 */
	public static final String NQL_APL1 = "NQL_APL1";

	/**
	 * nql申诉
	 */
	public static final String NQL_APPEAL = "NQL_APPEAL";

	/**
	 * 一次申诉第二个节点编码
	 */
	public static final String SU_NQL = "SU_NQL";

	/**
	 * 一次申诉第一个节点编码
	 */
	public static final String AM_NQL = "AM_NQL";
	/**
	 * 二次申诉流程
	 */
	public static final String NQL_APL2 = "NQL_APL2";

	/**
     * 
     */
	public static final String SU_NQL2 = "SU_NQL2";

	/**
	 * 二次申诉流程-能力评估经理
	 */
	public static final String ABILITY_NQL2 = "ABILITY_NQL2";
	/**
	 * 二次申诉流程-申诉协助人
	 */
	public static final String ASSIST_NQL2 = "ASSIST_NQL2";
	/**
	 * 二次申诉流程-网络评估经理
	 */
	public static final String NET_NQL2 = "NET_NQL2";

	/**
	 * 评估指标审核
	 */
	public static final String EVALUATION_TARGET = "EVALUATION_TARGET";

	/**
	 * 评估方案审核
	 */
	public static final String EVALUATION_PROJECT = "EVALUATION_PROJECT";

	/**
	 * 调研问卷版本审核
	 */
	public static final String EVALUATION_QUESTIONNAIRE = "EVALUATION_QUESTIONNAIRE";

	/**
	 * 调研问卷版本单店下发(审核通过)-经销商总经理
	 */
	public static final String CMAP_QSTN = "CMAP_QSTN";

	/**
	 * 入店行程满意度填写-经销商总经理
	 */
	public static final String CMAP_SCH_QSTN = "CMAP_SCH_QSTN";
	public static final String START_SCH_QSTN = "START_SCH_QSTN";
	/**
	 * cmap申诉流程
	 */
	public static final String CMAP_APL = "CMAP_APL";

	/**
	 * cmap申诉流程-启动
	 */
	public static final String START_CMAP_APL = "START_CMAP_APL";

	/**
	 * camp申诉-经销商审核
	 */
	public static final String DEALER_CMAP_APL = "DEALER_CMAP_APL";

	/**
	 * cmap申诉-能力评估经理审核
	 */
	public static final String ABILITY_CMAP_APL = "ABILITY_CMAP_APL";

	/**
	 * cmap申诉-网络评估经理审核
	 */
	public static final String NET_CMAP_APL = "NET_CMAP_APL";

	/**
	 * 入店行程主流程
	 */
	public static final String ENTRY_STORE = "ENTRY_STORE";

	/**
	 * 入店行程申诉
	 */
	// public static final String APPEAL_ENTRY_STORE = "APPEAL_ENTRY_STORE";

	/**
	 * 在场人员确认
	 */
	public static final String PRESENCE_CONFIRM = "PRESENCE_CONFIRM";

	/**
	 * 现场签字上传
	 */
	public static final String SIGNATURE_UPLOAD = "SIGNATURE_UPLOAD";

	/**
	 * 离店确认
	 */
	public static final String DEPARTURE_CONFIRM = "DEPARTURE_CONFIRM";

	/**
	 * CMAP后台内审
	 */
	public static final String BACK_AUDIT = "BACK_AUDIT";

	/**
	 * 角色code-区域经理
	 */
	public static final String CMAP_REGION_MGR = "CMAP_REGION_MGR";
	/**
	 * 角色code-经销商总经理
	 */
	public static final String CMAP_DEALER_MGR = "CMAP_DEALER_MGR";

	/**
	 * 个人工作室业务类型-区域经理
	 */
	public static final int AREA_MANAGER_APPEAL_APPROVE = 1;
	/**
	 * 个人工作室业务类型-能力评估经理
	 */
	public static final int ABILITY_MANAGER_APPEAL_APPROVE = 2;
	/**
	 * 个人工作室业务类型-网络评估经理
	 */
	public static final int NET_MANAGER_APPEAL_APPROVE = 3;

	/**
	 * 流程操作类型-开始
	 */
	public static final String OPERATOR_TYPE_START = "start";

	/**
	 * 流程操作类型-打回
	 */
	public static final String OPERATOR_TYPE_CALLBACK = "callback";

	/**
	 * 流程操作类型-提交
	 */
	public static final String OPERATOR_TYPE_SUBMIT = "submit";

	public static final String SUCCESS = "success";
	public static final String ERROR = "error";

	/**
	 * 流程提醒定义类型 1提交 2 打回 3结束
	 */
	public static final int FLOW_NOTICE_DEFINE_TYPE_SUBMIT = 1;
	public static final int FLOW_NOTICE_DEFINE_TYPE_CALLBACK = 2;
	public static final int FLOW_NOTICE_DEFINE_TYPE_END = 3;

	/**
	 * 租赁/跨省 10081001_10151001
	 */
	public static final String LEASE_REGION_CROSS_PROINVCE = "10081001_10151001";

	/**
	 * 租赁/非跨省 10081001_10151002
	 */
	public static final String LEASE_REGION_NOT_CROSS_PROINVCE = "10081001_10151002";

	/**
	 * 个人融资租赁/跨省 10081005_10151001
	 */
	public static final String PERSONAL_LEASE_REGION_CROSS_PROINVCE = "10081005_10151001";

	/**
	 * 个人融资租赁/非跨省 10081005_10151002
	 */
	public static final String PERSONAL_LEASE_REGION_NOT_CROSS_PROINVCE = "10081005_10151002";

	/**
	 * 企业/非个人类/中央直属 10081004_10071001_10181001
	 */
	public static final String CORP_COMPANY_CENTRAL = "10081004_10071001_10181001";

	/**
	 * 企业/非个人类/地方国资委 10081004_10071001_10181002
	 */
	public static final String CORP_COMPANY_LOCAL = "10081004_10071001_10181002";

	/**
	 * 企业/非个人类/银行/保险/证券 10081004_10071001_10181003
	 */
	public static final String CORP_COMPANY_BANKS = "10081004_10071001_10181003";

	/**
	 * 企业/非个人类/外资/合资/民营 10081004_10071001_10181004
	 */
	public static final String CORP_COMPANY_FOREIGN_JOIN = "10081004_10071001_10181004";

	/**
	 * 政府/非个人类/省/直辖市/单列市 10081002_10071001_10201001
	 */
	public static final String GOV_REGION_SINGLE_CITY = "10081002_10071001_10201001";

	/**
	 * 政府/非个人类/非省/直辖市/单列市 10081002_10071001_10201002
	 */
	public static final String GOV_REGION_NOTSINGLE_CITY = "10081002_10071001_10201002";

	/**
	 * 政府/非个人类/中央类 10081002_10071001_10201003
	 */
	public static final String GOV_REGION_CENTER_CLASS = "10081002_10071001_10201003";

	/**
	 * 警务/非个人类/省/直辖市/单列市 10081003_10071001_10201001
	 */
	public static final String GOVP_REGION_SINGLE_CITY = "10081003_10071001_10201001";

	/**
	 * 警务/非个人类/非省/直辖市/单列市 10081003_10071001_10201002
	 */
	public static final String GOVP_REGION_NOTSINGLE_CITY = "10081003_10071001_10201002";

	/**
	 * 政府/车改/省/直辖市/单列市 10081002_10071002_10201001
	 */
	public static final String CAR_GOV_REGION_SINGLE_CITY = "10081002_10071002_10201001";

	/**
	 * 政府/车改/非省/直辖市/单列市 10081002_10071002_10201002
	 */
	public static final String CAR_GOV_REGION_NOTSINGLE_CITY = "10081002_10071002_10201002";

	/**
	 * 政府/车改/中央类 10081002_10071002_10201003
	 */
	public static final String CAR_GOV_REGION_CENTER_CLASS = "10081002_10071002_10201003";

	/**
	 * 警务/车改/非省/直辖市/单列市 10081003_10071002_10201001
	 */
	public static final String CAR_GOVP_REGION_NOTSINGLE_CITY = "10081003_10071002_10201001";

	/**
	 * 警务/车改/省/直辖市/单列市 10081003_10071002_10201002
	 */
	public static final String CAR_GOVP_REGION_SINGLE_CITY = "10081003_10071002_10201002";

	/**
	 * 企业/车改/中央直属 10081004_10071002_10181001
	 */
	public static final String CAR_CORP_COMPANY_CENTRAL = "10081004_10071002_10181001";

	/**
	 * 企业/车改/地方国资委 10081004_10071001_10181002
	 */
	public static final String CAR_CORP_COMPANY_LOCAL = "10081004_10071002_10181002";

	/**
	 * 员工购车 10071003
	 */
	public static final String CAR_EMPLOYEE = "10071003";
	
	public static final String RESULT_TYPE_USERINFO_ERROR  ="流程节点中如果没有维护对应角色，请在调用流程时传入相关用户信息";

	private ProcessConstant() {
		//
	}
	/**
	 * 流程节点编码定义
	 */
	public static final String PROCESS_NODE_CODE_POLICY_MOS_COMMIT="POLICY_MOS_COMMIT"; //二手车提交

	/**
	 * @author JI Ning
	 * @description  员工车审批节点定义
	 * @date 2020/9/3 22:17
	 */
	public static final String SELF_DATE_CHANGE_CODE = "LE_2002_1009";

}
