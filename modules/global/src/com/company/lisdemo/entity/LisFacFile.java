package com.company.lisdemo.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "fac_nbr"))
})
@Table(name = "lis_fac_file")
@Entity(name = "lisdemo_LisFacFile")
public class LisFacFile extends BaseIntegerIdEntity {
    @Column(name = "fac_accreditation_code")
    protected Integer facAccreditationCode;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_accreditation_date")
    protected Date facAccreditationDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_accreditation_expire_date")
    protected Date facAccreditationExpireDate;
    @Column(name = "fac_action_code", length = 1)
    protected String facActionCode;
    @Column(name = "fac_addr_key", length = 19)
    protected String facAddrKey;
    @Column(name = "fac_admin", length = 26)
    protected String facAdmin;
    @Column(name = "fac_agg_status", length = 1)
    protected String facAggStatus;
    @Column(name = "fac_amb_1_17_nbr")
    protected Integer facAmb117Nbr;
    @Column(name = "fac_amb_18_64_nbr")
    protected Integer facAmb1864Nbr;
    @Column(name = "fac_amb_65_plus_nbr")
    protected Integer facAmb65PlusNbr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_annual_10_mo_defer_date")
    protected Date facAnnual10MoDeferDate;
    @Column(name = "fac_annual_10_mo_visit_appr", length = 3)
    protected String facAnnual10MoVisitAppr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_annual_10_mo_visit_date")
    protected Date facAnnual10MoVisitDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_annual_22_mo_defer_date")
    protected Date facAnnual22MoDeferDate;
    @Column(name = "fac_annual_22_mo_visit_appr", length = 3)
    protected String facAnnual22MoVisitAppr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_annual_22_mo_visit_date")
    protected Date facAnnual22MoVisitDate;
    @Column(name = "fac_annual_visit_year")
    protected Integer facAnnualVisitYear;
    @Column(name = "fac_bilingual")
    protected Integer facBilingual;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_billing_date")
    protected Date facBillingDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_cap_inc_closed_date")
    protected Date facCapIncClosedDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_cap_inc_rec_date")
    protected Date facCapIncRecDate;
    @Column(name = "fac_capacity")
    protected Integer facCapacity;
    @Column(name = "fac_cfirs_id_nbr")
    protected Integer facCfirsIdNbr;
    @Column(name = "fac_client_served")
    protected Integer facClientServed;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_client_served_appr_date")
    protected Date facClientServedApprDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_closed_date")
    protected Date facClosedDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_closed_process_date")
    protected Date facClosedProcessDate;
    @Column(name = "fac_co_nbr")
    protected Integer facCoNbr;
    @Column(name = "fac_complaint", length = 1)
    protected String facComplaint;
    @Column(name = "fac_deficiency", length = 1)
    protected String facDeficiency;
    @Column(name = "fac_do_eval_code", length = 4)
    protected String facDoEvalCode;
    @Column(name = "fac_do_nbr")
    protected Integer facDoNbr;
    @Column(name = "fac_dual_id", length = 1)
    protected String facDual;
    @Column(name = "fac_dual_nbr", length = 9)
    protected String facDualNbr;
    @Column(name = "fac_email_address", length = 40)
    protected String facEmailAddress;
    @Column(name = "fac_fcrb_prgm_nbr", length = 8)
    protected String facFcrbPrgmNbr;
    @Column(name = "fac_fm_region_nbr")
    protected Integer facFmRegionNbr;
    @Column(name = "fac_gh_indicator", length = 1)
    protected String facGhIndicator;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_gh_lic_eff_date")
    protected Date facGhLicEffDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_inactive_notice_date")
    protected Date facInactiveNoticeDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_inactive_start_date")
    protected Date facInactiveStartDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_inc_cap_eff_date")
    protected Date facIncCapEffDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_last_defer_visit_date")
    protected Date facLastDeferVisitDate;
    @Column(name = "fac_last_defer_visit_reason")
    protected Integer facLastDeferVisitReason;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_last_fire_clear_date")
    protected Date facLastFireClearDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_last_upd_date")
    protected Date facLastUpdDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_last_visit_date")
    protected Date facLastVisitDate;
    @Column(name = "fac_last_visit_reason")
    protected Integer facLastVisitReason;
    @Column(name = "fac_legal_action_indicator", length = 1)
    protected String facLegalActionIndicator;
    @Column(name = "fac_lic_comments", length = 210)
    protected String facLicComments;
    @Column(name = "fac_lic_comments_2", length = 210)
    protected String facLicComments2;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_lic_eff_date")
    protected Date facLicEffDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_lic_expir_date")
    protected Date facLicExpirDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_lic_first_date")
    protected Date facLicFirstDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_lic_last_change_date")
    protected Date facLicLastChangeDate;
    @Column(name = "fac_lic_mail_city", length = 20)
    protected String facLicMailCity;
    @Column(name = "fac_lic_mail_state", length = 2)
    protected String facLicMailState;
    @Column(name = "fac_lic_mail_street_addr", length = 30)
    protected String facLicMailStreetAddr;
    @Column(name = "fac_lic_mail_zip_code", length = 9)
    protected String facLicMailZipCode;
    @Column(name = "fac_licensee_name", length = 50)
    protected String facLicenseeName;
    @Column(name = "fac_licensee_type", length = 1)
    protected String facLicenseeType;
    @Column(name = "fac_loc_indicator", length = 1)
    protected String facLocIndicator;
    @Column(name = "fac_mail_city", length = 20)
    protected String facMailCity;
    @Column(name = "fac_mail_state", length = 2)
    protected String facMailState;
    @Column(name = "fac_mail_street_addr", length = 30)
    protected String facMailStreetAddr;
    @Column(name = "fac_mail_zip_code", length = 9)
    protected String facMailZipCode;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_mental_health_date")
    protected Date facMentalHealthDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_mental_health_expire_date")
    protected Date facMentalHealthExpireDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_mid_yr_defer_date")
    protected Date facMidYrDeferDate;
    @Column(name = "fac_mid_yr_visit_appr", length = 3)
    protected String facMidYrVisitAppr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_mid_yr_visit_date")
    protected Date facMidYrVisitDate;
    @Column(name = "fac_name", length = 50)
    protected String facName;
    @Column(name = "fac_nbr_new")
    protected Integer facNbrNew;
    @Column(name = "fac_nonamb_1_17_nbr")
    protected Integer facNonamb117Nbr;
    @Column(name = "fac_nonamb_18_64_nbr")
    protected Integer facNonamb1864Nbr;
    @Column(name = "fac_nonamb_65_plus_nbr")
    protected Integer facNonamb65PlusNbr;
    @Column(name = "fac_old_ffa_nbr")
    protected Integer facOldFfaNbr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_orig_appl_rec_date")
    protected Date facOrigApplRecDate;
    @Column(name = "fac_phone_nbr", length = 10)
    protected String facPhoneNbr;
    @Column(name = "fac_pin")
    protected Integer facPin;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_placement_date")
    protected Date facPlacementDate;
    @Column(name = "fac_placement_ready", length = 1)
    protected String facPlacementReady;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_plan_of_op_approval_date")
    protected Date facPlanOfOpApprovalDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_plan_of_op_recv_date")
    protected Date facPlanOfOpRecvDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_post_lic_defer_date")
    protected Date facPostLicDeferDate;
    @Column(name = "fac_post_lic_visit_appr", length = 3)
    protected String facPostLicVisitAppr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_post_lic_visit_date")
    protected Date facPostLicVisitDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_pre_lic_visit_date")
    protected Date facPreLicVisitDate;
    @Column(name = "fac_primary_nbr")
    protected Integer facPrimaryNbr;
    @Column(name = "fac_region_co")
    protected Integer facRegionCo;
    @Column(name = "fac_region_do")
    protected Integer facRegionDo;
    @Column(name = "fac_region_nbr")
    protected Integer facRegionNbr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_renewal_defer_date")
    protected Date facRenewalDeferDate;
    @Column(name = "fac_renewal_visit_appr", length = 3)
    protected String facRenewalVisitAppr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_renewal_visit_date")
    protected Date facRenewalVisitDate;
    @Column(name = "fac_required_visit", length = 1)
    protected String facRequiredVisit;
    @Column(name = "fac_res_city", length = 20)
    protected String facResCity;
    @Column(name = "fac_res_state", length = 2)
    protected String facResState;
    @Column(name = "fac_res_street_addr", length = 30)
    protected String facResStreetAddr;
    @Column(name = "fac_res_zip_code", length = 9)
    protected String facResZipCode;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_rfh_convert_date")
    protected Date facRfhConvertDate;
    @Column(name = "fac_sfm_id_nbr", length = 17)
    protected String facSfmIdNbr;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_sod_match_date")
    protected Date facSodMatchDate;
    @Column(name = "fac_status")
    protected Integer facStatus;
    @Column(name = "fac_street_search", length = 20)
    protected String facStreetSearch;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_strtp_app_denied_date")
    protected Date facStrtpAppDeniedDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_strtp_app_recv_date")
    protected Date facStrtpAppRecvDate;
    @Column(name = "fac_type")
    protected Integer facType;
    @Column(name = "fac_type999_caci_indicator", length = 1)
    protected String facType999CaciIndicator;
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_unlic_orig_input_date")
    protected Date facUnlicOrigInputDate;
    @Column(name = "isn_lis_fac_file", nullable = false)
    protected Integer isnLisFacFile;
    @Column(name = "system_datetime_1", precision = 14, scale = 0)
    protected BigDecimal systemDatetime1;
    @Column(name = "system_datetime_count")
    protected Integer systemDatetimeCount;
    @Column(name = "system_secuid_1", length = 8)
    protected String systemSecuid1;
    @Column(name = "system_secuid_count")
    protected Integer systemSecuidCount;

