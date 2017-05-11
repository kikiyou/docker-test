registry_server = "http://monkey.rhel.cc"
mongodb {
    image_name = 'library/mongodb'
    build_file = 'Fonsview.APIGW_R1.0.0_743.tar.gz'
    build_version = '743'
    build_file_path = '/home/monkey/it-fs/Upload/SS Department/monkey/mongodb'
}

apigw {
    image_name = 'library/apigw'
    build_file = 'Fonsview.APIGW_R1.0.0_871.tar.gz'
    build_version = '871'
    build_file_path = '/home/monkey/it-fs/Upload/开放式架构版本/API GW'
}


// website {
//  //default values
//  url = "http://default.mycompany.com"
//  port = 80
//  user = "test"
// }
 
// environments {
//  development {
//   website {
//    url = "http://dev.mycompany.com"
//    port = 8080
//   }
//  }
//  production {
//   website {
//    url = "http://www.mycompany.com"
//    user = "prodUser"
//   }
//  }
// }

// //defaults
// def config = new ConfigSlurper().parse(new File('src/Config3.groovy').toURL())
 
// assert config.website.url=="http://default.mycompany.com"
// assert config.website.port==80
// assert config.website.user=="test"
 
// //development environment
// config = new ConfigSlurper("development").parse(new File('src/Config3.groovy').toURL())
 
// assert config.website.url=="http://dev.mycompany.com"
// assert config.website.port==8080
// assert config.website.user=="test"
 
// //production environment
// config = new ConfigSlurper("production").parse(new File('src/Config3.groovy').toURL())
 
// assert config.website.url=="http://www.mycompany.com"
// assert config.website.port==80
// assert config.website.user=="prodUser"