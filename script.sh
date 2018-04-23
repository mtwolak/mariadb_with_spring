docker network create myNetwork
docker build -t spring spring/
docker build -t maria-sep sql/
docker run -d --name mariadb --network=myNetwork maria-sep
docker run -d --network=myNetwork -p 8080:8080 --restart always spring
