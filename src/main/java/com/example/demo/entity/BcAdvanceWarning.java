package com.example.demo.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`t_bc_advance_warning`")
public class BcAdvanceWarning {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 提醒人
     */
    @Column(name = "`budget_type_code`")
    private String budgetTypeCode;

    /**
     * 预算科目
     */
    @Column(name = "`budget_subject_code`")
    private String budgetSubjectCode;

    /**
     * 预警方式(0-提示，1-预警，2-报错)
     */
    @Column(name = "`warning_type`")
    private Boolean warningType;

    /**
     * 用户组
     */
    @Column(name = "`user_group_code`")
    private String userGroupCode;

    /**
     * 是否通知直属部门负责人(0-否，1-是)
     */
    @Column(name = "`is_notify`")
    private Boolean isNotify;

    /**
     * 创建人
     */
    @Column(name = "`created_by`")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "`creation_date`")
    private Date creationDate;

    /**
     * 修改人
     */
    @Column(name = "`last_updated_by`")
    private String lastUpdatedBy;

    /**
     * 修改时间
     */
    @Column(name = "`last_updated_date`")
    private Date lastUpdatedDate;
}