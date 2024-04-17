Feature: Select Query Execute
  @Query01
  Scenario: Verify user_ids between 100 and 5000 in the db

    * database connection
    * make query and execute
    * resultSet process
    * db closed