registry_server = "http://monkey.rhel.cc"
git_repo = "http://github.com/kikiyou/docker-test"
MAINTAINER = "monkey"

mongodb {
    base_image = 'library/centos7.1-v1'
    image_name = 'library/mongodb'
    build_file = 'mongodb-linux-x86_64-rhel70-3.2.10.tgz'
    app_version = '3.2.10'
    build_version = '743'
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/MONGODB'
}

apigw {
    base_image = 'library/centos7.1-v1'
    image_name = 'library/apigw'
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
    build_file = ['epg':'Fonsview.epg_server_R1.0.0_872.tar.gz']
    build_version = '872'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/EPG_SERVER'
}

epg {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-epg_server'
    build_file = ['epg':'Fonsview.epg_server_R1.0.0_872.tar.gz']
    build_version = '872'
    app_version = build_version
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/EPG_SERVER'
}

desktop {
    base_image = 'library/centos7.1-v1-tomcat-apr-ssl'
    image_name = 'library/centos7.1-v1-desktop'
    build_file = ['desktop':'Fonsview.DESKTOP_R1.0.0_783.tar.gz']
    build_version = '783'
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