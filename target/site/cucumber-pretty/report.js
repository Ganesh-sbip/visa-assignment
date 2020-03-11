$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon website Login Test",
  "description": "",
  "id": "amazon-website-login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8694341900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Amazon SG -  Login using invalid username",
  "description": "",
  "id": "amazon-website-login-test;amazon-sg----login-using-invalid-username",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@negative_scenario"
    },
    {
      "line": 3,
      "name": "@Login_invalid_username"
    },
    {
      "line": 3,
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I\u0027m on amazon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"invalid\" username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I continue to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify if invalid \"username\" error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.i_m_on_Amazon_login_page()"
});
formatter.result({
  "duration": 314198600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_username(String)"
});
formatter.result({
  "duration": 352591100,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_continue_to_next_page()"
});
formatter.result({
  "duration": 1417969000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 21
    }
  ],
  "location": "LoginGlue.i_verify_invalid_error(String)"
});
formatter.result({
  "duration": 123223900,
  "status": "passed"
});
formatter.after({
  "duration": 1338865700,
  "status": "passed"
});
formatter.before({
  "duration": 7182014400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Amazon SG - Login using invalid password",
  "description": "",
  "id": "amazon-website-login-test;amazon-sg---login-using-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@negative_scenario"
    },
    {
      "line": 10,
      "name": "@Login_invalid_password"
    },
    {
      "line": 10,
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I\u0027m on amazon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter \"valid\" username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I continue to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"invalid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I submit the user credentials",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify if invalid \"password\" error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.i_m_on_Amazon_login_page()"
});
formatter.result({
  "duration": 79987400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_username(String)"
});
formatter.result({
  "duration": 434205900,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_continue_to_next_page()"
});
formatter.result({
  "duration": 1683242400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_password(String)"
});
formatter.result({
  "duration": 275419600,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_submit_user_credentials()"
});
formatter.result({
  "duration": 1613973300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    }
  ],
  "location": "LoginGlue.i_verify_invalid_error(String)"
});
formatter.result({
  "duration": 123816400,
  "status": "passed"
});
formatter.after({
  "duration": 1358562400,
  "status": "passed"
});
formatter.before({
  "duration": 7073750000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Amazon SG - Login using valid credentials",
  "description": "",
  "id": "amazon-website-login-test;amazon-sg---login-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@positive_scenario"
    },
    {
      "line": 19,
      "name": "@Login_valid_credentials"
    },
    {
      "line": 19,
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I\u0027m on amazon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I enter \"valid\" username",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I continue to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter \"valid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I submit the user credentials",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify I am landed on Home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.i_m_on_Amazon_login_page()"
});
formatter.result({
  "duration": 79909300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_username(String)"
});
formatter.result({
  "duration": 414716600,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_continue_to_next_page()"
});
formatter.result({
  "duration": 1323977300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_password(String)"
});
formatter.result({
  "duration": 291264300,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_submit_user_credentials()"
});
formatter.result({
  "duration": 2738811300,
  "status": "passed"
});
formatter.match({
  "location": "HomeGlue.verify_home_screen()"
});
formatter.result({
  "duration": 1849957300,
  "status": "passed"
});
formatter.after({
  "duration": 1470430700,
  "status": "passed"
});
formatter.uri("UpdateProductToBagTest.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon website Add Product to bag Test",
  "description": "",
  "id": "amazon-website-add-product-to-bag-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6818684900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Amazon SG - Add a product to bag",
  "description": "",
  "id": "amazon-website-add-product-to-bag-test;amazon-sg---add-a-product-to-bag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@add_product_to_bag"
    },
    {
      "line": 3,
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I\u0027m on amazon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"valid\" username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I continue to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"valid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I submit the user credentials",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify I am landed on Home screen",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I search for a product",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify product search results is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I add product with index \"1\" from search list to bag",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I verify I am landed on product page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select \"1\" product quantity",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I capture the product details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I add the product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify the product details in cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I logout from the amazon website",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I verify I am landed on signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I enter \"valid\" username",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I continue to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter \"valid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I submit the user credentials",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify I am landed on Home screen",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I navigate to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the product details in cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.i_m_on_Amazon_login_page()"
});
formatter.result({
  "duration": 146468100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_username(String)"
});
formatter.result({
  "duration": 447778100,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_continue_to_next_page()"
});
formatter.result({
  "duration": 1410141400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_password(String)"
});
formatter.result({
  "duration": 287653800,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_submit_user_credentials()"
});
formatter.result({
  "duration": 2868828900,
  "status": "passed"
});
formatter.match({
  "location": "HomeGlue.verify_home_screen()"
});
formatter.result({
  "duration": 1281726600,
  "status": "passed"
});
formatter.match({
  "location": "HomeGlue.search_product()"
});
formatter.result({
  "duration": 4568369500,
  "status": "passed"
});
formatter.match({
  "location": "HomeGlue.verify_product_search_results()"
});
formatter.result({
  "duration": 88197200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "HomeGlue.add_product_based_on_index(int)"
});
formatter.result({
  "duration": 5777580400,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageGlue.verify_product_page()"
});
formatter.result({
  "duration": 619143200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 10
    }
  ],
  "location": "ProductPageGlue.select_product_qty(String)"
});
formatter.result({
  "duration": 1151672200,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageGlue.capture_product_details()"
});
formatter.result({
  "duration": 272661700,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageGlue.add_product_to_cart()"
});
formatter.result({
  "duration": 546891100,
  "status": "passed"
});
formatter.match({
  "location": "ProductCartGlue.verify_product_cart_page()"
});
formatter.result({
  "duration": 9361884800,
  "status": "passed"
});
formatter.match({
  "location": "HeaderGlue.click_logout()"
});
formatter.result({
  "duration": 23690626600,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_verify_loginpage()"
});
formatter.result({
  "duration": 61390200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_username(String)"
});
formatter.result({
  "duration": 464546400,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_continue_to_next_page()"
});
formatter.result({
  "duration": 1197501400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 9
    }
  ],
  "location": "LoginGlue.i_enter_password(String)"
});
formatter.result({
  "duration": 327455800,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.i_submit_user_credentials()"
});
formatter.result({
  "duration": 2161610600,
  "status": "passed"
});
formatter.match({
  "location": "HomeGlue.verify_home_screen()"
});
formatter.result({
  "duration": 491151300,
  "status": "passed"
});
formatter.match({
  "location": "HeaderGlue.navigate_to_cart()"
});
formatter.result({
  "duration": 3602843400,
  "status": "passed"
});
formatter.match({
  "location": "ProductCartGlue.verify_product_cart_page()"
});
formatter.result({
  "duration": 10536662900,
  "status": "passed"
});
formatter.after({
  "duration": 1638984600,
  "status": "passed"
});
});