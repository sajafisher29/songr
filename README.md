# Code 401 Lab 11: Building Full-Stack Web Apps

## Overview
Setting up a basic webapp that will be used for the next five labs.

## Setup
Use the Spring Initializr to create a new application with artifact songr with Web and Thymeleaf (and optionally Devtools) dependencies. Download the zip file and extract the directory it contains. Add the course gitignore file into that directory. Run git init, git add ., and git commit -m "initial commit from Spring init". Create a new GitHub repo, and push your initial commit to your master branch there. Then, check out a new branch to begin your work for the day.

## Deployment
TBD

### Contribute
No contribution guidelines at this point. 

## Build status

#### Wireframes
None at this point

#### Code of Conduct and Conflict Plan
- We will strive to create an open and welcoming environment where participation and contribution to the project and general community is a harassment-free experience for everyone, regardless of age, body size, disability, ethnicity, sex characteristics, gender identity and expression, level of experience, education, socio-economic status, nationality, personal appearance, race, religion, or sexual identity and orientation.
- We will use welcoming and inclusive language, be respectful of differing viewpoints and experiences, gracefully accept constructive criticism, focus on what is best for the team and the community, and show empathy towards others.
- We will not tolerate unwelcome sexual attention or advances, trolling, insulting/derogatory comments, and personal or political attacks, public or private harassment, publishing others’ private information, or other conduct which could reasonably be considered inappropriate in an academic and professional setting.
- We agree to work as a team to hold each other accountable to these responsibilities and take appropriate and fair corrective action in response to any instances of unacceptable behavior. We will not retaliate against those who have a differing opinion or those who hold others accountable.
- We will work as a team to support each individual reaching their full potential.
- If disagreements arise in the team we will make sure that everyone has a chance to state their opinion and be heard, not spoken over or dismissed, and discuss possible solutions as a team. If attempts to resolve the conflict is unsuccessful and a solution cannot be agreed upon we will escalate the discussion by asking one of the TAs or the instructor to mediate.
- If a team member is not adequately contributing we will raise the concern by speaking with them individually or as a team. We will focus on how we can help them contribute more. Are they struggling with something that is keeping them from moving forward? Are there other areas of the project they feel more comfortable contributing to? Consider the needs of the individual as well as the team.

#### Communication Plan
- We will strive to make sure the team members communicate with each other regularly to keep the team running at the same pace and that everyone feels comfortable speaking up.
- We will you communicate after hours through Slack. If there is any work done (coding, Trello, etc) the team member will send a summary of what was done so everyone is on the same page and we can keep the documentation updated.
- We will listen to hear, not to reply, to ensure everyone's voice is heard. We will also make sure each team member agrees to the decisions made in the project before they are acted upon.
- We will create a safe environment where everyone feels comfortable speaking up by following our code of conduct and keeping each other accountable.

### Project Scope
#### Feature Tasks
Consider basic application setup. What classes should be created? How should they be related?

1) Ensure that you can run the Spring app.
2) Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
3) Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda 4) Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
5) Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
6) Create an Album class to act as a model in our app.
7) An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
8) Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

#### Stretch
1) Modify your /hello route to allow users to specify their name with a query parameter, like /hello?name=Joe, and get a custom hello message back.
2) Modify your /hello route to expect a POST request instead of a GET request. Use Postman for manual testing.
3) Create a route that takes in a number, and then makes a request to the Numbers API to get a fact about that number. Return the fact.
4) Create a route that tells the user information about their computer. For example, it might tell them what browser they’re using, what OS they’re using, what their IP address is, and other such information. (Hint: This information is in the headers of the request that comes in to the server, so you may want to look at the request headers.)

## Code style
Code style is Java, Spring, ThymeLeaf

## API Reference
None at this point

## Database 
None at this point

## Tests
No tests at this time. 
* Need to test the constructor, getters, and setters for the Album class.

## Credits
* Java 401 Instructional Team
* https://meyerweb.com/eric/tools/css/reset/ CSS Reset Tool

## License
MIT © Code Fellows
![CF](https://i.imgur.com/7v5ASc8.png)