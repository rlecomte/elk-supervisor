
## Build
docker build -t tortax/logstash-prod:1.4.2 .

## Run
docker run -d -v /path/to/log/:/var/logstash/log/ tortax/logstash-prod:1.4.2
