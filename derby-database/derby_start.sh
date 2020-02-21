sudo docker kill derby_shibu
sudo docker rm derby_shibu
sudo docker run -d -p 1527:1527 -v /dbs:/dbs --name derby_shibu lucascoelhocs/db-derby
