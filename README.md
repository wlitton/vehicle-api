SET UP 

1. Set up MySql database, run command:

docker run -d -p 6033:3306 --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=veh_manager" mysql


2. populate vehicle database (cd into /sql folder and run command):

docker exec -i docker-mysql mysql -uroot -proot veh_manager <veh_manager.sql 


3. build API docker container, run command:

docker build -f Dockerfile -t veh_manager_app .


4. run API docker container connected to database, run command:

docker run -t --link docker-mysql:mysql -p 10222:10222 veh_manager_app 


5. test vehicles endpoint, open browser and navigate to:

http://localhost:10222/vehicle