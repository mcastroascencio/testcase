Feature: Search by keyword

  Scenario: Searching term
    Given User is on the Choucartesting home page
    When he searches jobs for "Analista"
    Then all the result titles should contain the word "Analista"