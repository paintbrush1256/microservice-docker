Vagrant.configure("2") do |config|
	config.vm.box = "ubuntu/xenial64"

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
	config.vm.network "forwarded_port", guest: 8101, host: 8101
	config.vm.network "forwarded_port", guest: 1527, host: 1527

	config.vm.synced_folder ".", "/vagrant"
end
