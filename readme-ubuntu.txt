sudo apt-get update
sudo apt-get install docker.io -y

#================== install docker start =========================
sudo apt-get remove docker docker-engine docker.io containerd runc
sudo apt-get update
sudo apt-get install apt-transport-https ca-certificates curl gnupg-agent software-properties-common -y
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io
#================== install docker end ===========================

sudo apt-get install openjdk-8-jdk-headless -y
sudo apt-get install maven -y

#================== install docker end ===========================


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

#----------------------------------------------------------------------------------
backup image to tar
sudo docker save openjdk:8              -o openjdk.8.image.tar
sudo docker save lucascoelhocs/db-derby -o db-derby.8.image.tar
sudo docker save tomcat                 -o tomcat.8.5.51.image.tar

===================================================================================

sudo docker run -d -p 1527:1527 -v /dbs:/dbs lucascoelhocs/db-derby
