alter table lis_fac_file rename column fac_type999_caci_indicator to fac_type999_caci_indicator__u54395 ;
alter table lis_fac_file rename column fac_loc_indicator to fac_loc_indicator__u13345 ;
alter table lis_fac_file rename column fac_required_visit to fac_required_visit__u84429 ;
alter table lis_fac_file rename column fac_placement_ready to fac_placement_ready__u18103 ;
alter table lis_fac_file rename column fac_deficiency to fac_deficiency__u14559 ;
alter table lis_fac_file rename column fac_complaint to fac_complaint__u55138 ;
alter table lis_fac_file rename column fac_gh_indicator to fac_gh_indicator__u88863 ;
alter table lis_fac_file rename column fac_dual_id to fac_dual_id__u88794 ;
alter table lis_fac_file rename column fac_agg_status to fac_agg_status__u01004 ;
alter table lis_fac_file rename column fac_legal_action_indicator to fac_legal_action_indicator__u93827 ;
alter table lis_fac_file rename column fac_action_code to fac_action_code__u58168 ;
alter table lis_fac_file rename column fac_licensee_type to fac_licensee_type__u95480 ;
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
