# Apache Kafka Demo
 Apache kafka demo application with Spring Boot

## Getting Started
This spring boot application implements kafka streams as consumer and producer.
Producer send data to kafka. Consumer consumes data from kafka. 


## Technologies
- **Docker version 20.10.17**
- **Spring Boot 2.7.5**
- **JDK 17**

## Docker Images
- **bitnami/zookeeper : 3.8.0**
- **bitnami/kafka :3.3.1**
- **provectuslabs/kafka-ui:a2e87cc8d5ba21e2b01f2f240926298f382db63c**

## Before You Run
Be sure docker engine installed. 
run this command in master project(kafka-demo): ```docker-compose up -d```

## Endpoints
```
- POST  /message
```
## How To Run
- Run ProducerApplication project
- Run ConsumerApplication project
- Post a data to endpoint
- Look at the consumer application console :)


