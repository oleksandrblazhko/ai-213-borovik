Feature: Вхід в систему
  As користувач
  In order to мати доступ до функціоналу програмного продукту
  I хочу увійти в систему

  Scenario: Успішний вхід в систему
    Given я відкрив програму
    When я вводжу свої облікові дані
    And натискаю кнопку "Увійти"
    Then система надає мені доступ до програмного продукту
