create table if not exists backlog_releases(
backlog_release_indicator Integer not null,
target_project_name varchar(255) null,
target_project_type varchar(255) null,
target_project_owner varchar(255) null,
tech_contact varchar(255) null,
target_project_po varchar(255) null,
deployment_indicator bigint null,
target_project_ba varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint backlog_releases_pk primary key(backlog_release_indicator));