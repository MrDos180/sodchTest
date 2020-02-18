package ru.actions;

import ru.elements.Buttons;
import ru.elements.pps.AbsentEmployeesPage;
import ru.elements.pps.BriefingPage;
import ru.elements.pps.ChecksPage;

import static com.codeborne.selenide.Condition.*;
import static ru.elements.Buttons.findVisibleButton;
import static ru.elements.Buttons.kuspButton;
import static ru.elements.pps.AbsentEmployeesPage.*;
import static ru.elements.pps.BriefingPage.*;
import static ru.elements.pps.ChecksPage.*;
import static ru.elements.pps.CountForcesPage.*;


public class PpsAction {
    public static void  ppsDutyAction(){
        kuspButton("Постовая ведомость").scrollIntoView(false).shouldBe(visible).click();
        findVisibleButton("Создать").shouldBe(visible).click();

        CountPpsWokersObligatoryNorms().shouldBe(visible).setValue("1");
        CountPpsTsObligatoryNorms().shouldBe(visible).setValue("2");
        CountPpsOthersFactUsing().shouldBe(visible).setValue("3");
        CountPpsWokersFactUsing().shouldBe(readonly);
        CountPpsTsFactUsing().shouldBe(readonly);

        CountDpsWokersObligatoryNorms().shouldBe(visible).setValue("1");
        CountDpsTsObligatoryNorms().shouldBe(visible).setValue("2");
        CountDpsOthersFactUsing().shouldBe(visible).setValue("3");
        CountDpsWokersFactUsing().shouldBe(readonly);
        CountDpsTsFactUsing().shouldBe(readonly);

        CountVopWokersObligatoryNorms().shouldBe(visible).setValue("1");
        CountVopTsObligatoryNorms().shouldBe(visible).setValue("2");
        CountVopOthersFactUsing().shouldBe(visible).setValue("3");
        CountVopWokersFactUsing().shouldBe(readonly);
        CountVopTsFactUsing().shouldBe(readonly);

        CountOthersWokersObligatoryNorms().shouldBe(visible).setValue("1");
        CountOthersTsObligatoryNorms().shouldBe(visible).setValue("2");
        CountOthersOthersFactUsing().shouldBe(visible).setValue("3");
        CountOthersWokersFactUsing().shouldBe(readonly);
        CountOthersTsFactUsing().shouldBe(readonly);

        ArriveActually().shouldBe(visible).setValue("123");
        IncludingTs().shouldBe(visible).setValue("123");
        OtherMeans().shouldBe(visible).setValue("123");
        TotalCitizens().shouldBe(visible).setValue("123");
        IncludingDruzhins().shouldBe(visible).setValue("123");
        MembersSocieties().shouldBe(visible).setValue("123");

        CountForcesSelected ().shouldBe(exist);
        Arrangement ().click();
        ArrangementSelected ().shouldBe(exist);
        CountForcesSelected ().shouldBe(not(exist));
        AbsentEmployees ().click();
        AbsentEmployeesSelected ().shouldBe(exist);
        ArrangementSelected ().shouldBe(not(exist));

        MissingTotal().shouldBe(readonly);
        InVacation().shouldBe(readonly);
        Weekends().shouldBe(readonly);
        Sick().shouldBe(readonly);
        BuisnessTrip().shouldBe(readonly);
        OtherReasons().shouldBe(readonly);
        AddButton().click();
        Name().setValue("Иван");
        Surame().setValue("Иванов");
        MiddleName().setValue("Иванович");
        Position().setValue("Адм практика");
        Title().setValue("Генерал-майор юстиции");
        ReasonAbsence().setValue("В отпуске").pressEnter();
        AbsentEmployeesPage.SaveButton().click();

        Briefing ().click();
        BriefingSelected ().shouldBe(exist);
        AbsentEmployeesSelected ().shouldBe(not(exist));

        Topic().setValue("тест");
        General().setValue("тест");
        Special().setValue("тест");
        AddButton().click();
        Name().setValue("Иван");
        Surame().setValue("Иванов");
        MiddleName().setValue("Иванович");
        Position().setValue("Адм практика");
        Title().setValue("Генерал-майор юстиции");
        DataTime().setValue(CreatingDate.date(0));
        BriefingPage.SaveButton().click();

        Checks ().click();
        ChecksSelected ().shouldBe(exist);
        BriefingSelected ().shouldBe(not(exist));

        AddButton().click();
        Name().setValue("Иван");
        Surame().setValue("Иванов");
        MiddleName().setValue("Иванович");
        Position().setValue("Адм практика");
        Title().setValue("Генерал-майор юстиции");
        ChecksInput().setValue("СОГ - 1 Смена № 1");
        ChecksAddButton().click();
        Disadvantages().setValue("тест");
        TakeAction().setValue("тест");
        Results().setValue("тест");

        ChecksPage.SaveButton().click();

        SaveGreenButton().click();

        String statementError ="Постовая ведомость за указанную дату уже сформирована";

        if (PpsSaveMessage().shouldBe(visible).getText().equals(statementError)) {
            CloseButton().click();
            Buttons.findVisibleButton("Да").click();
        } else  {
        CloseButton().click();
        }

    }
}
