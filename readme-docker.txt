#=====================================================================================
#In case docker pull is getting stuck, restart docker daemon as below
#--------------------------------------------------------------------
sudo service docker stop
nohup sudo dockerd --max-concurrent-downloads 1 &

#=====================================================================================
#docker export and import an image
#---------------------------------
Use the docker save command. 
docker save myusername/myproject:latest | gzip -c > myproject_img_bak20141103.tgz

You will later be able to restore it with the docker load command. 
$ gunzip -c myproject_img_bak20141103.tgz | docker load

#=====================================================================================



#=====================================================================================
#backup image to tar
#-------------------
sudo docker save openjdk:8              -o openjdk.8.image.tar
sudo docker save lucascoelhocs/db-derby -o db-derby.8.image.tar
sudo docker save tomcat                 -o tomcat.8.5.51.image.tar
#=====================================================================================
