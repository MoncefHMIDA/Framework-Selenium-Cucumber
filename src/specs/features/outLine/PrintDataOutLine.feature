@PrintData 
Feature: Print data Text Box 
	As a user I want to print my data
	
@PrintData
Scenario Outline: Print data - Text Box 
	Given open application Text Box 
	When I want to print FullName "<FullName>" 
	When I want to print Email "<Email>" 
	
	Examples: 
	
	| FullName|     Email      |
	|Moncef   |moncef@gmail.com|
	|Zied     |zied@gmail.com  | 
 