    public Integer getSystemSecuidCount() {
        return systemSecuidCount;
    }

    public void setSystemSecuidCount(Integer systemSecuidCount) {
        this.systemSecuidCount = systemSecuidCount;
    }

    public String getSystemSecuid1() {
        return systemSecuid1;
    }

    public void setSystemSecuid1(String systemSecuid1) {
        this.systemSecuid1 = systemSecuid1;
    }

    public Integer getSystemDatetimeCount() {
        return systemDatetimeCount;
    }

    public void setSystemDatetimeCount(Integer systemDatetimeCount) {
        this.systemDatetimeCount = systemDatetimeCount;
    }

    public BigDecimal getSystemDatetime1() {
        return systemDatetime1;
    }

    public void setSystemDatetime1(BigDecimal systemDatetime1) {
        this.systemDatetime1 = systemDatetime1;
    }

    public Integer getIsnLisFacFile() {
        return isnLisFacFile;
    }

    public void setIsnLisFacFile(Integer isnLisFacFile) {
        this.isnLisFacFile = isnLisFacFile;
    }

    public Date getFacUnlicOrigInputDate() {
        return facUnlicOrigInputDate;
    }

    public void setFacUnlicOrigInputDate(Date facUnlicOrigInputDate) {
        this.facUnlicOrigInputDate = facUnlicOrigInputDate;
    }

