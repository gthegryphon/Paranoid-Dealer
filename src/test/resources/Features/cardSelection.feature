Feature: Card Selection
  Scenario: User Selects a Card to be Played
    Given the user is in an active session
    Given the user is prompted to select a card
    When the user selects a card from their hand
    When the user confirms the card selection
    Then their choice should be locked in and further cards cannot be played

  Scenario: User Reveals Action Order
    Given a card has been selected and the round timer has started
    When the user is challenged on their action order and clicks the Reveal Card button
    Then an alert should appear displaying their card's printed Action Order