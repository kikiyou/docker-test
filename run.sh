#!/bin/bash
SCRIPT=$(readlink -f $0)
SCRIPTPATH=$(dirname $SCRIPT)

base_path="/usr/local/cluster"
db_path=$base_path/mongodb
instance_path=$base_path/instance1
bind_ip="0.0.0.0"
port="27017"

# only usable for root
[ $EUID = 0 ] || exit 4

if [ ! -f "$instance_path/mongod.conf" ]; then
  mkdir -p $instance_path/{db,logs}

# -- create_config --
cat > $instance_path/mongod.conf << eof
systemLog:
    quiet: false
    path: $instance_path/logs/mongod.log
    logAppend: true
    destination: file
processManagement:
    fork: false
    pidFilePath: /var/run/mongod.pid
net:
    bindIp: $bind_ip
    port: $port
    maxIncomingConnections: 65536
    wireObjectCheck: true
    ipv6: false
storage:
    dbPath: $instance_path/db
    indexBuildRetry: true
    journal:
        enabled: true
        commitIntervalMs: 100
    directoryPerDB: false
    engine: wiredTiger
    syncPeriodSecs: 60
    wiredTiger:
        engineConfig:
            cacheSizeGB: 2
            journalCompressor: snappy
            directoryForIndexes: false
        collectionConfig:
            blockCompressor: snappy
        indexConfig:
            prefixCompression: true
operationProfiling:
    slowOpThresholdMs: 100
    mode: off
eof

fi

ulimit -f unlimited
ulimit -t unlimited
ulimit -v unlimited
ulimit -n 64000
ulimit -m unlimited
ulimit -u 64000
#echo never >  /sys/kernel/mm/transparent_hugepage/enabled
#echo never > /sys/kernel/mm/transparent_hugepage/defrag
$db_path/bin/mongod --config $instance_path/mongod.conf



