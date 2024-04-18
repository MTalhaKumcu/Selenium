Feature: Select Query Execute

  Background: db connection
    * database connection

  @query01
  Scenario: Verify user_ids between 100 and 5000 in the db
    * query01 make query and execute
    * resultSet01 process
    * db closed

  @query02
  Scenario: database icindeki users tablosunda ilk 2 kaydin "surname" bilgisini dogrulayin

    * query02 make query and execute
    * resultSet02 process
    * db closed


