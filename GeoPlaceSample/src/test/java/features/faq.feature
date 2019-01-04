Feature: FAQs category selection

 As a new user
 I want to visit FAQs page and select a category from dropdown
 So that I can view the FAQ based on the category selected
  
Scenario Outline: Select <faq_category> from dropdown and corresponding category checkbox should be selected.
Given Initialize the browser with "chrome" 
And Navigate to "https://www.geoplace.co.uk/" site
When Navigate to FAQs link under Support tab
And Select faq category "<faq_category>" from dropdown
Then Corresponding "<faq_category>" checkbox should be checked on left hand side.

Examples:
|faq_category|
|Addresses   |
|Streets     |
|Show all    |


