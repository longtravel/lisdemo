alter table lis_fa_file rename column fa_action_code to fa_action_code__u81911 ;
alter table lis_fa_file rename column fa_personnel_type to fa_personnel_type__u65548 ;
update lis_fa_file set FA_PER_ID = '' where FA_PER_ID is null ;
alter table lis_fa_file alter column FA_PER_ID set not null ;
alter table lis_fa_file add column FA_PERSONNEL_TYPE varchar(1) ;
alter table lis_fa_file add column FA_ACTION_CODE varchar(1) ;
