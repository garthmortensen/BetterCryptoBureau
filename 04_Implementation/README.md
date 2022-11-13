# BetterCryptoBureau

## Implementation - UML and code it

*2022.12.06, 100 pts = 25%*

For each refined story in Implementing:

1. Draw a rough UML diagram per narration.

2. Code the UML

3. Push to Github.

In Kanban, attach to each user story the UML diagram.

Once code is complete, move user story to Testing.

### Current kanban state

![kanban](./images/kanban_current_state.png)

## Sequence diagram to UML

Images created at https://www.plantuml.com/plantuml/uml/

## UML

### User

User class:

```plantuml
@startuml
class User
{
-String fullName
-int phoneNumber
-String email
-String userName
-String password

+createLogin()
+login()
}
@enduml
```

![plant_uml_user](./images/uml_user.png)

### Model

Model view:

```plantuml
@startuml
class Model 
{
 -String name
 -String symbol
 -float decimals
 -int totalSupply
 -Date icoDate
 -Array priceUSD
 -String creator
 -String creatorBio
 -String fundingSources
 -String whitePaperURL
 -String history
 -String controversies
 -int reputation
   
 +getName()
 +setName()
 +getsymbol()
 +setsymbol()
 +getdecimals()
 +setdecimals()
 +gettotalSupply()
 +settotalSupply()
 +geticoDate()
 +seticoDate()
 +getpriceUSD()
 +setpriceUSD()
 +getcreator()
 +setcreator()
 +getcreatorBio()
 +setcreatorBio()
 +getfundingSources()
 +setfundingSources()
 +getwhitePaperURL()
 +setwhitePaperURL()
 +gethistory()
 +sethistory()
 +gethistory()
 +sethistory()
 +getreputation()
 +setreputation()
}
@enduml
```

![plant_uml_model](./images/uml_model.png)

### Controller

Controller is just a router. These modules tend to be very short. Wouldn't they just be methods?

```plantuml
@startuml
class Controller
{
}
@enduml
```

### View

Template Engines create these dynamic websites, so do they even have code associated to them?

```plantuml
@startuml
class View
{
}
@enduml
```

