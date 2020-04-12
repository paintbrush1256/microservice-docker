sudo snap install microk8s --classic

sudo usermod -a -G microk8s vagrant
sudo snap alias microk8s.kubectl kubectl


sudo usermod -a -G microk8s vagrant
sudo chown -f -R vagrant ~/.kube

