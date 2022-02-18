
@tag
Feature: test Api
  I want to use this template for my feature file

  @tag1
  Scenario: get
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: post
    Given create payload
    And include "bookid" is "1"
    And include "author" is "daisy"
    When post payload to "https://url"
    Then Verify the status code

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
