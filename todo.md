**TODO**:
+ build new case data model
    + ~~get generic UI working~~
    + ~~get case, talking to person~~
    + ~~get service attached to case~~
    + ~~fix generic UI to have logo~~
+ ~~build REST API and view in swagger~~
+ ~~build react responsive UI for mobile~~

+ ~~add flowable workflow engine~~

+ ~~generate a model and UI for an existing DB. https://doc.cuba-platform.com/studio/?_ga=2.104222466.348203825.1554733758-1508817889.1553809242#generate_model~~
    
    **Notes:** I generated the data model and raw screens successfully!
    1. need to map the CUBA needed fields to the existing fields, if they exist (e.g. time create, last user, etc.)
    2. need to do lots of work to clean up the screens to use for demo of "raw" screens
    3. need to create links between different entities -- a real er diagram. 
    
+ Search the database by facility name to retrieve a list of facilities
+ create new search that feeds into app.js, leaving facility.js alone
    on new search page: 
    search starts out empty
    route to new search page, with just search button
    onSubmit, call SearchForm to get the data, and load the info for the dataGrid
    dataGrid will render if data is not null (if state is updated and filtered data is not null)

======
5/13/2019
- change state to be cleaner
- add error handling
+ add button to edit and update
+ on new update page, only allow changing name(?) or some other field
    
+ Add testing
+ ~~Add UI improvements: logo, and cwds stsyle sheet~~
+ Show both generic UI and React UI user interfaces
+ test responsive design

+ evaluate testing tools and possibly add cucumber?


+ build deployable pipeline to AWS
    + add to github
    + build jenkins to build and deploy as docker-compose (or lambda!!)
+ debug the project

+ Create service for entities
+ For service object,  if service object is created, and its emergency, route to manager for approval
+ add BRE in middleware section


NOTE:
1. need to understand the impact of how to change the data model, and what has to be regenerated
+ assess impact of adding code to service, yet regenerating the front-end or data model
+ assess if CUBA is a quick prototyping tool, or if it will really work

**dev notes:**
- run docker container for postgres data
$ docker rm postgresql_data  # clear out old name
postgresql_data
$ docker run -d --name=postgresql_data -p 5432:5432 cwds/postgresql_data
82c8829c367eb8c376d5d0580b05573b24045f6ef5aa564b789af29455860951

$ npm run start # it should start on localhost:3000

to get an access token to put in teh header:
$ curl -H "Content-type: application/x-www-form-urlencoded" -H "Authorization: Basic Y2xpZW50OnNlY3JldA==" -d "grant_type=password&username=admin&password=admin" http://localhost:8080/app/rest/v2/oauth/token
