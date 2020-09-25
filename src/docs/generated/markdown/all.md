# API文档


<a name="overview"></a>
## 概览
采用swagger2


### 版本信息
*版本* : 1.0


### URI scheme
*域名* : localhost:8084  
*基础路径* : /budgetctl


### 标签

* 业务申请接口 : Inter Apply Controller
* 预算占用接口 : Bc Budget Occupy Controller




<a name="paths"></a>
## 资源

<a name="85b1799ce10d450fffa22b8f50356911"></a>
### 业务申请接口
Inter Apply Controller


<a name="acceptbizapplyusingpost_1"></a>
#### 接收费控等系统的业务申请
```
POST /bizEndPoint/bizApply
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**bizApplication**  <br>*必填*|业务申请单 合同等|[InterApplicationDTO](#interapplicationdto)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResponseEntity](#responseentity)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/bizEndPoint/bizApply
```


###### 请求 body
```
json :
{
  "applyDate" : "string",
  "applyMoney" : 0.0,
  "applyName" : "string",
  "applyNo" : "string",
  "billTypeCode" : "string",
  "bizApplicationDetailList" : [ {
    "applyDate" : "string",
    "applyDetailNo" : "string",
    "applyId" : 0,
    "applyNo" : "string",
    "billTypeCode" : "string",
    "budgetComCode" : "string",
    "budgetItemOne" : "string",
    "budgetItemTwo" : "string",
    "budgetOrgCode" : "string",
    "budgetSubjectCode" : "string",
    "budgetSubjectLevel" : "string",
    "budgetTypeCode" : "string",
    "businessSystemCode" : "string",
    "cashFlowCode" : "string",
    "checked" : true,
    "children" : [ {
      "applyDate" : "string",
      "applyDetailNo" : "string",
      "applyId" : 0,
      "applyNo" : "string",
      "billTypeCode" : "string",
      "budgetComCode" : "string",
      "budgetItemOne" : "string",
      "budgetItemTwo" : "string",
      "budgetOrgCode" : "string",
      "budgetSubjectCode" : "string",
      "budgetSubjectLevel" : "string",
      "budgetTypeCode" : "string",
      "businessSystemCode" : "string",
      "cashFlowCode" : "string",
      "checked" : true,
      "children" : [ "..." ],
      "currency" : "string",
      "customerId" : "string",
      "decimalSegment1" : 0.0,
      "decimalSegment2" : 0.0,
      "decimalSegment3" : 0.0,
      "decimalSegment4" : 0.0,
      "decimalSegment5" : 0.0,
      "expenseComCode" : "string",
      "expenseOrgCode" : "string",
      "freedomDimension" : "string",
      "id" : 0,
      "invoCode" : "string",
      "invoNo" : "string",
      "isUniteOrgCode" : 0,
      "loginId" : "string",
      "operationCode" : "string",
      "pageNum" : 0,
      "pageSize" : 0,
      "payBankCount" : "string",
      "priceMoney" : 0.0,
      "productLineId" : "string",
      "projectNo" : "string",
      "projectType" : "string",
      "remark" : "string",
      "state" : "string",
      "taxMoney" : 0.0,
      "textSegment1" : "string",
      "textSegment2" : "string",
      "textSegment3" : "string",
      "textSegment4" : "string",
      "textSegment5" : "string",
      "total" : 0,
      "totalMoney" : 0.0,
      "vendorId" : "string",
      "wapplyDetailNo" : "string",
      "wapplyNo" : "string",
      "wbillTypeCode" : "string",
      "wbusinessSystemCode" : "string",
      "wexpenseTypeCode" : "string",
      "withholdingAdjustTerms" : 0,
      "withholdingStartDate" : "string",
      "withholdingTerms" : 0,
      "withholdingTotalAdjustMoney" : 0.0,
      "withholdingTotalMoney" : 0.0
    } ],
    "currency" : "string",
    "customerId" : "string",
    "decimalSegment1" : 0.0,
    "decimalSegment2" : 0.0,
    "decimalSegment3" : 0.0,
    "decimalSegment4" : 0.0,
    "decimalSegment5" : 0.0,
    "expenseComCode" : "string",
    "expenseOrgCode" : "string",
    "freedomDimension" : "string",
    "id" : 0,
    "invoCode" : "string",
    "invoNo" : "string",
    "isUniteOrgCode" : 0,
    "loginId" : "string",
    "operationCode" : "string",
    "pageNum" : 0,
    "pageSize" : 0,
    "payBankCount" : "string",
    "priceMoney" : 0.0,
    "productLineId" : "string",
    "projectNo" : "string",
    "projectType" : "string",
    "remark" : "string",
    "state" : "string",
    "taxMoney" : 0.0,
    "textSegment1" : "string",
    "textSegment2" : "string",
    "textSegment3" : "string",
    "textSegment4" : "string",
    "textSegment5" : "string",
    "total" : 0,
    "totalMoney" : 0.0,
    "vendorId" : "string",
    "wapplyDetailNo" : "string",
    "wapplyNo" : "string",
    "wbillTypeCode" : "string",
    "wbusinessSystemCode" : "string",
    "wexpenseTypeCode" : "string",
    "withholdingAdjustTerms" : 0,
    "withholdingStartDate" : "string",
    "withholdingTerms" : 0,
    "withholdingTotalAdjustMoney" : 0.0,
    "withholdingTotalMoney" : 0.0
  } ],
  "bizApplicationPayeeList" : [ {
    "applyId" : 0,
    "checked" : true,
    "children" : [ {
      "applyId" : 0,
      "checked" : true,
      "children" : [ "..." ],
      "loginId" : "string",
      "pageNum" : 0,
      "pageSize" : 0,
      "payeeAccountName" : "string",
      "payeeBankAccount" : "string",
      "payeeBankCode" : "string",
      "payeeMoney" : 0.0,
      "state" : "string",
      "total" : 0
    } ],
    "loginId" : "string",
    "pageNum" : 0,
    "pageSize" : 0,
    "payeeAccountName" : "string",
    "payeeBankAccount" : "string",
    "payeeBankCode" : "string",
    "payeeMoney" : 0.0,
    "state" : "string",
    "total" : 0
  } ],
  "businessSystemCode" : "string",
  "checked" : true,
  "children" : [ {
    "applyDate" : "string",
    "applyMoney" : 0.0,
    "applyName" : "string",
    "applyNo" : "string",
    "billTypeCode" : "string",
    "bizApplicationDetailList" : [ {
      "applyDate" : "string",
      "applyDetailNo" : "string",
      "applyId" : 0,
      "applyNo" : "string",
      "billTypeCode" : "string",
      "budgetComCode" : "string",
      "budgetItemOne" : "string",
      "budgetItemTwo" : "string",
      "budgetOrgCode" : "string",
      "budgetSubjectCode" : "string",
      "budgetSubjectLevel" : "string",
      "budgetTypeCode" : "string",
      "businessSystemCode" : "string",
      "cashFlowCode" : "string",
      "checked" : true,
      "children" : [ "..." ],
      "currency" : "string",
      "customerId" : "string",
      "decimalSegment1" : 0.0,
      "decimalSegment2" : 0.0,
      "decimalSegment3" : 0.0,
      "decimalSegment4" : 0.0,
      "decimalSegment5" : 0.0,
      "expenseComCode" : "string",
      "expenseOrgCode" : "string",
      "freedomDimension" : "string",
      "id" : 0,
      "invoCode" : "string",
      "invoNo" : "string",
      "isUniteOrgCode" : 0,
      "loginId" : "string",
      "operationCode" : "string",
      "pageNum" : 0,
      "pageSize" : 0,
      "payBankCount" : "string",
      "priceMoney" : 0.0,
      "productLineId" : "string",
      "projectNo" : "string",
      "projectType" : "string",
      "remark" : "string",
      "state" : "string",
      "taxMoney" : 0.0,
      "textSegment1" : "string",
      "textSegment2" : "string",
      "textSegment3" : "string",
      "textSegment4" : "string",
      "textSegment5" : "string",
      "total" : 0,
      "totalMoney" : 0.0,
      "vendorId" : "string",
      "wapplyDetailNo" : "string",
      "wapplyNo" : "string",
      "wbillTypeCode" : "string",
      "wbusinessSystemCode" : "string",
      "wexpenseTypeCode" : "string",
      "withholdingAdjustTerms" : 0,
      "withholdingStartDate" : "string",
      "withholdingTerms" : 0,
      "withholdingTotalAdjustMoney" : 0.0,
      "withholdingTotalMoney" : 0.0
    } ],
    "bizApplicationPayeeList" : [ {
      "applyId" : 0,
      "checked" : true,
      "children" : [ "..." ],
      "loginId" : "string",
      "pageNum" : 0,
      "pageSize" : 0,
      "payeeAccountName" : "string",
      "payeeBankAccount" : "string",
      "payeeBankCode" : "string",
      "payeeMoney" : 0.0,
      "state" : "string",
      "total" : 0
    } ],
    "businessSystemCode" : "string",
    "checked" : true,
    "children" : [ "..." ],
    "comCode" : "string",
    "expectPaymentDate" : "string",
    "expenseTypeCode" : "string",
    "id" : 0,
    "isAmortization" : 0,
    "isWithholding" : 0,
    "loginId" : "string",
    "operationCode" : "string",
    "orgCode" : "string",
    "pageNum" : 0,
    "pageSize" : 0,
    "payMoney" : 0.0,
    "reMoney" : 0.0,
    "remark" : "string",
    "staffId" : "string",
    "state" : "string",
    "status" : 0,
    "total" : 0
  } ],
  "comCode" : "string",
  "expectPaymentDate" : "string",
  "expenseTypeCode" : "string",
  "id" : 0,
  "isAmortization" : 0,
  "isWithholding" : 0,
  "loginId" : "string",
  "operationCode" : "string",
  "orgCode" : "string",
  "pageNum" : 0,
  "pageSize" : 0,
  "payMoney" : 0.0,
  "reMoney" : 0.0,
  "remark" : "string",
  "staffId" : "string",
  "state" : "string",
  "status" : 0,
  "total" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "body" : "object",
  "statusCode" : "string",
  "statusCodeValue" : 0
}
```


