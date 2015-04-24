## Supervise easily your app with ELK and Docker

This project show you how to install Logstash Elasticsearch and Kibana on your servers. Docker is use here to quickly install components.

### Elasticsearch + Kibana

Elasticsearch and Kibana are embeded in a same docker image. A base docker image can be build from folder 'elasticsearch-base'.
You can create child image from this base : on build it, elasticsearch and mapping configuration can be override : An example is give to you in folder 'elasticsearch-prod'.


### Kibana

In same order of elasticsearch and kibana is embedded in docker image. Also you have to build logstash image from 'logstash-base' image : an example of image based from base is give to you in folder 'logstash-prod'

### Simple supervise java application

A simple example of java application to supervise is in 'java-app-example'. Log and metrics are generated with 'logback' logger. You can find logback configuration on '/src/main/resources/'.

### Process to run it

All steps are details in 'README' at image root folder
    * build jvm image
    * build elasticsearch-base image
    * build elasticsearch-prod image
    * build logstash-base image
    * build logstash-prod image
    * launch java application