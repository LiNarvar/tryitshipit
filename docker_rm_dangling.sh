docker ps -a
docker images -a
docker ps -a | awk 'FNR > 1 {print $1}' | xargs docker rm
docker images -a | grep "tryitshipit" | awk '{print $3}' | xargs docker rmi
docker images -a | grep "none" | awk '{print $3}' | xargs docker rmi
docker ps -a
docker images -a