    public String getFacType999CaciIndicator() {
        return facType999CaciIndicator;
    }

    public void setFacType999CaciIndicator(String facType999CaciIndicator) {
        this.facType999CaciIndicator = facType999CaciIndicator;
    }

    public Integer getFacType() {
        return facType;
    }

    public void setFacType(Integer facType) {
        this.facType = facType;
    }

    public Date getFacStrtpAppRecvDate() {
        return facStrtpAppRecvDate;
    }

    public void setFacStrtpAppRecvDate(Date facStrtpAppRecvDate) {
        this.facStrtpAppRecvDate = facStrtpAppRecvDate;
    }

    public Date getFacStrtpAppDeniedDate() {
        return facStrtpAppDeniedDate;
    }

    public void setFacStrtpAppDeniedDate(Date facStrtpAppDeniedDate) {
        this.facStrtpAppDeniedDate = facStrtpAppDeniedDate;
    }

    public String getFacStreetSearch() {
        return facStreetSearch;
    }

    public void setFacStreetSearch(String facStreetSearch) {
        this.facStreetSearch = facStreetSearch;
    }

    public Integer getFacStatus() {
        return facStatus;
    }

    public void setFacStatus(Integer facStatus) {
        this.facStatus = facStatus;
    }

    public Date getFacSodMatchDate() {
        return facSodMatchDate;
    }

    public void setFacSodMatchDate(Date facSodMatchDate) {
        this.facSodMatchDate = facSodMatchDate;
    }

    public String getFacSfmIdNbr() {
        return facSfmIdNbr;
    }

    public void setFacSfmIdNbr(String facSfmIdNbr) {
        this.facSfmIdNbr = facSfmIdNbr;
    }

