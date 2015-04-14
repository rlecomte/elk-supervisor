FROM tortax/java8jre:jre8u31

ENV LOGSTASH_VERSION 1.4.2

RUN wget --no-check-certificate http://download.elasticsearch.org/logstash/logstash/logstash-${LOGSTASH_VERSION}.tar.gz && \
    tar -xzf logstash-${LOGSTASH_VERSION}.tar.gz -C /opt/ && \
    mv /opt/logstash-${LOGSTASH_VERSION} /opt/logstash && \
    rm logstash-${LOGSTASH_VERSION}.tar.gz

VOLUME ["/var/log/lo_docker"]

ADD export_metrics.conf /data/logstash/resources/export_metrics.conf

ADD service/ /etc/sv/
RUN chmod +x /etc/sv/*/run