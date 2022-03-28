Feature: Automation testing using Screenplay pattern.
    As an automation tester
    I need to take automation testing using Screenplay patter
    for learn about serenity BDD framework

    Scenario Outline: Fill a user registration form using all fields
        Given the user is on landing page
        When him browse to registration form
        And him has filled it and submitted
            |email|<email>|
            |firstName|<firstName>|
            |lastName|<lastName>|
            |password|<password>|
            |dayofbirth|<dayofbirth>|
            |monthofbirth|<monthofbirth>|
            |yearofbirth|<yearofbirth>|
            |company|<company>|
            |address|<address>|
            |address2|<address2>|
            |city|<city>|
            |state|<state>|
            |zipcode|<zipcode>|
            |country|<country>|
            |description|<description>|
            |homephone|<homephone>|
            |mobilephone|<mobilephone>|
            |addressreference|<addressreference>|
        Then the user will see a registration information
        Examples:
            |email             |firstName|lastName |password   |dayofbirth|monthofbirth|yearofbirth|company|address     |address2    |city   |state    |zipcode|country          |description|homephone  |mobilephone|addressreference|
            |@gmail.co         |Samuel   |Duque    |123456     |15        |April       |1998       |Sofka  |kra53 #44-4 |dofisdfisugf|miami  |Florida  |00000  |United States    |afafadadad |65465465   |3213654654 |ffaasd         |

    Scenario Outline: Fill out a user registration form using all fields except password
        Given the user is on page
        When the user browse to registration form
        And him has filled it except password and submitted
            |email|<email>|
            |firstName|<firstName>|
            |lastName|<lastName>|
            |password|<password>|
            |dayofbirth|<dayofbirth>|
            |monthofbirth|<monthofbirth>|
            |yearofbirth|<yearofbirth>|
            |company|<company>|
            |address|<address>|
            |address2|<address2>|
            |city|<city>|
            |state|<state>|
            |zipcode|<zipcode>|
            |country|<country>|
            |description|<description>|
            |homephone|<homephone>|
            |mobilephone|<mobilephone>|
            |addressreference|<addressreference>|
        Then the user will see a registration error
        Examples:
            |email             |firstName|lastName |password   |dayofbirth|monthofbirth|yearofbirth|company|address     |address2    |city   |state    |zipcode|country          |description|homephone  |mobilephone|addressreference|
            |@gmail.co         |Samuel   |Duque    |           |15        |April       |1998       |Sofka  |kra53 #44-4 |dofisdfisugf|miami  |Florida  |00000  |United States    |afafadadad |65465465   |3213654654 |ffaasd         |

