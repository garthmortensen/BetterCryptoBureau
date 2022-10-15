# BetterCryptoBureau


## Elaboration Part 2 - Refine user stories, sequence diagram

*2022.10.25, 100 pts = 25%*

1. Given Elaboration Part 1 classes, create a play/narration/sequence diagram for each user story.

2. When starting a user story, move it to Refining. Max one story/person in Refining. 

3. When play/narration is complete, move user story to Implementing. Attach to the story the narration.

## User stories

### Authentication

*As a security-aware browser, I want to login with a username and password, so that I can feel safe.*

**Following is sourced/adapted from Michael Dorin's user story 8:**
General - Receives and directs user requests
Clerk - In charge of persistent storage
Bouncer - In charge of security and authentication
Artist - In charge of displaying output to user
User - Human using the software

**User logs in:**

```diagram
# https://www.plantuml.com/plantuml/uml/SyfFKj2rKt3CoKnELR1Io4ZDoSa70000

@startuml
@startuml
User -> General: I would like to contribute content
General -> Artist: Tell User to Log In
Artist --> User: You need to log in
User -> General: Here is my login information
General -> Bouncer: Is this login valid?
Bouncer --> General: Yes
General -> Artist: Display main menu
Artist --> User: Here is the main menu
@enduml
```

![user story Authentication](./images/user_story_authentication.png)





