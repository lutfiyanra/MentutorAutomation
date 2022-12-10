@Mentor @Riza
  Feature: Login UI Testing

    Scenario: Verify Image on Login Page
      Given User open the web page
      When User wait until all element successfully loaded
      Then Image on Login Page can be seen

    Scenario: Verify Login Page Text Title on Login Page
      Given User open the web page
      When User wait until all element successfully loaded
      Then Login to your account text title can be seen

    Scenario: Verify Email title and Email field on Login Page
      Given User open the web page
      When User wait until all element successfully loaded
      Then Email title and Email field can be seen

    Scenario: Verify Password title and Password field on Login Page
      Given User open the web page
      When User wait until all element successfully loaded
      Then Password title and Password field can be seen

    Scenario: Verify Login Button on Login Page
      Given User open the web page
      When User wait until all element successfully loaded
      Then Login Button on Login Page can be seen

      @login1
    Scenario: Verify Text under login button on Login Page
      Given User open the web page
      When User wait until all element successfully loaded
      Then Text under Login Button can be seen