    public Date getFacRfhConvertDate() {
        return facRfhConvertDate;
    }

    public void setFacRfhConvertDate(Date facRfhConvertDate) {
        this.facRfhConvertDate = facRfhConvertDate;
    }

    public String getFacResZipCode() {
        return facResZipCode;
    }

    public void setFacResZipCode(String facResZipCode) {
        this.facResZipCode = facResZipCode;
    }

    public String getFacResStreetAddr() {
        return facResStreetAddr;
    }

    public void setFacResStreetAddr(String facResStreetAddr) {
        this.facResStreetAddr = facResStreetAddr;
    }

    public String getFacResState() {
        return facResState;
    }

    public void setFacResState(String facResState) {
        this.facResState = facResState;
    }

    public String getFacResCity() {
        return facResCity;
    }

    public void setFacResCity(String facResCity) {
        this.facResCity = facResCity;
    }

    public String getFacRequiredVisit() {
        return facRequiredVisit;
    }

    public void setFacRequiredVisit(String facRequiredVisit) {
        this.facRequiredVisit = facRequiredVisit;
    }

    public Date getFacRenewalVisitDate() {
        return facRenewalVisitDate;
    }

    public void setFacRenewalVisitDate(Date facRenewalVisitDate) {
        this.facRenewalVisitDate = facRenewalVisitDate;
    }

    public String getFacRenewalVisitAppr() {
        return facRenewalVisitAppr;
    }

    public void setFacRenewalVisitAppr(String facRenewalVisitAppr) {
        this.facRenewalVisitAppr = facRenewalVisitAppr;
    }

    public Date getFacRenewalDeferDate() {
        return facRenewalDeferDate;
    }

    public void setFacRenewalDeferDate(Date facRenewalDeferDate) {
        this.facRenewalDeferDate = facRenewalDeferDate;
    }

    public Integer getFacRegionNbr() {
        return facRegionNbr;
    }

    public void setFacRegionNbr(Integer facRegionNbr) {
        this.facRegionNbr = facRegionNbr;
    }

    public Integer getFacRegionDo() {
        return facRegionDo;
    }

    public void setFacRegionDo(Integer facRegionDo) {
        this.facRegionDo = facRegionDo;
    }

    public Integer getFacRegionCo() {
        return facRegionCo;
    }

    public void setFacRegionCo(Integer facRegionCo) {
        this.facRegionCo = facRegionCo;
    }

    public Integer getFacPrimaryNbr() {
        return facPrimaryNbr;
    }

    public void setFacPrimaryNbr(Integer facPrimaryNbr) {
        this.facPrimaryNbr = facPrimaryNbr;
    }

    public Date getFacPreLicVisitDate() {
        return facPreLicVisitDate;
    }

    public void setFacPreLicVisitDate(Date facPreLicVisitDate) {
        this.facPreLicVisitDate = facPreLicVisitDate;
    }

    public Date getFacPostLicVisitDate() {
        return facPostLicVisitDate;
    }

    public void setFacPostLicVisitDate(Date facPostLicVisitDate) {
        this.facPostLicVisitDate = facPostLicVisitDate;
    }

    public String getFacPostLicVisitAppr() {
        return facPostLicVisitAppr;
    }

    public void setFacPostLicVisitAppr(String facPostLicVisitAppr) {
        this.facPostLicVisitAppr = facPostLicVisitAppr;
    }

    public Date getFacPostLicDeferDate() {
        return facPostLicDeferDate;
    }

    public void setFacPostLicDeferDate(Date facPostLicDeferDate) {
        this.facPostLicDeferDate = facPostLicDeferDate;
    }

    public Date getFacPlanOfOpRecvDate() {
        return facPlanOfOpRecvDate;
    }

    public void setFacPlanOfOpRecvDate(Date facPlanOfOpRecvDate) {
        this.facPlanOfOpRecvDate = facPlanOfOpRecvDate;
    }

    public Date getFacPlanOfOpApprovalDate() {
        return facPlanOfOpApprovalDate;
    }

    public void setFacPlanOfOpApprovalDate(Date facPlanOfOpApprovalDate) {
        this.facPlanOfOpApprovalDate = facPlanOfOpApprovalDate;
    }

    public String getFacPlacementReady() {
        return facPlacementReady;
    }

    public void setFacPlacementReady(String facPlacementReady) {
        this.facPlacementReady = facPlacementReady;
    }

