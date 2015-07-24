/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     24/7/2015 10:35:50 AM                        */
/*==============================================================*/


drop table if exists EMPLOYEE;

drop table if exists PROJECT;

drop table if exists PROJECTINFO;

drop table if exists TAGCLOUD;

drop table if exists TAGCLOUDEMP;

drop table if exists TAGCLOUDS;

/*==============================================================*/
/* Table: EMPLOYEE                                              */
/*==============================================================*/
create table EMPLOYEE
(
   IDEMPLOYEE           int not null,
   NAME_EMPLOYEE        varchar(50) not null,
   GENDER               varchar(30),
   DATE_OF_BIRTH        date,
   ADDRESS              varchar(50),
   PHONE_NUMBER         numeric(15,0),
   EMAIL                varchar(50),
   EMERGENCY_PHONE_NUMBER numeric(15,0),
   START_DATE           date,
   END_DATE             date,
   START_DATE_FROM_BOOKLET date,
   USERNAME             varchar(30),
   ID_CARD_NUMBER       numeric(30,0),
   PASSPORT_NUMBER      numeric(30,0),
   YEARS_OF_WORKING_EXP_IN_EXECOM int,
   YEARS_OF_WORKING_EXP int,
   PLACE_OF_BIRTH       varchar(50),
   TRAINING_LEARNING_PRIORITY varchar(200),
   LICENCES_CERTIFICATES varchar(200),
   AWARDS               varchar(200),
   CONTRACT_TYPE        varchar(30),
   COMMUNICATION        smallint,
   FAST_LEARNING        smallint,
   OPEN_TO_CHANGE       smallint,
   TEAM_PLAYER          smallint,
   PROACTIVE_COMMUNICATION smallint,
   INTERPERSONAL_SKILLS smallint,
   KNOWLEDGE_SHARING    smallint,
   JUDGEMENT            smallint,
   DECISION_MAKING      smallint,
   INFLUENCING          smallint,
   LEADERSHIP           smallint,
   COACHING             smallint,
   ORGANIZATIONAL_SKILLS smallint,
   primary key (IDEMPLOYEE)
);

/*==============================================================*/
/* Table: PROJECT                                               */
/*==============================================================*/
create table PROJECT
(
   IDPROJECT            int not null,
   NAME_PROJECT         varchar(50),
   DURATION_OF_PROJECT  int,
   primary key (IDPROJECT)
);

/*==============================================================*/
/* Table: PROJECTINFO                                           */
/*==============================================================*/
create table PROJECTINFO
(
   IDPROJECT            int not null,
   IDEMPLOYEE           int not null,
   JOB_RESPONSIBILITIES varchar(50),
   PROJECT_EXP          varchar(50),
   primary key (IDPROJECT, IDEMPLOYEE)
);

/*==============================================================*/
/* Table: TAGCLOUD                                              */
/*==============================================================*/
create table TAGCLOUD
(
   IDTAGCLOUD           int not null,
   NAME_TAGCLOUD        varchar(30),
   TIP_TAGCLOUD         varchar(30),
   primary key (IDTAGCLOUD)
);

/*==============================================================*/
/* Table: TAGCLOUDEMP                                           */
/*==============================================================*/
create table TAGCLOUDEMP
(
   IDTAGCLOUD           int not null,
   IDEMPLOYEE           int not null,
   primary key (IDTAGCLOUD, IDEMPLOYEE)
);

/*==============================================================*/
/* Table: TAGCLOUDS                                             */
/*==============================================================*/
create table TAGCLOUDS
(
   IDTAGCLOUD           int not null,
   IDPROJECT            int not null,
   primary key (IDTAGCLOUD, IDPROJECT)
);

alter table PROJECTINFO add constraint FK_PROJECTINFO1 foreign key (IDPROJECT)
      references PROJECT (IDPROJECT) on delete restrict on update restrict;

alter table PROJECTINFO add constraint FK_PROJECTINFO2 foreign key (IDEMPLOYEE)
      references EMPLOYEE (IDEMPLOYEE) on delete restrict on update restrict;

alter table TAGCLOUDEMP add constraint FK_TAGCLOUDEMP foreign key (IDTAGCLOUD)
      references TAGCLOUD (IDTAGCLOUD) on delete restrict on update restrict;

alter table TAGCLOUDEMP add constraint FK_TAGCLOUDEMP2 foreign key (IDEMPLOYEE)
      references EMPLOYEE (IDEMPLOYEE) on delete restrict on update restrict;

alter table TAGCLOUDS add constraint FK_TAGCLOUDS foreign key (IDTAGCLOUD)
      references TAGCLOUD (IDTAGCLOUD) on delete restrict on update restrict;

alter table TAGCLOUDS add constraint FK_TAGCLOUDS2 foreign key (IDPROJECT)
      references PROJECT (IDPROJECT) on delete restrict on update restrict;

