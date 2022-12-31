Feature: Treason Stars
  Scenario: GM adds a Treason Star
    ##stretch
    Given the user has joined as GM
    When the user clicks the Add Treason Star button next to a player's name
    Then that player's Treason Stars should increment