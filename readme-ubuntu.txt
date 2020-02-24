sudo apt-get update

#================== install docker start =========================
#is this the preferred way? please check before proceeding
#---------------------------------------------------------
sudo apt-get install docker.io -y
#================== install docker start =========================


#================== install docker start =========================
sudo apt-get remove docker docker-engine docker.io containerd runc
sudo apt-get update
sudo apt-get install apt-transport-https ca-certificates curl gnupg-agent software-properties-common -y
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io
#================== install docker end ===========================


#================== install docker-compose start =================
sudo apt-get install jq -y
VERSION=$(curl --silent https://api.github.com/repos/docker/compose/releases/latest | jq .name -r)
sudo curl -L https://github.com/docker/compose/releases/download/${VERSION}/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
sudo chmod 755 /usr/local/bin/docker-compose
#================== install docker-compose end ===================


#================== install java start ===========================
sudo apt-get install openjdk-8-jdk-headless -y
sudo apt-get install maven -y
#================== install java end =============================


sudo service docker stop
nohup sudo dockerd --max-concurrent-downloads 1 &
sudo docker run tomcat

sudo docker run -p 9090:8080 tomcat


#----------------------------------------------------------------------------------
backup image to tar
sudo docker save openjdk:8              -o openjdk.8.image.tar
sudo docker save lucascoelhocs/db-derby -o db-derby.8.image.tar
sudo docker save tomcat                 -o tomcat.8.5.51.image.tar

===================================================================================

sudo docker run -d -p 1527:1527 -v /dbs:/dbs lucascoelhocs/db-derby