    public Date getFacPlacementDate() {
        return facPlacementDate;
    }

    public void setFacPlacementDate(Date facPlacementDate) {
        this.facPlacementDate = facPlacementDate;
    }

    public Integer getFacPin() {
        return facPin;
    }

    public void setFacPin(Integer facPin) {
        this.facPin = facPin;
    }

    public String getFacPhoneNbr() {
        return facPhoneNbr;
    }

    public void setFacPhoneNbr(String facPhoneNbr) {
        this.facPhoneNbr = facPhoneNbr;
    }

    public Date getFacOrigApplRecDate() {
        return facOrigApplRecDate;
    }

    public void setFacOrigApplRecDate(Date facOrigApplRecDate) {
        this.facOrigApplRecDate = facOrigApplRecDate;
    }

    public Integer getFacOldFfaNbr() {
        return facOldFfaNbr;
    }

    public void setFacOldFfaNbr(Integer facOldFfaNbr) {
        this.facOldFfaNbr = facOldFfaNbr;
    }

    public Integer getFacNonamb65PlusNbr() {
        return facNonamb65PlusNbr;
    }

    public void setFacNonamb65PlusNbr(Integer facNonamb65PlusNbr) {
        this.facNonamb65PlusNbr = facNonamb65PlusNbr;
    }

    public Integer getFacNonamb1864Nbr() {
        return facNonamb1864Nbr;
    }

    public void setFacNonamb1864Nbr(Integer facNonamb1864Nbr) {
        this.facNonamb1864Nbr = facNonamb1864Nbr;
    }

    public Integer getFacNonamb117Nbr() {
        return facNonamb117Nbr;
    }

    public void setFacNonamb117Nbr(Integer facNonamb117Nbr) {
        this.facNonamb117Nbr = facNonamb117Nbr;
    }

    public Integer getFacNbrNew() {
        return facNbrNew;
    }

