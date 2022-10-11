Feature: Check string palindrome

	Scenario Outline: check string palindrome
		Given user input string <say>
		When user test is palindrome
		Then result <output>
		Examples:
			| say		| output	|
			| "okok"	| "false" |
			| "bobob"	| "true" |
			| "bebeb"	| "true" |
			| "baik"	| "false" |