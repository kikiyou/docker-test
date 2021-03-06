registry_server = "http://172.16.18.5:30088"
git_repo = "http://github.com/kikiyou/docker-test"
MAINTAINER = "monkey"

mongodb {
    base_image = 'library/centos7.1-v1'
    image_name = 'library/centos7.1-v1-mongodb'
    build_file = 'mongodb-linux-x86_64-rhel70-3.2.10.tgz'
    app_version = '3.2.10'
    build_version = '743'
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/MONGODB'
}

apigw {
    base_image = 'library/centos7.1-v1'
    image_name = 'library/centos7.1-v1-apigw'
    build_file = 'Fonsview.APIGW_R1.0.0_871.tar.gz'
    build_version = '871'
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/API GW'
}

javabase {
    base_image = 'library/centos7.1-v1'
    image_name = 'library/centos7.1-v1-tomcat-apr-ssl'
    build_file = ['jdk':'Fonsview.3rd_party_jdk_1.8.tar.gz','tomcat':'Fonsview.tomcat_7.0.63_50464.tar.gz','apr-devel':'apr-devel-1.4.8-3.el7.x86_64.rpm','openssl':'openssl-1.0.1v-dev.el7.x86_64.tar.gz']
    build_version = '7.0.63'
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/JAVABASE'
}

epg {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-epg_server'
    build_file = ['epg':'Fonsview.epg_server_R1.0.0_877.tar.gz']
    build_version = '877'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/EPG_SERVER'
}

desktop {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-desktop'
    build_file = ['desktop':'Fonsview.DESKTOP_R1.0.0_905.tar.gz']
    build_version = '905'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/DESKTOP'
}

favorite {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-favorite'
    build_file = ['favorite':'Fonsview.favorite_R1.0.0_787.tar.gz']
    build_version = '787'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/FAVORITE'
}

ms {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-ms'
    build_file = ['ms':'Fonsview.MS_R1.0.0_833.tar.gz']
    build_version = '833'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/MS'
}

mss {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-mss'
    build_file = ['mss':'Fonsview.MSS_R1.0.0_791.tar.gz']
    build_version = '791'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/MSS'
}

rss {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-rss'
    build_file = ['rss':'Fonsview.rss_R1.0.0_782.tar.gz']
    build_version = '782'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/RSS'
}

search {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-search'
    build_file = ['search':'Fonsview.search_R1.0.0_787.tar.gz']
    build_version = '787'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/SEARCH'
}

stats {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-stats'
    build_file = ['stats':'Fonsview.stats_R1.0.0_787.tar.gz']
    build_version = '787'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/STATS'
}

authen {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-authen'
    build_file = ['authen':'Fonsview.AUTHEN_R1.0.0_864.tar.gz']
    build_version = '864'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/AUTHEN'
}

apigwui {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-apigwui'
    build_file = ['apigwui':'Fonsview.apigwui_R1.0.0_v2.tar.gz']
    build_version = 'v2'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/MONITOR'
}

wth {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-wth'
    build_file = ['wth':'Fonsview.WTH_R1.0.0_789.tar.gz']
    build_version = '789'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/WTH'
}

aaa {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-aaa'
    build_file = ['aaa':'Fonsview.aaa_r3.0.0_51956.tar.gz']
    build_version = '51956'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/AAA'
}