Feature: Second scenario test

Scenario: Verify the err message in second scenario
Given Go to the Landing Page
When Enter the username locked_out_user
And Enter password the secret_sauce
And click on to login button
And Verify the err message Epic sadface: Sorry this user has been locked out
Then Close your browser