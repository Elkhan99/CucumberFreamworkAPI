#Author: Elkhan Abbasov
#Creation: 29 july 2023
#Revetion date: 29 july 2023


Feature: Validate everythings about the Pet APIs

Scenario: Verify user is able to create a new Pet using AddnewPet API
Given API is provided 
When user add a new Pet information using AddnewPet API
Then the response code of AddnewPet API is 200
And response body of AddnewPet API is matching with swagger

Scenario: Verify user is Pet information using FindByPETID API
Given API is provided 
When user search the Pet information using FindByPETID API
Then the response code of FindByPETID API is 200
And response body of FindByPETID API is matching with swagger

Scenario: Verify user is change Pet information using UpdatedPETID API
Given API is provided 
When user change the Pet information using UpdatedPETID API
Then the response code of UpdatedPETID API is 200
And response body of UpdatedPETID API is matching with swagger

Scenario: Verify user is delete Pet information using DeletePETID API
Given API is provided 
When user delete the Pet information using DeletePETID API
Then the response code of DeletePETID API is 200
And response body of DeletePETID API is matching with swagger