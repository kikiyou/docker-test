# This dockerfile uses the centos:7.1.1503 image.
# VERSION 1
# Author: walker
# Command format: Instruction [arguments / command] ..

FROM centos7.1-v1

MAINTAINER walker walker@fonsview.com

ENV version 743

ADD Fonsview.APIGW_R1.0.0_$version.tar.gz /tmp/
RUN cd /tmp/Fonsview.APIGW_R1.0.0_$version && sh install.sh

ADD run.sh /
ENTRYPOINT sh /run.sh

EXPOSE 22 80
