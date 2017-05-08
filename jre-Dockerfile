# VERSION 1
# Command format: Instruction [arguments / command] ..

FROM monkey.rhel.cc/library/centos7.1-v1

MAINTAINER monkey monkey@fonsview.com

ENV MONGODB_VERSION=3.2.10 \
    TERM=xterm

COPY mongodb-linux-x86_64-rhel70-$MONGODB_VERSION.tgz ./
RUN rm -f /etc/localtime && ln -s /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && mkdir -p /usr/local/cluster \
    && tar -xzf mongodb-linux-x86_64-rhel70-$MONGODB_VERSION.tgz \
    && mv mongodb-linux-x86_64-rhel70-$MONGODB_VERSION  /usr/local/cluster/mongodb \
    && echo "MONGOD_HOME=/usr/local/cluster/mongodb" > /etc/profile.d/mongod.sh \
    && echo "export PATH=\$PATH:/usr/local/cluster/mongodb/bin" >> /etc/profile.d/mongod.shi \
    && rm -f mongodb-linux-x86_64-rhel70-$MONGODB_VERSION.tgz

EXPOSE 27017
VOLUME /usr/local/cluster/instance1
ADD run.sh /run.sh

ENTRYPOINT /run.sh