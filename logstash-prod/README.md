
## Build
docker build -t myrepo/logstash-prod:1.4.2 .

## Run
docker run -d -v /path/to/log/:/var/logstash/log/ myrepo/logstash-prod:1.4.2
