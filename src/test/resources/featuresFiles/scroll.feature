Feature: Check stok produk Tokopedia

	Scenario: check produk at Tokopedia
		Given user at homepage "https://www.tokopedia.com/"
		When user input "Sweater"
		And user klik search
		And user scrolls on the page
		Then result total product