FROM tortax/java8jre:jre8u45

# Version
ENV LOGSTASH_VERSION 1.4.2

# Install logstash
RUN wget --no-check-certificate http://download.elasticsearch.org/logstash/logstash/logstash-${LOGSTASH_VERSION}.tar.gz && \
    tar -xzf logstash-${LOGSTASH_VERSION}.tar.gz -C /opt/ && \
    mv /opt/logstash-${LOGSTASH_VERSION} /opt/logstash && \
    rm logstash-${LOGSTASH_VERSION}.tar.gz

VOLUME ["/var/logstash/log/"]

ADD config/metrics.conf /etc/logstash/

ADD service/ /etc/service/
