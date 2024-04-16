Feature: Select Query Execute

  Scenario: Verify user_ids between 100 and 5000 in the db

    * db connection
    * make query and execute
    * resultSet process
    * db closed