Feature: User clicks on Art category and uses filter optins

  @testing
  Scenario: User navigates to Art Category
    Given User is on the homepage
    When User clicks on Art Category
    Then Art category products to be loaded

  @testing
  Scenario: User filters by Composition
    Given User is on the homepage
    And User clicks on Art Category
    When User selects filter by Composition
    Then Composition filter should be applied

  @testing
  Scenario: User filters by Brand
    Given User is on the homepage
    And User clicks on Art Category
    When User selects filter by Brand
    Then Brand filter should be applied

  @testing
  Scenario Outline: User filters by Dimension options
    Given User is on homepage
    When User clicks on Art Category
    Then select <dimension> and verify <filter>
    Examples:
      |dimension|filter|
      |//ul[@id='facet_64559']/li/label/span/span|//section[@id='js-active-search-filters']/ul/li|
      |//ul[@id='facet_9975']/li[2]/label/span/span|//section[@id='js-active-search-filters']/ul/li|
      |//ul[@id='facet_58771']/li[3]/label/span/span|//section[@id='js-active-search-filters']/ul/li|
