package ru.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.actions.rolesAction.CreateUser;
import ru.actions.rolesAction.DeleteUser;
import ru.testRoles.*;



@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                Alert_Duty.class,
                Analyst.class,
                Analyst_Dynamic_Report_Creator.class,
                App_Admin.class,
                Car_Theft.class,
                Catalog_Ro.class,
                Catalogue_Admin.class,
                Ccp_Doznavatel_Prosmotr.class,
                Ccp_Doznavatel_Sledovatel.class,
                City_Duty.class,
                Dds_Info_Admin.class,
                Dispatcher_Usis.class,
                Employee_Rrd.class,
                Employee_Rrd_Report.class,
                Force_Management_Ro.class,
                Gibdd_Admin.class,
                Gibdd_Duty.class,
                Gibdd_User.class,
                Head_Ter_Authority.class,
                Helpline_Operator.class,
                Initiator_Wanted.class,
                Kud_Analyst.class,
                Kusp_Receptionist.class,
                Mobile_Squad.class,
                Omvd_Duty.class,
                Omvd_Duty_Report.class,

                Oper_Duty_02_Chief.class,
                Oper_Duty_Ro.class,
                Oper_Plan_Admin.class,
                Oper_Plan_Initiator.class,
                Persons_Inspector.class,
                Pps_Duty.class,
                Radio_Duty_Station.class,
                Radioman.class,
                Rosgvard_Admin.class,

                Sorting_Inspector.class,

                Summary_Reader.class,
                Summary_Reader_Child.class,
                Summary_Responsible.class,
                Summary_Ro.class,

                Rrc_Administrator.class,
                Rrc_Duty_Officer.class,


                Rrc_Operator.class,
                Rrc_Read_Only.class,

                Oper_Duty_02.class,
                Summary_Duty.class,



})

public class TestSuite {
}
