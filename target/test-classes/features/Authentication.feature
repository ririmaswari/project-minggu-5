Feature: Authentication Feature

  Scenario Outline: Positive Sign In Cura Healthcare Service
    Given pengguna berada di halaman login CURA Healthcare Service.
    When pengguna login dengan username "<username>" dan password "<password>".
    Then pengguna akan di bawa ke halaman dengan url "<url>" untuk memeriksa hasil test.

    Examples:
      | username | password           | url                                                  |
      | John Doe | ThisIsNotAPassword | https://katalon-demo-cura.herokuapp.com/#appointment |

  Scenario Outline: Negative Sign In Cura Healthcare Service
    Given pengguna masuk terlebih dahulu ke halama login.
    When pengguna memasukkan username "<username>".
    And pengguna memasukkan password "<password>".
    And pengguna menekan tombol login.
    Then pengguna akan melihat pesan kesalahan "<message>".

    Examples:
      | username        | password           | message                                                          |
      | invalidUsername | ThisIsNotAPassword | Login failed! Please ensure the username and password are valid. |
      | John Doe        | invalidPassword    | Login failed! Please ensure the username and password are valid. |
      | John Doe        |                    | Login failed! Please ensure the username and password are valid. |
      |                 | ThisIsNotAPassword | Login failed! Please ensure the username and password are valid. |