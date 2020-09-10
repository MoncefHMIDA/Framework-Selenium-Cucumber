@PatientMedicalForm 
Feature: PatientMedicalForm - JOTFORM
	I want to fill in the patient form
@pmf 
Scenario: PatientMedicalForm - JOTFORM
	Given open applicationform 
	When  set firstname
	And set lastname
	And click login submit 
	