<a name="dce5484aca4918b85cd78e9bf6f0fda5"></a>
### 预算占用接口
Bc Budget Occupy Controller


<a name="acceptbizapplyusingpost"></a>
#### 接收预算占用、释放申请
```
POST /budgetOccupyEndPoint/budgetOccupy
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**budgetOccupyPkg**  <br>*必填*|预算占用、释放申请等|[BudgetOccupyPkgDTO](#budgetoccupypkgdto)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResponseEntity](#responseentity)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/budgetOccupyEndPoint/budgetOccupy
```


###### 请求 body
```
json :
{
  "applyDate" : "string",
  "applyId" : 0,
  "billTypeCode" : "string",
  "budgetOccupyList" : [ {
    "accItemCode" : "string",
    "applyDetailId" : 0,
    "applyId" : 0,
    "applyState" : 0,
    "batchNo" : "string",
    "billTypeCode" : "string",
    "budgetComCode" : "string",
    "budgetCycleCode" : "string",
    "budgetItemOne" : "string",
    "budgetItemTwo" : "string",
    "budgetOrgCode" : "string",
    "budgetSubjectCode" : "string",
    "budgetSubjectLevel" : "string",
    "budgetTypeCode" : "string",
    "budgetTypeName" : "string",
    "businessSystemCode" : "string",
    "checkBudgetMoney" : 0.0,
    "checked" : true,
    "children" : [ {
      "accItemCode" : "string",
      "applyDetailId" : 0,
      "applyId" : 0,
      "applyState" : 0,
      "batchNo" : "string",
      "billTypeCode" : "string",
      "budgetComCode" : "string",
      "budgetCycleCode" : "string",
      "budgetItemOne" : "string",
      "budgetItemTwo" : "string",
      "budgetOrgCode" : "string",
      "budgetSubjectCode" : "string",
      "budgetSubjectLevel" : "string",
      "budgetTypeCode" : "string",
      "budgetTypeName" : "string",
      "businessSystemCode" : "string",
      "checkBudgetMoney" : 0.0,
      "checked" : true,
      "children" : [ "..." ],
      "createBy" : "string",
      "expenseComCode" : "string",
      "expenseOrgCode" : "string",
      "expenseTypeCode" : "string",
      "groupCode" : "string",
      "isExempt" : 0,
      "isGroupOccupy" : 0,
      "isUniteOrgCode" : 0,
      "loginId" : "string",
      "occupyAccountDate" : "yyyy-MM-dd",
      "occupyApprovalDate" : "yyyy-MM-dd",
      "occupyBudgetMoney" : 0.0,
      "occupyBudgetMonth" : "string",
      "occupyStatus" : 0,
      "occupySubmitDate" : "yyyy-MM-dd",
      "occupyWithholdDate" : "yyyy-MM-dd",
      "pageNum" : 0,
      "pageSize" : 0,
      "payBudgetMoney" : 0.0,
      "projectNo" : "string",
      "state" : "string",
      "total" : 0,
      "transactionDate" : "yyyy-MM-dd",
      "transactionMonth" : "string",
      "wapplyDetailId" : "string",
      "wapplyId" : "string",
      "wbillTypeCode" : "string",
      "wbusinessSystemCode" : "string",
      "wexpenseTypeCode" : "string",
      "withholdBudgetMoney" : 0.0
    } ],
    "createBy" : "string",
    "expenseComCode" : "string",
    "expenseOrgCode" : "string",
    "expenseTypeCode" : "string",
    "groupCode" : "string",
    "isExempt" : 0,
    "isGroupOccupy" : 0,
    "isUniteOrgCode" : 0,
    "loginId" : "string",
    "occupyAccountDate" : "yyyy-MM-dd",
    "occupyApprovalDate" : "yyyy-MM-dd",
    "occupyBudgetMoney" : 0.0,
    "occupyBudgetMonth" : "string",
    "occupyStatus" : 0,
    "occupySubmitDate" : "yyyy-MM-dd",
    "occupyWithholdDate" : "yyyy-MM-dd",
    "pageNum" : 0,
    "pageSize" : 0,
    "payBudgetMoney" : 0.0,
    "projectNo" : "string",
    "state" : "string",
    "total" : 0,
    "transactionDate" : "yyyy-MM-dd",
    "transactionMonth" : "string",
    "wapplyDetailId" : "string",
    "wapplyId" : "string",
    "wbillTypeCode" : "string",
    "wbusinessSystemCode" : "string",
    "wexpenseTypeCode" : "string",
    "withholdBudgetMoney" : 0.0
  } ],
  "businessSystemCode" : "string",
  "checked" : true,
  "children" : [ {
    "applyDate" : "string",
    "applyId" : 0,
    "billTypeCode" : "string",
    "budgetOccupyList" : [ {
      "accItemCode" : "string",
      "applyDetailId" : 0,
      "applyId" : 0,
      "applyState" : 0,
      "batchNo" : "string",
      "billTypeCode" : "string",
      "budgetComCode" : "string",
      "budgetCycleCode" : "string",
      "budgetItemOne" : "string",
      "budgetItemTwo" : "string",
      "budgetOrgCode" : "string",
      "budgetSubjectCode" : "string",
      "budgetSubjectLevel" : "string",
      "budgetTypeCode" : "string",
      "budgetTypeName" : "string",
      "businessSystemCode" : "string",
      "checkBudgetMoney" : 0.0,
      "checked" : true,
      "children" : [ "..." ],
      "createBy" : "string",
      "expenseComCode" : "string",
      "expenseOrgCode" : "string",
      "expenseTypeCode" : "string",
      "groupCode" : "string",
      "isExempt" : 0,
      "isGroupOccupy" : 0,
      "isUniteOrgCode" : 0,
      "loginId" : "string",
      "occupyAccountDate" : "yyyy-MM-dd",
      "occupyApprovalDate" : "yyyy-MM-dd",
      "occupyBudgetMoney" : 0.0,
      "occupyBudgetMonth" : "string",
      "occupyStatus" : 0,
      "occupySubmitDate" : "yyyy-MM-dd",
      "occupyWithholdDate" : "yyyy-MM-dd",
      "pageNum" : 0,
      "pageSize" : 0,
      "payBudgetMoney" : 0.0,
      "projectNo" : "string",
      "state" : "string",
      "total" : 0,
      "transactionDate" : "yyyy-MM-dd",
      "transactionMonth" : "string",
      "wapplyDetailId" : "string",
      "wapplyId" : "string",
      "wbillTypeCode" : "string",
      "wbusinessSystemCode" : "string",
      "wexpenseTypeCode" : "string",
      "withholdBudgetMoney" : 0.0
    } ],
    "businessSystemCode" : "string",
    "checked" : true,
    "children" : [ "..." ],
    "expenseTypeCode" : "string",
    "loginId" : "string",
    "operationCode" : "string",
    "pageNum" : 0,
    "pageSize" : 0,
    "state" : "string",
    "total" : 0
  } ],
  "expenseTypeCode" : "string",
  "loginId" : "string",
  "operationCode" : "string",
  "pageNum" : 0,
  "pageSize" : 0,
  "state" : "string",
  "total" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "body" : "object",
  "statusCode" : "string",
  "statusCodeValue" : 0
}
```




