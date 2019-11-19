# Cloud
`Cloud` is a demo based on `Spring Cloud` and `Docker Compose`

# First step
1. create network
```shell script
docker network create bp
```
2. create volume
```shell script
docker volume create --name=cloud
```
3. build docker images
```shell script
docker-compose build
```
4. start project
```shell script
docker-compose up
```