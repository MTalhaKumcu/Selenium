Feature: Update Query

  Background:  db conncetion
    * database connection

  @update01
  Scenario: users tablo`sundaki J harfi ile baslayan userlarin telefon numaralarini guncelle


    * query03 update and execution
    * query03 resultset process
    * db closed

  @update02
  Scenario: prepared statement

    * query04 update and execution
    * query04 resultset process
    * db closed