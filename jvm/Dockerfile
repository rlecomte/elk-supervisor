FROM phusion/baseimage:0.9.16

# Use baseimage-docker's init system.
CMD ["/sbin/my_init"]

RUN apt-get update

# https://github.com/phusion/baseimage-docker/issues/58
ENV DEBIAN_FRONTEND noninteractive


ENV JAVA_VERSION 8u45
ENV ORACLE_BUILD_VERSION b14

# Install wget
RUN apt-get install -y wget

# Download jre and create symbolic path
RUN cd /opt/ &&\
        wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/$JAVA_VERSION-$ORACLE_BUILD_VERSION/jre-$JAVA_VERSION-linux-x64.tar.gz &&\
        tar -xzf jre-$JAVA_VERSION-linux-x64.tar.gz &&\
        rm jre-$JAVA_VERSION-linux-x64.tar.gz &&\
        mv $(ls | grep jre | head -1) java

#create java env. var.
ENV JAVA_HOME /opt/java/

# Clean up APT when done.
RUN apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*