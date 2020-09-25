package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`t_inter_application_payee`")
public class InterApplicationPayee {

    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 业务单主表ID
     */
    @Column(name = "`apply_id`")
    private Long applyId;

    /**
     * 业务单据号
     */
    @Column(name = "`apply_no`")
    private String applyNo;

    /**
     * 业务数据系统来源
     */
    @Column(name = "`business_system_code`")
    private String businessSystemCode;

    /**
     * 业务数据单据类型编码
     */
    @Column(name = "`bill_type_code`")
    private String billTypeCode;

    /**
     * 业务数据费用类型编码
     */
    @Column(name = "`expense_type_code`")
    private String expenseTypeCode;

    /**
     * 收款方类型(0：对私（个人）；1，对公（供应商）)
     */
    @Column(name = "`payee_type`")
    private String payeeType;

    /**
     * 收款人代码(员工：staffid；供应商：供应商账户编码)
     */
    @Column(name = "`vendor_id`")
    private String vendorId;

    /**
     * 收款人名称(员工：员工姓名；供应商：供应商账户名称)
     */
    @Column(name = "`vendor_name`")
    private String vendorName;

    /**
     * 收款方开户行号(银行联行号)【根据CBS接口】
     */
    @Column(name = "`payee_bank_code`")
    private String payeeBankCode;

    /**
     * 收款人身份证号
     */
    @Column(name = "`payee_id_card`")
    private String payeeIdCard;

    /**
     * 收款方账户号
     */
    @Column(name = "`payee_account`")
    private String payeeAccount;

    /**
     * 收款方账户名
     */
    @Column(name = "`payee_account_name`")
    private String payeeAccountName;

    /**
     * 收款人银行信息
     */
    @Column(name = "`payee_bank_info`")
    private String payeeBankInfo;

    /**
     * 收款账号所在省
     */
    @Column(name = "`province`")
    private String province;

    /**
     * 收款账号所在市
     */
    @Column(name = "`city`")
    private String city;

    /**
     * 收款金额
     */
    @Column(name = "`payee_money`")
    private BigDecimal payeeMoney;
}