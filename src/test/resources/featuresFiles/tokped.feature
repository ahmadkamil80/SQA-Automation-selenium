Feature: Tokopedia
	
	Scenario: Login Tokped
		Given user homepage "https://www.tokopedia.com/"
		When user input kategori "xiaomi"
		And user klik button search
		And user klik product
		Then user klik Wishlist
