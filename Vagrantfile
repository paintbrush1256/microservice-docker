Vagrant.configure("2") do |config|
	config.vm.box = "ubuntu/xenial64"
    config.vm.box_check_update = false
	
	#------------------------------------------------------------
	#config.vm.network "forwarded_port", guest: 443,  host: 443
	#config.vm.network "forwarded_port", guest: 80,   host: 80
	#------------------------------------------------------------
	config.vm.network "forwarded_port", guest: 2000, host: 2000
	config.vm.network "forwarded_port", guest: 3000, host: 3000
	config.vm.network "forwarded_port", guest: 4000, host: 4000
	config.vm.network "forwarded_port", guest: 5000, host: 5000
	config.vm.network "forwarded_port", guest: 6000, host: 6000
	config.vm.network "forwarded_port", guest: 7000, host: 7000
	config.vm.network "forwarded_port", guest: 8000, host: 8000
	config.vm.network "forwarded_port", guest: 9000, host: 9000

	config.vm.network "forwarded_port", guest: 8080, host: 8080
	config.vm.network "forwarded_port", guest: 9090, host: 9090
	#------------------------------------------------------------
	#Account and Customer Server
	config.vm.network "forwarded_port", guest: 8101, host: 8101
	config.vm.network "forwarded_port", guest: 8201, host: 8201
	#------------------------------------------------------------
	#8761 = Eureka Server
	config.vm.network "forwarded_port", guest: 8761, host: 8761
	#------------------------------------------------------------
    #derby	
	config.vm.network "forwarded_port", guest: 1527, host: 1527
	#------------------------------------------------------------
    #kubernetes admin	
	config.vm.network "forwarded_port", guest: 8001,  host: 8001
	config.vm.network "forwarded_port", guest: 16443, host: 16443
	#------------------------------------------------------------

	config.vm.synced_folder "."                            , "/vagrant"
	#config.vm.synced_folder "D:/Projects/aws-sscloudpoc"   , "/aws-sscloudpoc"
	config.vm.synced_folder "D:/Projects/sscloudpoc"       , "/sscloudpoc"
	config.vm.synced_folder "D:/devspace/repository/"      , "/home/vagrant/.m2/repository"
    
    config.vm.provider "virtualbox" do |v|
        v.memory = 4096
    end	
end
