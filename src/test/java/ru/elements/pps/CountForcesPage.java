package ru.elements.pps;
import ru.elements.Buttons;
import ru.elements.Inputs;

import com.codeborne.selenide.SelenideElement;

import ru.yandex.qatools.allure.annotations.Step;

public class CountForcesPage {

    @Step("Расчет сил и средств стороевых ППСП.Количество сторудников. Обязательные нормы")
    public static SelenideElement CountPpsWokersObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств строевых ППСП","Количество сотрудников","Обязательные нормы:");}

    @Step("Расчет сил и средств стороевых ППСП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountPpsTsObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств строевых ППСП","Количество ТС","Обязательные нормы:");}

    @Step("Расчет сил и средств стороевых ППСП. Иные. Фактически используются")
    public static SelenideElement CountPpsOthersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств строевых ППСП","Иные","Фактически используются:");}

    @Step("Расчет сил и средств стороевых ППСП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountPpsWokersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств строевых ППСП","Количество сотрудников","Фактически используются:");}

    @Step("Расчет сил и средств стороевых ППСП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountPpsTsFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств строевых ППСП","Количество ТС","Фактически используются:");}



    @Step("Расчет сил и средств строевых ДПС ГИБДД.Количество сторудников. Обязательные нормы")
    public static SelenideElement CountDpsWokersObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств строевых ДПС ГИБДД","Количество сотрудников","Обязательные нормы:");}

    @Step("Расчет сил и средств строевых ДПС ГИБДД.Количество ТС. Обязательные нормы")
    public static SelenideElement CountDpsTsObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств строевых ДПС ГИБДД","Количество ТС","Обязательные нормы:");}

    @Step("Расчет сил и средств строевых ДПС ГИБДД. Иные. Фактически используются")
    public static SelenideElement CountDpsOthersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств строевых ДПС ГИБДД","Иные","Фактически используются:");}

    @Step("Расчет сил и средств строевых ДПС ГИБДД.Количество ТС. Обязательные нормы")
    public static SelenideElement CountDpsWokersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств строевых ДПС ГИБДД","Количество сотрудников","Фактически используются:");}

    @Step("Расчет сил и средств строевых ДПС ГИБДД.Количество ТС. Обязательные нормы")
    public static SelenideElement CountDpsTsFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств строевых ДПС ГИБДД","Количество ТС","Фактически используются:");}



    @Step("Расчет сил и средств ВОП.Количество сторудников. Обязательные нормы")
    public static SelenideElement CountVopWokersObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств ВОП","Количество сотрудников","Обязательные нормы:");}

    @Step("Расчет сил и средств ВОП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountVopTsObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств ВОП","Количество ТС","Обязательные нормы:");}

    @Step("Расчет сил и средств ВОП. Иные. Фактически используются")
    public static SelenideElement CountVopOthersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств ВОП","Иные","Фактически используются:");}

    @Step("Расчет сил и средств ВОП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountVopWokersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств ВОП","Количество сотрудников","Фактически используются:");}

    @Step("Расчет сил и средств ВОП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountVopTsFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств ВОП","Количество ТС","Фактически используются:");}




    @Step("Расчет сил и средств иных строевых.Количество сторудников. Обязательные нормы")
    public static SelenideElement CountOthersWokersObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств иных строевых","Количество сотрудников","Обязательные нормы:");}

    @Step("Расчет сил и средств иных строевых.Количество ТС. Обязательные нормы")
    public static SelenideElement CountOthersTsObligatoryNorms()
    {return Inputs.findInputPps("Расчет сил и средств иных строевых","Количество ТС","Обязательные нормы:");}

    @Step("Расчет сил и средств иных строевых. Иные. Фактически используются")
    public static SelenideElement CountOthersOthersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств иных строевых","Иные","Фактически используются:");}

    @Step("Расчет сил и средств иных строевых.Количество ТС. Обязательные нормы")
    public static SelenideElement CountOthersWokersFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств иных строевых","Количество сотрудников","Фактически используются:");}

    @Step("Расчет сил и средств ВОП.Количество ТС. Обязательные нормы")
    public static SelenideElement CountOthersTsFactUsing()
    {return Inputs.findInputPps("Расчет сил и средств иных строевых","Количество ТС","Фактически используются:");}


    @Step("Прибыло фактически")
    public static SelenideElement ArriveActually()
    {return Inputs.findInput("Прибыло фактически:");}

    @Step("В т.ч. транспортные средства")
    public static SelenideElement IncludingTs()
    {return Inputs.findInput("В т.ч. транспортные средства:");}

    @Step("В т.ч. транспортные средства")
    public static SelenideElement OtherMeans()
    {return Inputs.findInput("Иные средства:");}

    @Step("Всего граждан:")
    public static SelenideElement TotalCitizens()
    {return Inputs.findInput("Всего граждан:");}

    @Step("В т.ч. народной дружины")
    public static SelenideElement IncludingDruzhins()
    {return Inputs.findInput("В т.ч. народной дружины:");}

    @Step("Участников обществ")
    public static SelenideElement MembersSocieties()
    {return Inputs.findInput("Участников обществ:");}




    @Step("Вкладка Расчет сил и средств")
    public static SelenideElement CountForces ()
    {return Buttons.findA("Расчет сил и средств");}

    @Step("Вкладка Расчет сил и средств.Выделена")
    public static SelenideElement CountForcesSelected ()
    {return Buttons.findAPps("Расчет сил и средств");}

    @Step("Вкладка Расстановка нарядов по сменам")
    public static SelenideElement Arrangement ()
    {return Buttons.findA("Расстановка нарядов по сменам");}

    @Step("Вкладка Расстановка нарядов по сменам.Выделена")
    public static SelenideElement ArrangementSelected ()
    {return Buttons.findAPps("Расстановка нарядов по сменам");}

    @Step("Вкладка Отсутствующие сотрудники")
    public static SelenideElement AbsentEmployees ()
    {return Buttons.findA("Отсутствующие сотрудники");}

    @Step("Вкладка Отсутствующие сотрудники.Выделена")
    public static SelenideElement AbsentEmployeesSelected ()
    {return Buttons.findAPps("Отсутствующие сотрудники");}

    @Step("Вкладка Инструктаж")
    public static SelenideElement Briefing ()
    {return Buttons.findA("Инструктаж");}

    @Step("Вкладка Инструктаж.Выделена")
    public static SelenideElement BriefingSelected ()
    {return Buttons.findAPps("Инструктаж");}

    @Step("Вкладка Проверки")
    public static SelenideElement Checks ()
    {return Buttons.findA("Проверки");}

    @Step("Вкладка Проверки.Выделена")
    public static SelenideElement ChecksSelected ()
    {return Buttons.findAPps("Проверки");}







    @Step("Недостатки")
    public static SelenideElement Disadvantages()
    {return Inputs.findTextarea("Недостатки:");}

    @Step("Принятые меры")
    public static SelenideElement TakeAction()
    {return Inputs.findTextarea("Принятые меры:");}

    @Step("Результаты:")
    public static SelenideElement Results()
    {return Inputs.findTextarea("Результаты:");}


}
