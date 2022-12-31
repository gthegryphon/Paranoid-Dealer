Feature: Joining a Session
  Scenario Outline: User Joins Session
    Given the user has clicked the link
    When the user types "<character name>" into the Display Name input
    When the user clicks Join Session
    Then the user should be dealt a hand of cards

    Examples:
    | character name |
    | Monty-I-HYT-1 |
    | Pmirhs-R-HYT-2 |

  Scenario: User Joins as GM
    Given the user has clicked the link
    When the user clicks the GM Game button
    Then they should be able to see the character names of joined users

  Scenario: Player tries to join as GM
    ##super duper stretch
    Given a GM is logged in
    Given the user has clicked the link
    When the user clicks the GM Game button
    Then the user should receive an alert stating that they are not the GM and prompting them for their player name
    When the user types "testChar" into the alert player name input
    When the user clicks Accept
    Then the user should be dealt a hand of cards and receive a treason star.
