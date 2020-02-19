sudo apt-get update
sudo apt-get install docker.io -y

sudo service docker stop
nohup sudo dockerd --max-concurrent-downloads 1 &
sudo docker run tomcat

sudo docker run -p 9090:8080 tomcat


===================
docker export and import an image
---------------------------------
Simply use the docker save command. 
$ docker save myusername/myproject:latest | gzip -c > myproject_img_bak20141103.tgz

You will later be able to restore it with the docker load command. 
$ gunzip -c myproject_img_bak20141103.tgz | docker load

or use docker image import ?


vagrant@ubuntu-xenial:~$ sudo docker save tomcat:latest | gzip -c > shibu_tomcat_export.tgz

=====================================

sudo docker run -d -p 1527:1527 -v /dbs:/dbs lucascoelhocs/db-derby
