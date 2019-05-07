package com.company.lisdemo.entity;

import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.*;
import java.util.Date;

@DesignSupport("{'imported':true}")
@Table(name = "lis_fa_file")
@Entity(name = "lisdemo_LisFaFile")
public class LisFaFile extends BaseStringIdEntity {
    @Id
    @Column(name = "fa_per_id", nullable = false, length = 10)
    protected String faPer;
    @Column(name = "fa_action_code", length = 1)
    protected String faActionCode;
    @Column(name = "fa_do_nbr")
    protected Integer faDoNbr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fa_end_date")
    protected Date faEndDate;
    @Column(name = "fa_fac_nbr")
    protected Integer faFacNbr;
    @Column(name = "fa_fac_type")
    protected Integer faFacType;
    @Temporal(TemporalType.DATE)
    @Column(name = "fa_last_upd_date")
    protected Date faLastUpdDate;
    @Column(name = "fa_personnel_type", length = 1)
    protected String faPersonnelType;
    @Temporal(TemporalType.DATE)
    @Column(name = "fa_start_date")
    protected Date faStartDate;
    @Column(name = "isn_lis_fa_file", nullable = false)
    protected Integer isnLisFaFile;

    public Integer getIsnLisFaFile() {
        return isnLisFaFile;
    }

    public void setIsnLisFaFile(Integer isnLisFaFile) {
        this.isnLisFaFile = isnLisFaFile;
    }

    public Date getFaStartDate() {
        return faStartDate;
    }

    public void setFaStartDate(Date faStartDate) {
        this.faStartDate = faStartDate;
    }

    public String getFaPersonnelType() {
        return faPersonnelType;
    }

    public void setFaPersonnelType(String faPersonnelType) {
        this.faPersonnelType = faPersonnelType;
    }

    public Date getFaLastUpdDate() {
        return faLastUpdDate;
    }

    public void setFaLastUpdDate(Date faLastUpdDate) {
        this.faLastUpdDate = faLastUpdDate;
    }

    public Integer getFaFacType() {
        return faFacType;
    }

    public void setFaFacType(Integer faFacType) {
        this.faFacType = faFacType;
    }

    public Integer getFaFacNbr() {
        return faFacNbr;
    }

    public void setFaFacNbr(Integer faFacNbr) {
        this.faFacNbr = faFacNbr;
    }

    public Date getFaEndDate() {
        return faEndDate;
    }

    public void setFaEndDate(Date faEndDate) {
        this.faEndDate = faEndDate;
    }

    public Integer getFaDoNbr() {
        return faDoNbr;
    }

    public void setFaDoNbr(Integer faDoNbr) {
        this.faDoNbr = faDoNbr;
    }

    public String getFaActionCode() {
        return faActionCode;
    }

    public void setFaActionCode(String faActionCode) {
        this.faActionCode = faActionCode;
    }

    @Override
    public void setId(String id) {
        this.faPer = id;
    }

    @Override
    public String getId() {
        return faPer;
    }

    public String getFaPer() {
        return faPer;
    }

    public void setFaPer(String faPer) {
        this.faPer = faPer;
    }
}