<a name="definitions"></a>
## 定义

<a name="budgetoccupydto"></a>
### BudgetOccupyDTO

|名称|说明|类型|
|---|---|---|
|**accItemCode**  <br>*可选*|**样例** : `"string"`|string|
|**applyDetailId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**applyId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**applyState**  <br>*可选*|**样例** : `0`|integer (int32)|
|**batchNo**  <br>*可选*|**样例** : `"string"`|string|
|**billTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetComCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetCycleCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetItemOne**  <br>*可选*|**样例** : `"string"`|string|
|**budgetItemTwo**  <br>*可选*|**样例** : `"string"`|string|
|**budgetOrgCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetSubjectCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetSubjectLevel**  <br>*可选*|**样例** : `"string"`|string|
|**budgetTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetTypeName**  <br>*可选*|**样例** : `"string"`|string|
|**businessSystemCode**  <br>*可选*|**样例** : `"string"`|string|
|**checkBudgetMoney**  <br>*可选*|**样例** : `0.0`|number|
|**checked**  <br>*可选*|**样例** : `true`|boolean|
|**children**  <br>*可选*|**样例** : `[ "[budgetoccupydto](#budgetoccupydto)" ]`|< [BudgetOccupyDTO](#budgetoccupydto) > array|
|**createBy**  <br>*可选*|**样例** : `"string"`|string|
|**expenseComCode**  <br>*可选*|**样例** : `"string"`|string|
|**expenseOrgCode**  <br>*可选*|**样例** : `"string"`|string|
|**expenseTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**groupCode**  <br>*可选*|**样例** : `"string"`|string|
|**isExempt**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isGroupOccupy**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isUniteOrgCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**loginId**  <br>*可选*|**样例** : `"string"`|string|
|**occupyAccountDate**  <br>*可选*|**样例** : `"yyyy-MM-dd"`|string|
|**occupyApprovalDate**  <br>*可选*|**样例** : `"yyyy-MM-dd"`|string|
|**occupyBudgetMoney**  <br>*可选*|**样例** : `0.0`|number|
|**occupyBudgetMonth**  <br>*可选*|**样例** : `"string"`|string|
|**occupyStatus**  <br>*可选*|**样例** : `0`|integer (int32)|
|**occupySubmitDate**  <br>*可选*|**样例** : `"yyyy-MM-dd"`|string|
|**occupyWithholdDate**  <br>*可选*|**样例** : `"yyyy-MM-dd"`|string|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**payBudgetMoney**  <br>*可选*|**样例** : `0.0`|number|
|**projectNo**  <br>*可选*|**样例** : `"string"`|string|
|**state**  <br>*可选*|**样例** : `"string"`|string|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|
|**transactionDate**  <br>*可选*|**样例** : `"yyyy-MM-dd"`|string|
|**transactionMonth**  <br>*可选*|**样例** : `"string"`|string|
|**wapplyDetailId**  <br>*可选*|**样例** : `"string"`|string|
|**wapplyId**  <br>*可选*|**样例** : `"string"`|string|
|**wbillTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**wbusinessSystemCode**  <br>*可选*|**样例** : `"string"`|string|
|**wexpenseTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**withholdBudgetMoney**  <br>*可选*|**样例** : `0.0`|number|


<a name="budgetoccupypkgdto"></a>
### BudgetOccupyPkgDTO

|名称|说明|类型|
|---|---|---|
|**applyDate**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**applyId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**billTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**budgetOccupyList**  <br>*可选*|**样例** : `[ "[budgetoccupydto](#budgetoccupydto)" ]`|< [BudgetOccupyDTO](#budgetoccupydto) > array|
|**businessSystemCode**  <br>*可选*|**样例** : `"string"`|string|
|**checked**  <br>*可选*|**样例** : `true`|boolean|
|**children**  <br>*可选*|**样例** : `[ "[budgetoccupypkgdto](#budgetoccupypkgdto)" ]`|< [BudgetOccupyPkgDTO](#budgetoccupypkgdto) > array|
|**expenseTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**loginId**  <br>*可选*|**样例** : `"string"`|string|
|**operationCode**  <br>*可选*|**样例** : `"string"`|string|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**state**  <br>*可选*|**样例** : `"string"`|string|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="interapplicationdto"></a>
### InterApplicationDTO
请求数据


|名称|说明|类型|
|---|---|---|
|**applyDate**  <br>*可选*|申请日期  <br>**样例** : `"string"`|string|
|**applyMoney**  <br>*可选*|申请单总金额=核销借款金额+付款金额  <br>**样例** : `0.0`|number|
|**applyName**  <br>*可选*|合同名称  <br>**样例** : `"string"`|string|
|**applyNo**  <br>*可选*|业务单据号  <br>**样例** : `"string"`|string|
|**billTypeCode**  <br>*可选*|业务数据单据类型编码  <br>**样例** : `"string"`|string|
|**bizApplicationDetailList**  <br>*可选*|业务明细信息  <br>**样例** : `[ "[0d46ae1b53ce284e8128cc46095ef3d4](#0d46ae1b53ce284e8128cc46095ef3d4)" ]`|< [业务明细信息](#0d46ae1b53ce284e8128cc46095ef3d4) > array|
|**bizApplicationPayeeList**  <br>*可选*|收款方信息  <br>**样例** : `[ "[109dff274b6440950d6ec4caf6f1817f](#109dff274b6440950d6ec4caf6f1817f)" ]`|< [收款方信息](#109dff274b6440950d6ec4caf6f1817f) > array|
|**businessSystemCode**  <br>*可选*|业务数据系统来源  <br>**样例** : `"string"`|string|
|**checked**  <br>*可选*|**样例** : `true`|boolean|
|**children**  <br>*可选*|**样例** : `[ "[interapplicationdto](#interapplicationdto)" ]`|< [InterApplicationDTO](#interapplicationdto) > array|
|**comCode**  <br>*可选*|申请主体编码  <br>**样例** : `"string"`|string|
|**expectPaymentDate**  <br>*可选*|期望付款日期  <br>**样例** : `"string"`|string|
|**expenseTypeCode**  <br>*可选*|业务数据费用类型编码  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|业务单id  <br>**样例** : `0`|integer (int64)|
|**isAmortization**  <br>*可选*|是否摊销(0-否 1-是)  <br>**样例** : `0`|integer (int32)|
|**isWithholding**  <br>*可选*|是否预提(0-否 1-是)  <br>**样例** : `0`|integer (int32)|
|**loginId**  <br>*可选*|**样例** : `"string"`|string|
|**operationCode**  <br>*可选*|操作码  <br>**样例** : `"string"`|string|
|**orgCode**  <br>*可选*|申请部门编号  <br>**样例** : `"string"`|string|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**payMoney**  <br>*可选*|付款金额  <br>**样例** : `0.0`|number|
|**reMoney**  <br>*可选*|核销借款金额  <br>**样例** : `0.0`|number|
|**remark**  <br>*可选*|申请备注  <br>**样例** : `"string"`|string|
|**staffId**  <br>*可选*|申请人员工号  <br>**样例** : `"string"`|string|
|**state**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|申请状态(0-撤销，1-新建)  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="responseentity"></a>
### ResponseEntity

|名称|说明|类型|
|---|---|---|
|**body**  <br>*可选*|**样例** : `"object"`|object|
|**statusCode**  <br>*可选*|**样例** : `"string"`|enum (100 CONTINUE, 101 SWITCHING_PROTOCOLS, 102 PROCESSING, 103 CHECKPOINT, 200 OK, 201 CREATED, 202 ACCEPTED, 203 NON_AUTHORITATIVE_INFORMATION, 204 NO_CONTENT, 205 RESET_CONTENT, 206 PARTIAL_CONTENT, 207 MULTI_STATUS, 208 ALREADY_REPORTED, 226 IM_USED, 300 MULTIPLE_CHOICES, 301 MOVED_PERMANENTLY, 302 FOUND, 302 MOVED_TEMPORARILY, 303 SEE_OTHER, 304 NOT_MODIFIED, 305 USE_PROXY, 307 TEMPORARY_REDIRECT, 308 PERMANENT_REDIRECT, 400 BAD_REQUEST, 401 UNAUTHORIZED, 402 PAYMENT_REQUIRED, 403 FORBIDDEN, 404 NOT_FOUND, 405 METHOD_NOT_ALLOWED, 406 NOT_ACCEPTABLE, 407 PROXY_AUTHENTICATION_REQUIRED, 408 REQUEST_TIMEOUT, 409 CONFLICT, 410 GONE, 411 LENGTH_REQUIRED, 412 PRECONDITION_FAILED, 413 PAYLOAD_TOO_LARGE, 413 REQUEST_ENTITY_TOO_LARGE, 414 URI_TOO_LONG, 414 REQUEST_URI_TOO_LONG, 415 UNSUPPORTED_MEDIA_TYPE, 416 REQUESTED_RANGE_NOT_SATISFIABLE, 417 EXPECTATION_FAILED, 418 I_AM_A_TEAPOT, 419 INSUFFICIENT_SPACE_ON_RESOURCE, 420 METHOD_FAILURE, 421 DESTINATION_LOCKED, 422 UNPROCESSABLE_ENTITY, 423 LOCKED, 424 FAILED_DEPENDENCY, 426 UPGRADE_REQUIRED, 428 PRECONDITION_REQUIRED, 429 TOO_MANY_REQUESTS, 431 REQUEST_HEADER_FIELDS_TOO_LARGE, 451 UNAVAILABLE_FOR_LEGAL_REASONS, 500 INTERNAL_SERVER_ERROR, 501 NOT_IMPLEMENTED, 502 BAD_GATEWAY, 503 SERVICE_UNAVAILABLE, 504 GATEWAY_TIMEOUT, 505 HTTP_VERSION_NOT_SUPPORTED, 506 VARIANT_ALSO_NEGOTIATES, 507 INSUFFICIENT_STORAGE, 508 LOOP_DETECTED, 509 BANDWIDTH_LIMIT_EXCEEDED, 510 NOT_EXTENDED, 511 NETWORK_AUTHENTICATION_REQUIRED)|
|**statusCodeValue**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="resultofstring"></a>
### ResultOfstring

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"string"`|string|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0d46ae1b53ce284e8128cc46095ef3d4"></a>
### 业务明细信息

|名称|说明|类型|
|---|---|---|
|**applyDate**  <br>*可选*|申请日期  <br>**样例** : `"string"`|string (date-time)|
|**applyDetailNo**  <br>*可选*|业务明细编号  <br>**样例** : `"string"`|string|
|**applyId**  <br>*可选*|申请单主表ID  <br>**样例** : `0`|integer (int64)|
|**applyNo**  <br>*可选*|业务主信息编号  <br>**样例** : `"string"`|string|
|**billTypeCode**  <br>*可选*|业务单据类型编码  <br>**样例** : `"string"`|string|
|**budgetComCode**  <br>*可选*|预算公司编码  <br>**样例** : `"string"`|string|
|**budgetItemOne**  <br>*可选*|预算事项一  <br>**样例** : `"string"`|string|
|**budgetItemTwo**  <br>*可选*|预算事项二  <br>**样例** : `"string"`|string|
|**budgetOrgCode**  <br>*可选*|预算部门编号/统筹部门编码  <br>**样例** : `"string"`|string|
|**budgetSubjectCode**  <br>*可选*|预算科目编号(三级预算科目)  <br>**样例** : `"string"`|string|
|**budgetSubjectLevel**  <br>*可选*|预算科目级别  <br>**样例** : `"string"`|string|
|**budgetTypeCode**  <br>*可选*|预算类型编码  <br>**样例** : `"string"`|string|
|**businessSystemCode**  <br>*可选*|业务系统编号  <br>**样例** : `"string"`|string|
|**cashFlowCode**  <br>*可选*|现金流  <br>**样例** : `"string"`|string|
|**checked**  <br>*可选*|**样例** : `true`|boolean|
|**children**  <br>*可选*|**样例** : `[ "[0d46ae1b53ce284e8128cc46095ef3d4](#0d46ae1b53ce284e8128cc46095ef3d4)" ]`|< [业务明细信息](#0d46ae1b53ce284e8128cc46095ef3d4) > array|
|**currency**  <br>*可选*|币种  <br>**样例** : `"string"`|string|
|**customerId**  <br>*可选*|客户编码  <br>**样例** : `"string"`|string|
|**decimalSegment1**  <br>*可选*|金额备用字段1  <br>**样例** : `0.0`|number|
|**decimalSegment2**  <br>*可选*|金额备用字段2  <br>**样例** : `0.0`|number|
|**decimalSegment3**  <br>*可选*|金额备用字段3  <br>**样例** : `0.0`|number|
|**decimalSegment4**  <br>*可选*|金额备用字段4  <br>**样例** : `0.0`|number|
|**decimalSegment5**  <br>*可选*|金额备用字段5  <br>**样例** : `0.0`|number|
|**expenseComCode**  <br>*可选*|费用承担公司编码  <br>**样例** : `"string"`|string|
|**expenseOrgCode**  <br>*可选*|受益部门编码  <br>**样例** : `"string"`|string|
|**freedomDimension**  <br>*可选*|自由维度编码  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|业务明细id  <br>**样例** : `0`|integer (int64)|
|**invoCode**  <br>*可选*|发票代码  <br>**样例** : `"string"`|string|
|**invoNo**  <br>*可选*|发票号码  <br>**样例** : `"string"`|string|
|**isUniteOrgCode**  <br>*可选*|是否统筹部门(0-否,1-是)  <br>**样例** : `0`|integer (int32)|
|**loginId**  <br>*可选*|**样例** : `"string"`|string|
|**operationCode**  <br>*可选*|操作码  <br>**样例** : `"string"`|string|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**payBankCount**  <br>*可选*|付款银行账号  <br>**样例** : `"string"`|string|
|**priceMoney**  <br>*可选*|明细价额  <br>**样例** : `0.0`|number|
|**productLineId**  <br>*可选*|产品线编码  <br>**样例** : `"string"`|string|
|**projectNo**  <br>*可选*|项目编号  <br>**样例** : `"string"`|string|
|**projectType**  <br>*可选*|项目类型编码  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|明细备注  <br>**样例** : `"string"`|string|
|**state**  <br>*可选*|**样例** : `"string"`|string|
|**taxMoney**  <br>*可选*|明细税额  <br>**样例** : `0.0`|number|
|**textSegment1**  <br>*可选*|文本备用字段1  <br>**样例** : `"string"`|string|
|**textSegment2**  <br>*可选*|文本备用字段2  <br>**样例** : `"string"`|string|
|**textSegment3**  <br>*可选*|文本备用字段3  <br>**样例** : `"string"`|string|
|**textSegment4**  <br>*可选*|文本备用字段4  <br>**样例** : `"string"`|string|
|**textSegment5**  <br>*可选*|文本备用字段5  <br>**样例** : `"string"`|string|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|
|**totalMoney**  <br>*可选*|报销金额(价税合计)  <br>**样例** : `0.0`|number|
|**vendorId**  <br>*可选*|供应商账户  <br>**样例** : `"string"`|string|
|**wapplyDetailNo**  <br>*可选*|**样例** : `"string"`|string|
|**wapplyNo**  <br>*可选*|**样例** : `"string"`|string|
|**wbillTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**wbusinessSystemCode**  <br>*可选*|**样例** : `"string"`|string|
|**wexpenseTypeCode**  <br>*可选*|**样例** : `"string"`|string|
|**withholdingAdjustTerms**  <br>*可选*|预提(摊销)调整周期  <br>**样例** : `0`|integer (int32)|
|**withholdingStartDate**  <br>*可选*|预提(摊销)开始日期  <br>**样例** : `"string"`|string (date-time)|
|**withholdingTerms**  <br>*可选*|预提（摊销）周期数  <br>**样例** : `0`|integer (int32)|
|**withholdingTotalAdjustMoney**  <br>*可选*|预提(摊销)调整金额(预提：每月预提金额；摊销：摊销总额)  <br>**样例** : `0.0`|number|
|**withholdingTotalMoney**  <br>*可选*|预提(摊销)金额(预提：每月预提金额；摊销：摊销总额)  <br>**样例** : `0.0`|number|


<a name="109dff274b6440950d6ec4caf6f1817f"></a>
### 收款方信息

|名称|说明|类型|
|---|---|---|
|**applyId**  <br>*可选*|业务单主表ID  <br>**样例** : `0`|integer (int64)|
|**checked**  <br>*可选*|**样例** : `true`|boolean|
|**children**  <br>*可选*|**样例** : `[ "[109dff274b6440950d6ec4caf6f1817f](#109dff274b6440950d6ec4caf6f1817f)" ]`|< [收款方信息](#109dff274b6440950d6ec4caf6f1817f) > array|
|**loginId**  <br>*可选*|**样例** : `"string"`|string|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**payeeAccountName**  <br>*可选*|收款方账户名  <br>**样例** : `"string"`|string|
|**payeeBankAccount**  <br>*可选*|收款方账户号  <br>**样例** : `"string"`|string|
|**payeeBankCode**  <br>*可选*|收款方开户行号(银行联行号)【根据CBS接口】  <br>**样例** : `"string"`|string|
|**payeeMoney**  <br>*可选*|收款金额  <br>**样例** : `0.0`|number|
|**state**  <br>*可选*|**样例** : `"string"`|string|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|





