# WildlifeTraker
The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. You have been asked to build an application that allows Rangers to track wildlife sightings in the area.

## PROJECT AUTHOR
MAKU PAULINE MAZAKPE

## Technologies and frameworks used
1. java 11
2. spark core 2.12
3. Gradle 4.10
4. Spark Template Velocity
5. Junit 4
6. Postgres
7. psql
8. sql2o
9. postgresql

## Usage
1. Clone this repo
2. Compile "gradle compileJava"
3. Run cd to cd build/classes/main `java App`

## User Stories 

## In PSQL:
1. Run psql in terminal
2. CREATE DATABASE wildlife_tracker;
3. CREATE TABLE animals (id serial PRIMARY KEY, name VARCHAR);
4. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
5. CREATE TABLE endangeredAnimals (id serial PRIMARY KEY, name varchar);
6. DROP DATABASE wildlife_tracker_test;
7. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

## SCREENSHOTS
[![Screenshot-from-2019-04-20-20-57-03.png](https://i.postimg.cc/5N6pzWnZ/Screenshot-from-2019-04-20-20-57-03.png)](https://postimg.cc/crGQq2qm)
[![Screenshot-from-2019-04-20-20-57-10.png](https://i.postimg.cc/GmvFPLYS/Screenshot-from-2019-04-20-20-57-10.png)](https://postimg.cc/PCrvTkSm)
[![Screenshot-from-2019-04-20-20-57-21.png](https://i.postimg.cc/63pCNCPD/Screenshot-from-2019-04-20-20-57-21.png)](https://postimg.cc/SXHn6Ykr)

## Testing
gradle test

## License
[MIT](https://choosealicense.com/licenses/mit/)

