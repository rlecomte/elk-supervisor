
## Build
docker build -t myrepo/elasticsearch-prod:1.4.4 .

## Run
docker run -d -v /path/elasticsearch/logs/:/elasticsearch/logs/ -v /path/elasticsearch/data/:/elasticsearch/data/ -p 9200:9200 -p 9300:9300 -p 5601:5601 myrepo/elasticsearch-prod:1.4.4

**Launch Kibana UI :**

	http://localhost:5601/

**Launch Elasticsearch UI :**

	http://localhost:9200/_plugin/head/
	http://localhost:9200/_nodes