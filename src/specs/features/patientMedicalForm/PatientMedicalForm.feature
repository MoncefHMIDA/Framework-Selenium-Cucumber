@PatientMedicalForm 
Feature: PatientMedicalForm - JOTFORM
	ETQ user je souhaite remplir la formulaire  
@auth 
Scenario: PatientMedicalForm - JOTFORM
	Given open applicationform 
	When  set firstname
	And set lastname
	And click login submit 
	