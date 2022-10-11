$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featuresFiles/tokped.feature");
formatter.feature({
  "name": "Tokopedia",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Tokped",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user homepage \"https://www.tokopedia.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "defs.TokpedDefs.user_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input kategori \"xiaomi\"",
  "keyword": "When "
});
formatter.match({
  "location": "defs.TokpedDefs.user_input_kategori(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user klik button search",
  "keyword": "And "
});
formatter.match({
  "location": "defs.TokpedDefs.user_klik_button_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user klik product",
  "keyword": "And "
});
formatter.match({
  "location": "defs.TokpedDefs.user_klik_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user klik Wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "defs.TokpedDefs.user_klik_Wishlist()"
});
formatter.result({
  "status": "passed"
});
});