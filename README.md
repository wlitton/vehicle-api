SET UP 

1. Run docker compose up:

docker-compose up


2. Wait 20-30 seconds for database to spin up and populate vehicle database 
 - open new command prompt and 
 - cd into vehicle-api/sql folder and run command

docker exec -i vehicle-api_db_1 mysql -uroot -proot veh_manager <veh_manager.sql


3. test vehicles endpoint, open browser and navigate to:

http://localhost:10222/vehicle
http://localhost:10222/vehicle?offset=1&count=6
http://localhost:10222/vehicle/make/GMC
http://localhost:10222/vehicle/color/green
http://localhost:10222/vehicle/model/Sierra?offset=1
http://localhost:10222/vehicle/year/2014


4. navigate to

http://localhost:10222/thanks 

DOCUMENTATION
- open API docs in docs/ folder