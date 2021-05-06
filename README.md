SET UP 

1. Set up MySql database, run command:

docker run -d -p 6033:3306 --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=veh_manager" mysql


2. populate vehicle database (cd into /sql folder and run command): ***may need to wait a few seconds and run again if it says error can't connect

docker exec -i docker-mysql mysql -uroot -proot veh_manager <veh_manager.sql 


3. build API docker container, run command:

docker build -f Dockerfile -t veh_manager_app .


4. run API docker container connected to database, run command:

docker run -t --link docker-mysql:mysql -p 10222:10222 veh_manager_app 


5. test vehicles endpoint, open browser and navigate to:

http://localhost:10222/vehicle
http://localhost:10222/vehicle?offset=1&count=6
http://localhost:10222/vehicle/make/GMC
http://localhost:10222/vehicle/color/green
http://localhost:10222/vehicle/model/Sierra?offset=1
http://localhost:10222/vehicle/year/2014


6. navigate to

http://localhost:10222/thanks 

DOCUMENTATION
- open API docs in docs/ folder