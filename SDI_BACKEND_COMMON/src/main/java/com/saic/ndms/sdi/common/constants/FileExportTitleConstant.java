/**
* Copyright 2019 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : FLAG-BACKEND-COMMON
*
* @File name : FileExportTitleConstant.java
*
* @Author : lijing
*
* @Date : Jul 19, 2019
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. Jul 19, 2019    lijing    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/
	
package com.saic.ndms.sdi.common.constants;

/**
* @author lijing
* @description 文件导出标题常量类
* @date Jul 19, 2019
*/
public class FileExportTitleConstant {

	//SGM残值数据版本导出标题
    public static final String[] RESIDAUL_VERSION_HEADS = {"保值率系统版本","","数据季度标示","","保值率系统有效期","",""};
    public static final String[] FORWARD_RESIDAU_HEADS = {"第一车网品牌","第一车网车型","期数","本期保值率系统残值","前一期保值率系统残值","",""};
    public static final String[] LE_RESIDAUL_VERSION_HEADS = {"","保值率系统版本","","数据季度标示","","保值率系统有效期","","",""};
    public static final String[] SGM_RESIDAUL_VERSION_HEADS = {"","版本","","名称","","有效期","","",""};
    public static final String[] SGM_FORWARD_RESIDAU_HEADS = {"品牌","车系","期数","本期保值率系统残值","前一期保值率系统残值","本期残值下限","本期残值上限","前一期残值下限","前一期残值上限"};
    // 商务政策title
    public static final String[] BUSINESS_EXPORT_BASE_HEADS = {"品牌", "车系", "市场名称", "MSRP", "财务描述", "工程代码", "补贴类型", "DFMS政策", "FLAG调整政策", "期数","有效/无效"};
 // 商务政策title2
    public static final String[] BUSINESS_EXPORT_BASE_HEADS_TWO = {"品牌", "车系", "市场名称", "MSRP", "财务描述", "工程代码", "补贴类型", "DFMS政策", "FLAG调整政策", "期数","有效/无效","奖金名称"};
}
