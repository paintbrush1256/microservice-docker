sudo docker kill eureka_shibu
sudo docker rm eureka_shibu
sudo docker run -d -p 8761:8761 --name eureka_shibu metro-eureka-server

