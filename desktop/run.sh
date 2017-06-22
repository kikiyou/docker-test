#!/bin/bash
/opt/fonsview/3RD/tomcat7.0.63/bin/catalina.sh start
ln -sf /dev/stdout  /opt/fonsview/NE/*/log/*.log
/usr/sbin/sshd -D 