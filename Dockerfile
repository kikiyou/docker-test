# VERSION 1
# Command format: Instruction [arguments / command] ..

FROM centos

MAINTAINER walker monkey@fonsview.com

ENV MONGODB_VERSION=3.2.10 \
    TERM=xterm

ADD run.sh /run.sh

ENTRYPOINT /run.sh
