
package com.saic.ndms.sdi.common.exception;

/**
 * @author LiuJun
 * @description 异常状态定义
 * @date 2019年4月23日
 */
public enum ErrorStatus {

     BUSINESSERROR("400", "业务异常"),
     AUTHERROR("401", "没有权限"), 
     SERVICEERROR("500", "服务器异常"),
     EXPORTERROR("1001", "导出异常"), 
     SQLERROR("1002", "数据库异常"), 
     VALIDERROR("1003", "名称已经存在异常"), 
     IMPORTERROR("10042", "文件导入异常"), 
     REDIRECT("10053", "URL跳转异常"),
     INVOCATIONERROR("10064", "服务调用异常"), 
     FILEGETERROR("10075", "模板文件获取异常"),
     IMPORTCONTENTERROR("1008", "必填项不能为空"), 
     IMPORTHEADERERROR("1009", "导入的文件不正确"),
     UPDATESUBSIDIESERROR("1010", "已经申请过补贴，不能再修改补贴信息！"),
     EXISTSSUBSIDIESERROR("1011", "已经存在相同类型、名称的补贴！"), 
     NOTFINDAPPROVE("10120", "没有找到对应的审批人!"),
     STATUSERROR("1013", "合同状态不正确"), 
     DATAMATERROR("1014", "打包总额格式不正确"),
     EXCELFORMULAERROR("1015", "POI暂不支持该EXCEL公式"),
     LOADERROR("1016", "贷款金额不符合条件"),
     AMOUNTERROR("1017", "查询失败,R&T不符合条件"), 
     AMOUNTERROR2("1018", "合同约定残值不能小于残值下线"),
     AMOUNTERROR3("1019", "查询失败,首付比例只能是最多带两位小数的数字!"), 
     AMOUNTERROR4("1020", "查询失败,首付比例超过上限"),
     AMOUNTERROR5("1021", "查询失败,首付比例低于下限"), 
     AMOUNTERROR6("1022", "查询失败,首付比例不符合首付比例间隔"),
     AMOUNTERROR7("1023", "查询失败,保证金比例只能是最多带两位小数的数字!"), 
     AMOUNTERROR8("1024", "查询失败,保证金比例超过上限"),
     AMOUNTERROR9("1025", "查询失败,保证金比例低于下限"), 
     AMOUNTERROR10("1026", "查询失败,保证金比例不符合保证金比例间隔"),
     AMOUNTERROR11("1027", "查询失败,保证金比例和首付比例之和小于最小值！"), 
     AMOUNTERROR12("1028", "未查询到车辆信息，请重新选择！"),
     PROVIDERERROR("1029", "供应商代码已经存在"), 
     VINEXISTSERROR("1030", "VIN号已经存在!"),
     DELERROR("1031", "只有草稿状态才能删除！"), 
     GETSUBSIDIESERROR("1032", "没有获取到对应的补贴信息!"),
     SUBSIDIESUPPERSERROR("1033", "已申请补贴金额大于实际补贴金额!"), 
     TARGETERROR("1013", "没有达到指定的标准，不能申请达标奖补贴!"),
     SUBSIDIEINFOIDERROR("1034", "补贴类型名称不能为空!"), 
     PRODUCTSTATUSERROR("1035", "产品状态必须为已发布或商务政策为已确认!"),
     PROVIDERUSERERROR("1036", "该用户已经维护过供应商关系"), 
     NOPRODUCTNOERROR("1037", "产品编号不存在!"),
     GETCARINFOERROR("1038", "车辆信息不存在！"), 
     NOSUCHPERIOD("1039", "没有对应的融资期限!"),
     VEHICLEDAMAGEERROR("1040", "车损推送接口调用失败!"), 
     AUCTIONRESULTERROR("1041", "拍卖结果接口调用失败!");

    private final String errorCode;
    private final String errorMsg;

    ErrorStatus(String errorCode, String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String errorCode() {
        return this.errorCode;
    }

    public String errorMsg() {
        return this.errorMsg;
    }

}
