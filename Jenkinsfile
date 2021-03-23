node{
stage('SCM Checkout'){
git 'https://github.com/ShanteshSindgi/MyWebApp.git'
}
stage('Compile-Package-create-war-file'){
def mvnHome = tool name: 'maven 3.6.3', type: 'maven'
bat "${mvnHome}/bin/mvn package"
}
stage('Deploy to Tomcat'){
deploy adapters: [tomcat9(credentialsId: 'b34b9fc2-9bba-4ca3-b4ec-bf2577f6b561', path: '', url: 'http://localhost:9090/')], contextPath: 'MyWebApp', onFailure: false, war: '**/*.war'
}
}
