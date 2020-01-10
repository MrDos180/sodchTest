package ru.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.actions.rolesAction.CreateUser;
import ru.actions.rolesAction.DeleteUser;
import ru.testRoles.*;



@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
        ALERT_DUTY.class,
        CAR_THEFT.class,
        ALERT_DUTY.class,
        ANALYST.class,
        ANALYST_DYNAMIC_REPORT_CREATOR.class,
        APP_ADMIN.class,
        CAR_THEFT.class,
        CATALOG_RO.class,
        CATALOGUE_ADMIN.class,
        CCP_DOZNAVATEL_PROSMOTR.class,
        CCP_DOZNAVATEL_SLEDOVATEL.class,
        CITY_DUTY.class,
        DDS_INFO_ADMIN.class,
        DISPATCHER_USIS.class,
        EMPLOYEE_RRD.class,
        EMPLOYEE_RRD_REPORT.class,
        FORCE_MANAGEMENT_RO.class,
        GIBDD_ADMIN.class,
        GIBDD_DUTY.class,
        GIBDD_USER.class,
        HEAD_TER_AUTHORITY.class,
        HELPLINE_OPERATOR.class,
        INITIATOR_WANTED.class,
        KUD_ANALYST.class,
        KUSP_RECEPTIONIST.class,
        MOBILE_SQUAD.class,
        OMVD_DUTY.class,
        OMVD_DUTY_REPORT.class,

        OPER_DUTY_02_CHIEF.class,
        OPER_DUTY_RO.class,
        OPER_PLAN_ADMIN.class,
        OPER_PLAN_INITIATOR.class,
        PERSONS_INSPECTOR.class,
        PPS_DUTY.class,
        RADIO_DUTY_STATION.class,
        RADIOMAN.class,
        ROSGVARD_ADMIN.class,
        SORTING_INSPECTOR.class,

        SUMMARY_READER.class,
        SUMMARY_READER_CHILD.class,
        SUMMARY_RESPONSIBLE.class,
        SUMMARY_RO.class,

        OPER_DUTY_02.class,
        SUMMARY_DUTY.class,

})

public class TestSuite {
}
