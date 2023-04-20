Feature: Third scenario test

Scenario: Buy first item in third scenario

Given Go to your Landing Page
When Enter the username problem_user
And Enter your password secret_sauce
And click on the Login button
And Add the first item to the cart
And Click on cart icon at top right corner
And Click on the Checkout button
And Enter the first name in First Name textbox
And Enter the last name in the last Name textbox
And Enter Postal Code in the Postal Code textbox
And Click on the Continue button
And Verify the Error: Last Name is required
Then Close browser

