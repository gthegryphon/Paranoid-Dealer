Feature: GM Resets Cards
  Scenario: GM gets bored
    When the GM gets bored
    When the GM hits the Force Action Card Reset button
    Then all hands should be discarded and replaced with randomized action cards


  Scenario: Player gets frisky
    When a player attempts to hit the Force Action Card Reset button
    Then that player receives a Treason Star and no cards are redrawn
