Feature: Перегляд інформації про якість повітря
  As користувач
  In order to стежити за якістю повітря у моєму регіоні
  I хочу мати можливість переглядати інформацію про якість повітря

  Scenario: Перегляд інформації про якість повітря
    Given я відкрив програму
    When я обираю опцію "Перегляд інформації про якість повітря"
    Then система надає мені доступ до актуальних даних про якість повітря у моєму регіоні
