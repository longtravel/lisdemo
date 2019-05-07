-- begin LIS_FA_FILE
create table lis_fa_file (
    fa_per_id varchar(10),
    --
    fa_action_code varchar(1),
    fa_do_nbr integer,
    fa_end_date date,
    fa_fac_nbr integer,
    fa_fac_type integer,
    fa_last_upd_date date,
    fa_personnel_type varchar(1),
    fa_start_date date,
    isn_lis_fa_file integer not null,
    --
    primary key (fa_per_id)
)^
-- end LIS_FA_FILE
-- begin LIS_FAC_FILE
create table lis_fac_file (
    fac_nbr integer,
    --
    fac_accreditation_code integer,
    fac_accreditation_date date,
    fac_accreditation_expire_date date,
    fac_action_code varchar(1),
    fac_addr_key varchar(19),
    fac_admin varchar(26),
    fac_agg_status varchar(1),
    fac_amb_1_17_nbr integer,
    fac_amb_18_64_nbr integer,
    fac_amb_65_plus_nbr integer,
    fac_annual_10_mo_defer_date date,
    fac_annual_10_mo_visit_appr varchar(3),
    fac_annual_10_mo_visit_date date,
    fac_annual_22_mo_defer_date date,
    fac_annual_22_mo_visit_appr varchar(3),
    fac_annual_22_mo_visit_date date,
    fac_annual_visit_year integer,
    fac_bilingual integer,
    fac_billing_date date,
    fac_cap_inc_closed_date date,
    fac_cap_inc_rec_date date,
    fac_capacity integer,
    fac_cfirs_id_nbr integer,
    fac_client_served integer,
    fac_client_served_appr_date date,
    fac_closed_date date,
    fac_closed_process_date date,
    fac_co_nbr integer,
    fac_complaint varchar(1),
    fac_deficiency varchar(1),
    fac_do_eval_code varchar(4),
    fac_do_nbr integer,
    fac_dual_id varchar(1),
    fac_dual_nbr varchar(9),
    fac_email_address varchar(40),
    fac_fcrb_prgm_nbr varchar(8),
    fac_fm_region_nbr integer,
    fac_gh_indicator varchar(1),
    fac_gh_lic_eff_date date,
    fac_inactive_notice_date date,
    fac_inactive_start_date date,
    fac_inc_cap_eff_date date,
    fac_last_defer_visit_date date,
    fac_last_defer_visit_reason integer,
    fac_last_fire_clear_date date,
    fac_last_upd_date date,
    fac_last_visit_date date,
    fac_last_visit_reason integer,
    fac_legal_action_indicator varchar(1),
    fac_lic_comments varchar(210),
    fac_lic_comments_2 varchar(210),
    fac_lic_eff_date date,
    fac_lic_expir_date date,
    fac_lic_first_date date,
    fac_lic_last_change_date date,
    fac_lic_mail_city varchar(20),
    fac_lic_mail_state varchar(2),
    fac_lic_mail_street_addr varchar(30),
    fac_lic_mail_zip_code varchar(9),
    fac_licensee_name varchar(50),
    fac_licensee_type varchar(1),
    fac_loc_indicator varchar(1),
    fac_mail_city varchar(20),
    fac_mail_state varchar(2),
    fac_mail_street_addr varchar(30),
    fac_mail_zip_code varchar(9),
    fac_mental_health_date date,
    fac_mental_health_expire_date date,
    fac_mid_yr_defer_date date,
    fac_mid_yr_visit_appr varchar(3),
    fac_mid_yr_visit_date date,
    fac_name varchar(50),
    fac_nbr_new integer,
    fac_nonamb_1_17_nbr integer,
    fac_nonamb_18_64_nbr integer,
    fac_nonamb_65_plus_nbr integer,
    fac_old_ffa_nbr integer,
    fac_orig_appl_rec_date date,
    fac_phone_nbr varchar(10),
    fac_pin integer,
    fac_placement_date date,
    fac_placement_ready varchar(1),
    fac_plan_of_op_approval_date date,
    fac_plan_of_op_recv_date date,
    fac_post_lic_defer_date date,
    fac_post_lic_visit_appr varchar(3),
    fac_post_lic_visit_date date,
    fac_pre_lic_visit_date date,
    fac_primary_nbr integer,
    fac_region_co integer,
    fac_region_do integer,
    fac_region_nbr integer,
    fac_renewal_defer_date date,
    fac_renewal_visit_appr varchar(3),
    fac_renewal_visit_date date,
    fac_required_visit varchar(1),
    fac_res_city varchar(20),
    fac_res_state varchar(2),
    fac_res_street_addr varchar(30),
    fac_res_zip_code varchar(9),
    fac_rfh_convert_date date,
    fac_sfm_id_nbr varchar(17),
    fac_sod_match_date date,
    fac_status integer,
    fac_street_search varchar(20),
    fac_strtp_app_denied_date date,
    fac_strtp_app_recv_date date,
    fac_type integer,
    fac_type999_caci_indicator varchar(1),
    fac_unlic_orig_input_date date,
    isn_lis_fac_file integer not null,
    system_datetime_1 decimal(14),
    system_datetime_count integer,
    system_secuid_1 varchar(8),
    system_secuid_count integer,
    --
    primary key (fac_nbr)
)^
-- end LIS_FAC_FILE
