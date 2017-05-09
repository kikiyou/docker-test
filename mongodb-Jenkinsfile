node("master") {
    def build_file = 'mongodb-linux-x86_64-rhel70-3.2.10.tgz'
    def build_version = '3.2.10'
    def build_file_path = '"/home/monkey/it-fs/Upload/SS Department/monkey/mongodb"'

    stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'http://github.com/kikiyou/docker-test'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      sh "ls -l"
      sh "rsync -av ${build_file_path}/${build_file} ."
   }

    docker.withRegistry('http://monkey.rhel.cc', 'docker-registry') {
    
        stage "build"
        def app = docker.build("library/mongodb:latest","--file ./mongodb-Dockerfile --tag library/mongodb:${build_version} .")

        stage "publish"
        app.push 'latest'
        app.push "${build_version}"
    }
}
