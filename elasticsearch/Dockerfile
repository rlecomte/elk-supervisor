FROM tortax/java8jre:jre8u45

#version
ENV ELASTICSEARCH_VERSION 1.4.4
ENV KIBANA_VERSION 4.0.0

# Install elasticsearch
RUN wget --no-check-certificate http://download.elasticsearch.org/elasticsearch/elasticsearch/elasticsearch-${ELASTICSEARCH_VERSION}.tar.gz && \
	tar -zxf elasticsearch-${ELASTICSEARCH_VERSION}.tar.gz && \
	rm -Rf elasticsearch-${ELASTICSEARCH_VERSION}.tar.gz && \
	mv elasticsearch-${ELASTICSEARCH_VERSION} /home/elasticsearch

# Install head plugin
RUN /home/elasticsearch/bin/plugin --install mobz/elasticsearch-head

# Configure
ADD config/elasticsearch.yml /home/elasticsearch/config/elasticsearch.yml
ADD config/mappings/* /home/elasticsearch/config/_default/

# Install Kibana
RUN wget --no-check-certificate http://download.elasticsearch.org/kibana/kibana/kibana-${KIBANA_VERSION}-linux-x64.tar.gz && \
	tar -zxf kibana-${KIBANA_VERSION}-linux-x64.tar.gz -C /home && \
	mv /home/kibana-${KIBANA_VERSION}-linux-x64 /home/kibana && \
	rm -Rf kibana-${KIBANA_VERSION}-linux-x64.tar.gz

# Install Services
ADD service/ /etc/service/

VOLUME ["/elasticsearch/data", "/elasticsearch/logs"]
EXPOSE 9200 9300 5601