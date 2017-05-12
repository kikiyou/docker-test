#!/bin/bash
/usr/sbin/sshd -D &
/usr/sbin/rsyslogd
/opt/fonsview/NE/apigw/bin/restart.sh && tail -f /opt/fonsview/NE/apigw/log/apigw.log