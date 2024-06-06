Feature: API Test

  Scenario: Verify API functionality
    Given I have the base URL "http://localhost:5000"
    When I make a GET request to "/books"
    Then the response code should be 200
    And the response body should contain "Book 1"

#  Scenario: Add a new book
#    Given I have the base URL "http://localhost:5000"
#    And I have the following book data:
#      | title        | author       |
#      | New Book     | New Author   |
#    When I make a POST request to "/books"
#    Then the response code should be 201
#    And the response body should contain "Book added successfully"
#
#
#  Scenario: Delete a book by ID
#    Given I have the base URL "http://localhost:5000"
#    And a book with ID "1" exists
#    When I make a DELETE request to "/books/1"
#    Then the response code should be 204
#    And the book with ID "1" should be deleted


#  Scenario: Update a book by ID
#    Given I have the base URL "http://localhost:5000"
#    And a book with ID "1" exists
#    And I have the following updated book data:
#      | title        | author       |
#      | Updated Book | Updated Author |
#    When I make a PUT request to "/books/1"
#    Then the response code should be 200
#    And the response body should contain "Book updated successfully"