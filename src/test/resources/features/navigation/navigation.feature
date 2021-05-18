Feature: Navigation

  Site visitors should be able to see and access the contents of the site thru the navigation menu
  Vicky is a site visitor

  @current
  Scenario: Main menu navigation
    When she is on the LTA home page
    Then she should be able to navigate to the foll section through the top level menu
      | Who We Are             |
      | Upcoming Projects      |
      | Getting Around         |
      | Industry & Innovations |