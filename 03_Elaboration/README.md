# BetterCryptoBureau

## Elaboration Part 2 - Refine user stories, sequence diagram

*2022.10.25, 100 pts = 25%*

1. Given Elaboration Part 1 classes, create a play/narration/sequence diagram for each user story.

2. When starting a user story, move it to Refining. Max one story/person in Refining. 

3. When play/narration is complete, move user story to Implementing. Attach to the story the narration.

| CLASS NAME | FUNCTION                                                     |
| ---------- | ------------------------------------------------------------ |
| Controller | Controller from MVC architectural pattern. Receives and directs user requests. |
| Clerk      | Persistent storage, performing database storage and operations (sort lists). |
| Artist     | Display data to users (View from MVC).                       |
| Bouncer    | Security, for user authentication.                           |
| Calculator | Performs calculations, such as calculate cryptocurrency reputation. |
| Presenter  | Get list of available cryptocurrencies, get their historical data, get project information, search for cryptocurrencies, purchase links, reputation score. |

## User stories

Images created at https://www.plantuml.com/plantuml/uml/

### Authentication

Story points = 4

*As a security-aware browser, I want to login with a username and password, so that I can feel safe.*

**Following is sourced/adapted from Michael Dorin's user story 8:**

```diagram
@startuml
User -> Controller: I would like to contribute content
General -> Artist: Tell User to Log In
Artist --> User: You need to log in
User -> Controller: Here is my login information
Controller -> Bouncer: Is this login valid?
Bouncer --> Controller: Yes
General -> Artist: Display main menu
Artist --> User: Here is the main menu
@enduml
```

![user story Authentication](./images/user_story_authentication.png)

### See project info

Story points = 2

*As an investor, I want to see who project founders are, so that I can easily research their backgrounds and credentials.*

```diagram
@startuml
User -> Controller: I would like to see project info.
Controller -> Artist: Ask user what project they want to see info about.
Artist --> User: What project are you interested in?
User -> Controller: Project X.
Controller -> Clerk: Find us info on project X.
Clerk --> Controller: Here is the info.
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
@enduml
```

![user story see project info.png](./images/user_story_see_project_info.png)

### See listing

Story points = 1

*As an explorer, I want to see a list of all documented cryptocurrencies, so that I can explore and find new ones.*

```diagram
@startuml
User -> Controller: I would like to see a a listing of all projects.
Controller -> Clerk: Find us a listing of all projects.
Clerk --> Controller: Here is the info.
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
@enduml
```

![user story see listing](./images/user_story_see_listing.png)

### Sort list

Story points = 2

*As an inquisitive investor, I want to sort the cryptocurrency list by reputation, price, and other metrics, so that I can discover new ones.*

```diagram
@startuml
User -> Controller: I would like to sort the list of projects by a specific field.
Controller -> Artist: Ask user what they want to order by.
Artist --> User: What do you what to order this list by?
User -> Controller: Reputation score.
Controller -> Clerk: Order the projects by Reputation score.
Clerk --> Controller: Here is the info.
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
@enduml
```

![user story sort list](./images/user_story_see_listing.png)

### User provided content

Story points = 4

*As an cryptocurrency expert, I want to contribute information to cryptocurrency projects, so that I can improve my reputation.*

```diagram
@startuml
User -> Controller: I would like to submit info about a project, so that I can earn xp points.
Controller -> Artist: Ask user what project they want to contribute info about.
Artist --> User: What project do you want to contribute info about?
User -> Controller: Project X.
Controller -> Artist: Ask user what category of info they want to contribute.
Artist --> User: What category of info do you want to contribute?
User -> Controller: Blockchain info.
Controller -> Artist: Ask user what specific blockchain info they want to contribute.
Artist --> User: What specific blockchain info do you want to contribute?
User -> Controller: This project runs on the Ethereum blockchain.
Controller -> Clerk: Store this user provided information.
Controller -> Calculator: Give the user 10 XP points for contributing info about blockchain.
Controller -> Artist: Tell the user we have saved the info and awarded them 10 XP.
Artist --> User: We have saved the info and awarded you 10 XP.
@enduml
```

![user story user provided content](./images/user_story_user_provided_content.png)

### Search by name and tag

Story points = 3

*As a user, I want to be able to search for specific cryptocurrency projects by name and tags, so that I can easily find what I'm looking for.*

```diagram
@startuml
User -> Controller: I want to search for a project I've heard about.
Controller -> Artist: Ask user what project they want to search for.
Artist --> User: What project are you searching for?
User -> Controller: It's a project that runs on Ethereum blockchain and starts with "tulip".
Controller -> Clerk: Find us all projects that run on Ethereum blockchain and start with tulip.
Clerk --> Controller: Here is the info.
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
@enduml
```

![user story search](./images/user_story_search.png)

### View content history

Story points = 3

*As an investor suspicious of Wall Street Bets, I want to access historical/archive/vintage information, so that I can see if users are contributing falsified information to pump up a project.*

```diagram
@startuml
User -> Controller: I want to search a project historical data like price and overall perfomance .
Controller -> Artist: Ask user what project user wants to see .
Artist --> User: What project are you searching for?
User -> Controller: It's a project named vehcain 
Controller -> Clerk: Find  the project named vechain 
Clerk --> Controller: Here is the info of the requested project.
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
@enduml

```

![user story  Historical Search](./images/User_story%20_historical.png)

### Price history

Story points = 3

*As a risk averse investor, I want to see price time series, so that I can tell how volatile a cryptocurrency's price is. I'd also like to see price/initial coin offering price, to know how over- or under-valued the coin is, relative to first listing.*

```diagram
@startuml
User -> Controller:  I want to see  performance of a project so I can  get better picture of its volatility and overall performance in relation to the overall market.
Controller -> Artist: Ask user what project user wants to see .
Artist --> User: What project are you searching for?
User -> Controller: It's a project named X
Controller -> Clerk: Find  the project named X 
Clerk --> Controller: Here is the info of the requested project.
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
User -> Controller :Can you rate this project price flactuation compared to overall market
Clerk --> Controller: Here is the info of the requested project.
@enduml
```

[user story  Price History](./images/User_Story%20_Price%20_history.png)

### Purchase links

Story points = 1

*As an eager investor, I want links to external coin markets, so that I know I'm going to purchase the correct coin.*

```diagram
@startuml
User -> Controller: I want to see the list of exchanges I can purchase cryptocurrency coins/shares 
Controller -> Artist: Ask user what project user wants to see .
Artist --> User: What project are you searching for?
User -> Controller: It's a project named X
Controller -> Clerk: Find  the project named X 
Clerk --> Controller: Here is the list of exchanges you can purchase project X
Controller -> Artist: Display this info to the user.
Artist --> User: Here is the info you wanted.
@enduml
```

[user story  Exchanges](./images/user_Story_Exchanges.png)

### Reputation index system

Story points = 2

*As an easily overwhelmed investor, I want to see a index number/letter system that tells me with a quick glance how reputable a coin is.*

```diagram
@startuml
User -> Controller: 
Controller -> 
...
@enduml
```

![user story x](./images/filename.png)