    public void setFacNbrNew(Integer facNbrNew) {
        this.facNbrNew = facNbrNew;
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public Date getFacMidYrVisitDate() {
        return facMidYrVisitDate;
    }

    public void setFacMidYrVisitDate(Date facMidYrVisitDate) {
        this.facMidYrVisitDate = facMidYrVisitDate;
    }

    public String getFacMidYrVisitAppr() {
        return facMidYrVisitAppr;
    }

    public void setFacMidYrVisitAppr(String facMidYrVisitAppr) {
        this.facMidYrVisitAppr = facMidYrVisitAppr;
    }

    public Date getFacMidYrDeferDate() {
        return facMidYrDeferDate;
    }

    public void setFacMidYrDeferDate(Date facMidYrDeferDate) {
        this.facMidYrDeferDate = facMidYrDeferDate;
    }

    public Date getFacMentalHealthExpireDate() {
        return facMentalHealthExpireDate;
    }

    public void setFacMentalHealthExpireDate(Date facMentalHealthExpireDate) {
        this.facMentalHealthExpireDate = facMentalHealthExpireDate;
    }

    public Date getFacMentalHealthDate() {
        return facMentalHealthDate;
    }

    public void setFacMentalHealthDate(Date facMentalHealthDate) {
        this.facMentalHealthDate = facMentalHealthDate;
    }

    public String getFacMailZipCode() {
        return facMailZipCode;
    }

    public void setFacMailZipCode(String facMailZipCode) {
        this.facMailZipCode = facMailZipCode;
    }

    public String getFacMailStreetAddr() {
        return facMailStreetAddr;
    }

    public void setFacMailStreetAddr(String facMailStreetAddr) {
        this.facMailStreetAddr = facMailStreetAddr;
    }

    public String getFacMailState() {
        return facMailState;
    }

    public void setFacMailState(String facMailState) {
        this.facMailState = facMailState;
    }

    public String getFacMailCity() {
        return facMailCity;
    }

    public void setFacMailCity(String facMailCity) {
        this.facMailCity = facMailCity;
    }

    public String getFacLocIndicator() {
        return facLocIndicator;
    }

    public void setFacLocIndicator(String facLocIndicator) {
        this.facLocIndicator = facLocIndicator;
    }

    public String getFacLicenseeType() {
        return facLicenseeType;
    }

    public void setFacLicenseeType(String facLicenseeType) {
        this.facLicenseeType = facLicenseeType;
    }

    public String getFacLicenseeName() {
        return facLicenseeName;
    }

    public void setFacLicenseeName(String facLicenseeName) {
        this.facLicenseeName = facLicenseeName;
    }

    public String getFacLicMailZipCode() {
        return facLicMailZipCode;
    }

    public void setFacLicMailZipCode(String facLicMailZipCode) {
        this.facLicMailZipCode = facLicMailZipCode;
    }

    public String getFacLicMailStreetAddr() {
        return facLicMailStreetAddr;
    }

    public void setFacLicMailStreetAddr(String facLicMailStreetAddr) {
        this.facLicMailStreetAddr = facLicMailStreetAddr;
    }

    public String getFacLicMailState() {
        return facLicMailState;
    }

    public void setFacLicMailState(String facLicMailState) {
        this.facLicMailState = facLicMailState;
    }

    public String getFacLicMailCity() {
        return facLicMailCity;
    }

    public void setFacLicMailCity(String facLicMailCity) {
        this.facLicMailCity = facLicMailCity;
    }

    public Date getFacLicLastChangeDate() {
        return facLicLastChangeDate;
    }

    public void setFacLicLastChangeDate(Date facLicLastChangeDate) {
        this.facLicLastChangeDate = facLicLastChangeDate;
    }

    public Date getFacLicFirstDate() {
        return facLicFirstDate;
    }

    public void setFacLicFirstDate(Date facLicFirstDate) {
        this.facLicFirstDate = facLicFirstDate;
    }

    public Date getFacLicExpirDate() {
        return facLicExpirDate;
    }

    public void setFacLicExpirDate(Date facLicExpirDate) {
        this.facLicExpirDate = facLicExpirDate;
    }

    public Date getFacLicEffDate() {
        return facLicEffDate;
    }

    public void setFacLicEffDate(Date facLicEffDate) {
        this.facLicEffDate = facLicEffDate;
    }

    public String getFacLicComments2() {
        return facLicComments2;
    }

    public void setFacLicComments2(String facLicComments2) {
        this.facLicComments2 = facLicComments2;
    }

    public String getFacLicComments() {
        return facLicComments;
    }

    public void setFacLicComments(String facLicComments) {
        this.facLicComments = facLicComments;
    }

    public String getFacLegalActionIndicator() {
        return facLegalActionIndicator;
    }

    public void setFacLegalActionIndicator(String facLegalActionIndicator) {
        this.facLegalActionIndicator = facLegalActionIndicator;
    }

    public Integer getFacLastVisitReason() {
        return facLastVisitReason;
    }

    public void setFacLastVisitReason(Integer facLastVisitReason) {
        this.facLastVisitReason = facLastVisitReason;
    }

    public Date getFacLastVisitDate() {
        return facLastVisitDate;
    }

    public void setFacLastVisitDate(Date facLastVisitDate) {
        this.facLastVisitDate = facLastVisitDate;
    }

    public Date getFacLastUpdDate() {
        return facLastUpdDate;
    }

    public void setFacLastUpdDate(Date facLastUpdDate) {
        this.facLastUpdDate = facLastUpdDate;
    }

    public Date getFacLastFireClearDate() {
        return facLastFireClearDate;
    }

    public void setFacLastFireClearDate(Date facLastFireClearDate) {
        this.facLastFireClearDate = facLastFireClearDate;
    }

    public Integer getFacLastDeferVisitReason() {
        return facLastDeferVisitReason;
    }

    public void setFacLastDeferVisitReason(Integer facLastDeferVisitReason) {
        this.facLastDeferVisitReason = facLastDeferVisitReason;
    }

    public Date getFacLastDeferVisitDate() {
        return facLastDeferVisitDate;
    }

    public void setFacLastDeferVisitDate(Date facLastDeferVisitDate) {
        this.facLastDeferVisitDate = facLastDeferVisitDate;
    }

    public Date getFacIncCapEffDate() {
        return facIncCapEffDate;
    }

    public void setFacIncCapEffDate(Date facIncCapEffDate) {
        this.facIncCapEffDate = facIncCapEffDate;
    }

    public Date getFacInactiveStartDate() {
        return facInactiveStartDate;
    }

    public void setFacInactiveStartDate(Date facInactiveStartDate) {
        this.facInactiveStartDate = facInactiveStartDate;
    }

    public Date getFacInactiveNoticeDate() {
        return facInactiveNoticeDate;
    }

    public void setFacInactiveNoticeDate(Date facInactiveNoticeDate) {
        this.facInactiveNoticeDate = facInactiveNoticeDate;
    }

    public Date getFacGhLicEffDate() {
        return facGhLicEffDate;
    }

    public void setFacGhLicEffDate(Date facGhLicEffDate) {
        this.facGhLicEffDate = facGhLicEffDate;
    }

    public String getFacGhIndicator() {
        return facGhIndicator;
    }

    public void setFacGhIndicator(String facGhIndicator) {
        this.facGhIndicator = facGhIndicator;
    }

    public Integer getFacFmRegionNbr() {
        return facFmRegionNbr;
    }

    public void setFacFmRegionNbr(Integer facFmRegionNbr) {
        this.facFmRegionNbr = facFmRegionNbr;
    }

    public String getFacFcrbPrgmNbr() {
        return facFcrbPrgmNbr;
    }

    public void setFacFcrbPrgmNbr(String facFcrbPrgmNbr) {
        this.facFcrbPrgmNbr = facFcrbPrgmNbr;
    }

    public String getFacEmailAddress() {
        return facEmailAddress;
    }

    public void setFacEmailAddress(String facEmailAddress) {
        this.facEmailAddress = facEmailAddress;
    }

    public String getFacDualNbr() {
        return facDualNbr;
    }

    public void setFacDualNbr(String facDualNbr) {
        this.facDualNbr = facDualNbr;
    }

    public String getFacDual() {
        return facDual;
    }

    public void setFacDual(String facDual) {
        this.facDual = facDual;
    }

    public Integer getFacDoNbr() {
        return facDoNbr;
    }

    public void setFacDoNbr(Integer facDoNbr) {
        this.facDoNbr = facDoNbr;
    }

    public String getFacDoEvalCode() {
        return facDoEvalCode;
    }

    public void setFacDoEvalCode(String facDoEvalCode) {
        this.facDoEvalCode = facDoEvalCode;
    }

    public String getFacDeficiency() {
        return facDeficiency;
    }

    public void setFacDeficiency(String facDeficiency) {
        this.facDeficiency = facDeficiency;
    }

    public String getFacComplaint() {
        return facComplaint;
    }

    public void setFacComplaint(String facComplaint) {
        this.facComplaint = facComplaint;
    }

    public Integer getFacCoNbr() {
        return facCoNbr;
    }

    public void setFacCoNbr(Integer facCoNbr) {
        this.facCoNbr = facCoNbr;
    }

    public Date getFacClosedProcessDate() {
        return facClosedProcessDate;
    }

    public void setFacClosedProcessDate(Date facClosedProcessDate) {
        this.facClosedProcessDate = facClosedProcessDate;
    }

    public Date getFacClosedDate() {
        return facClosedDate;
    }

    public void setFacClosedDate(Date facClosedDate) {
        this.facClosedDate = facClosedDate;
    }

    public Date getFacClientServedApprDate() {
        return facClientServedApprDate;
    }

    public void setFacClientServedApprDate(Date facClientServedApprDate) {
        this.facClientServedApprDate = facClientServedApprDate;
    }

    public Integer getFacClientServed() {
        return facClientServed;
    }

    public void setFacClientServed(Integer facClientServed) {
        this.facClientServed = facClientServed;
    }

    public Integer getFacCfirsIdNbr() {
        return facCfirsIdNbr;
    }

    public void setFacCfirsIdNbr(Integer facCfirsIdNbr) {
        this.facCfirsIdNbr = facCfirsIdNbr;
    }

    public Integer getFacCapacity() {
        return facCapacity;
    }

    public void setFacCapacity(Integer facCapacity) {
        this.facCapacity = facCapacity;
    }

    public Date getFacCapIncRecDate() {
        return facCapIncRecDate;
    }

    public void setFacCapIncRecDate(Date facCapIncRecDate) {
        this.facCapIncRecDate = facCapIncRecDate;
    }

    public Date getFacCapIncClosedDate() {
        return facCapIncClosedDate;
    }

    public void setFacCapIncClosedDate(Date facCapIncClosedDate) {
        this.facCapIncClosedDate = facCapIncClosedDate;
    }

    public Date getFacBillingDate() {
        return facBillingDate;
    }

    public void setFacBillingDate(Date facBillingDate) {
        this.facBillingDate = facBillingDate;
    }

    public Integer getFacBilingual() {
        return facBilingual;
    }

    public void setFacBilingual(Integer facBilingual) {
        this.facBilingual = facBilingual;
    }

    public Integer getFacAnnualVisitYear() {
        return facAnnualVisitYear;
    }

    public void setFacAnnualVisitYear(Integer facAnnualVisitYear) {
        this.facAnnualVisitYear = facAnnualVisitYear;
    }

    public Date getFacAnnual22MoVisitDate() {
        return facAnnual22MoVisitDate;
    }

    public void setFacAnnual22MoVisitDate(Date facAnnual22MoVisitDate) {
        this.facAnnual22MoVisitDate = facAnnual22MoVisitDate;
    }

    public String getFacAnnual22MoVisitAppr() {
        return facAnnual22MoVisitAppr;
    }

    public void setFacAnnual22MoVisitAppr(String facAnnual22MoVisitAppr) {
        this.facAnnual22MoVisitAppr = facAnnual22MoVisitAppr;
    }

    public Date getFacAnnual22MoDeferDate() {
        return facAnnual22MoDeferDate;
    }

    public void setFacAnnual22MoDeferDate(Date facAnnual22MoDeferDate) {
        this.facAnnual22MoDeferDate = facAnnual22MoDeferDate;
    }

    public Date getFacAnnual10MoVisitDate() {
        return facAnnual10MoVisitDate;
    }

    public void setFacAnnual10MoVisitDate(Date facAnnual10MoVisitDate) {
        this.facAnnual10MoVisitDate = facAnnual10MoVisitDate;
    }

    public String getFacAnnual10MoVisitAppr() {
        return facAnnual10MoVisitAppr;
    }

    public void setFacAnnual10MoVisitAppr(String facAnnual10MoVisitAppr) {
        this.facAnnual10MoVisitAppr = facAnnual10MoVisitAppr;
    }

    public Date getFacAnnual10MoDeferDate() {
        return facAnnual10MoDeferDate;
    }

    public void setFacAnnual10MoDeferDate(Date facAnnual10MoDeferDate) {
        this.facAnnual10MoDeferDate = facAnnual10MoDeferDate;
    }

    public Integer getFacAmb65PlusNbr() {
        return facAmb65PlusNbr;
    }

    public void setFacAmb65PlusNbr(Integer facAmb65PlusNbr) {
        this.facAmb65PlusNbr = facAmb65PlusNbr;
    }

    public Integer getFacAmb1864Nbr() {
        return facAmb1864Nbr;
    }

    public void setFacAmb1864Nbr(Integer facAmb1864Nbr) {
        this.facAmb1864Nbr = facAmb1864Nbr;
    }

    public Integer getFacAmb117Nbr() {
        return facAmb117Nbr;
    }

    public void setFacAmb117Nbr(Integer facAmb117Nbr) {
        this.facAmb117Nbr = facAmb117Nbr;
    }

    public String getFacAggStatus() {
        return facAggStatus;
    }

    public void setFacAggStatus(String facAggStatus) {
        this.facAggStatus = facAggStatus;
    }

    public String getFacAdmin() {
        return facAdmin;
    }

    public void setFacAdmin(String facAdmin) {
        this.facAdmin = facAdmin;
    }

    public String getFacAddrKey() {
        return facAddrKey;
    }

    public void setFacAddrKey(String facAddrKey) {
        this.facAddrKey = facAddrKey;
    }

    public String getFacActionCode() {
        return facActionCode;
    }

    public void setFacActionCode(String facActionCode) {
        this.facActionCode = facActionCode;
    }

    public Date getFacAccreditationExpireDate() {
        return facAccreditationExpireDate;
    }

    public void setFacAccreditationExpireDate(Date facAccreditationExpireDate) {
        this.facAccreditationExpireDate = facAccreditationExpireDate;
    }

    public Date getFacAccreditationDate() {
        return facAccreditationDate;
    }

    public void setFacAccreditationDate(Date facAccreditationDate) {
        this.facAccreditationDate = facAccreditationDate;
    }

    public Integer getFacAccreditationCode() {
        return facAccreditationCode;
    }

    public void setFacAccreditationCode(Integer facAccreditationCode) {
        this.facAccreditationCode = facAccreditationCode;
    }
}