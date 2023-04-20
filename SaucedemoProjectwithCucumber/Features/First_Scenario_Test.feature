Feature: First scenario test

Scenario: Buy two items at the first scenario

Given Go to Landing Page
When Enter the username standard_user
And Enter the password secret_sauce
And click on Login button
And Add the first two items to the cart
And Click on the cart icon at top right corner
And Click on Checkout button
And Enter your first name in First Name textbox
And Enter your last name in ast Name textbox
And Enter Postal Code in Postal Code textbox
And Click on Continue button
And Click on Finish button on the next page
And Verify the success message our order has been dispatched and will arrive just as fast as the pony can get there!
Then Close the browser
