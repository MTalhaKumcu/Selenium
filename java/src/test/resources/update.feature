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

  @insertquery01
  Scenario: users tablosunda yeni username,userlastname,email ekle
    * insertQuery setup and execute
    * intsertQuery resultset verify
    * db closed

  @deletequery01
  Scenario: users tablosunda user_id`ye gore bir datayi siliniz.

    * delete query and execute
    * verify deleted data
    *  db closed

  @deletequery02
  Scenario: users tablosunda user telefon`osunu siliniz ve bunu dogrulayiniz
    #bu sorguyu yapabilmek icin once kendinize ait bir vdb olusturup onu silmeliyiz
    * insert user into user db
    * delete usertelefon from user table
    * verify deleted last data
    * db closed