node{
stage('SCM Checkout'){
git "https://github.com/ShanteshSindgi/MyWebApp.git"
}
stage('Compile-Package-create-war-file'){
def mvnHome = tool name: 'maven 3.6.3', type: 'maven'
bat "${mvnHome}/bin/mvn package"
}
stage('Deploy to Tomcat'){
deploy adapters: [tomcat9(credentialsId: '013f1857-f9c5-4f75-8bd1-dc2d2150459c', path: '', url: 'http://localhost:9090/')], contextPath: 'MyWebApp', war: '**/*.war'}
}
