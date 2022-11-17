# BetterCryptoBureau

## Test - write, perform, screenshot tests

2022.12.07, 100 pts = 25%

1. Write the steps and tools required to test the requirement.

2. Perform the steps. 

3. Screenshot the properly working code and unit test execution results.

4. Attach to each complete user story these screenshots.

5. Attach to each complete user story the j-unit test execution results.

6. Move user story to Done.


### User Stories and Acceptance Criteria

#### Login

##### User story

As a security-aware browser, I want to login with a username and password, so that I can feel safe.

##### Acceptance criteria 

It's done when I can enter a username and password, click a login button, and am routed to a new page.

#### Lookup

##### User story

As an investor, I want to see who project founders are, so that I can easily research their backgrounds and credentials.

#####  Acceptance criteria 

It's done when I can click on a project, routed to the project's page, and see basic project info such as the project founder's full name.

#### View listing

##### User story

As an explorer, I want to see a list of all documented cryptocurrencies, so that I can explore and find new ones.

##### Acceptance criteria 
It's done when the Project List page displays a list of all projects.

#### View listing sorted

##### User story

As an inquisitive investor, I want to sort the cryptocurrency list by reputation, price, and other metrics, so that I can discover new ones.

##### Acceptance criteria 

It's done when a table is sortable by a column.

It's done when column 1 is Project Name and column 2 is Reputation.

#### Submit info

##### User story

As an cryptocurrency expert, I want to contribute information to cryptocurrency projects, so that I can improve my reputation.

##### Acceptance criteria 
It's done when I can submit a REST POST request which contains some basic project info.

#### Search

##### User story

As a user, I want to search for specific cryptocurrency projects by name and tags, so that I can easily find what I'm looking for.

##### Acceptance criteria 

It's done when I can type into a field a project name, click a search button, and am routed to a Results page containing that project's info.

#### History

##### User story

As an investor suspicious of Wall Street Bets, I want to access historical/archive/vintage information, so that I can see if users are contributing falsified information to pump up a project.

##### Acceptance criteria 

It's done when I can view historical information about a project.

It's done when a database table contains fields project_name, founder_name, current. Looking at history shows now just the single row flagged as current, but all other rows as well.

#### Price series

##### User story

As a risk averse investor, I want to see price time series, so that I can tell how volatile a cryptocurrency's price is. I'd also like to see price/initial coin offering price, to know how over- or under-valued the coin is, relative to first listing.

##### Acceptance criteria 

It's done when a project page displays latest price divided by initial coin offering price in USD.

It's done when the page displays a price series where column 1 is dates and column 2 is price in USD.

#### Purchase links

##### User story

As an eager investor, I want links to external coin markets, so that I know I'm going to purchase the correct coin.

##### Acceptance criteria 

It's done when each project page contains a link to its page on www.coinbase.com, where I can navigate to buy it.

#### Reputation

##### User story

As an easily overwhelmed investor, I want to see a index number/letter system that tells me with a quick glance how reputable a coin is.

##### Acceptance criteria 

It's done when I can see a single metric score that tells me how reputable a project is. This score should be determined using an arbitrary calculation.
