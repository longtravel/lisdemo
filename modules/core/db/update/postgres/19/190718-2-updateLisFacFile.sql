alter table lis_fac_file rename column fac_type999_caci_indicator to fac_type999_caci_indicator__u04944 ;
alter table lis_fac_file rename column fac_loc_indicator to fac_loc_indicator__u86552 ;
alter table lis_fac_file rename column fac_required_visit to fac_required_visit__u39615 ;
alter table lis_fac_file rename column fac_placement_ready to fac_placement_ready__u25929 ;
alter table lis_fac_file rename column fac_deficiency to fac_deficiency__u40115 ;
alter table lis_fac_file rename column fac_complaint to fac_complaint__u00275 ;
alter table lis_fac_file rename column fac_gh_indicator to fac_gh_indicator__u89640 ;
alter table lis_fac_file rename column fac_dual_id to fac_dual_id__u04155 ;
alter table lis_fac_file rename column fac_agg_status to fac_agg_status__u74800 ;
alter table lis_fac_file rename column fac_legal_action_indicator to fac_legal_action_indicator__u52344 ;
alter table lis_fac_file rename column fac_action_code to fac_action_code__u67723 ;
alter table lis_fac_file rename column fac_licensee_type to fac_licensee_type__u69025 ;
alter table lis_fac_file add column FAC_LICENSEE_TYPE varchar(1) ;
alter table lis_fac_file add column FAC_ACTION_CODE varchar(1) ;
alter table lis_fac_file add column FAC_LEGAL_ACTION_INDICATOR varchar(1) ;
alter table lis_fac_file add column FAC_AGG_STATUS varchar(1) ;
alter table lis_fac_file add column FAC_DUAL_ID varchar(1) ;
alter table lis_fac_file add column FAC_GH_INDICATOR varchar(1) ;
alter table lis_fac_file add column FAC_COMPLAINT varchar(1) ;
alter table lis_fac_file add column FAC_DEFICIENCY varchar(1) ;
alter table lis_fac_file add column FAC_PLACEMENT_READY varchar(1) ;
alter table lis_fac_file add column FAC_REQUIRED_VISIT varchar(1) ;
alter table lis_fac_file add column FAC_LOC_INDICATOR varchar(1) ;
alter table lis_fac_file add column FAC_TYPE999_CACI_INDICATOR varchar(1) ;
