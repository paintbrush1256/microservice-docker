wget -c --no-check-certificate -O ubuntu-xenial64-20200204.0.0-virtualbox.box https://vagrantcloud.com/ubuntu/boxes/xenial64/versions/20200204.0.0/providers/virtualbox.box

vagrant box add --name "ubuntu/xenial64" ubuntu-xenial64-20200204.0.0-virtualbox.box
vagrant up
