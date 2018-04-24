## Example project with mariadb and spring in dockers connected through kubernetes

Requirements:
* docker
* kubernetes
* minikube

Executing:
* build mariadb image: docker build -t mtwolak/maria-sep . -> push to repo
* build spring image: docker build -t mtwolak/spring . -> push to repo
* kubectl create -f mariaspring.yml
* kubectl create -f deployment.yml
* minikube service --url spring
* ($URL)/getAll
