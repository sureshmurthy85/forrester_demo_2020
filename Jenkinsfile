node {
   def mvnHome
   stage('Build') {
      cleanWs()
      git 'https://github.com/sureshmurthy85/forrester_demo_2020.git'
      mvnHome = tool 'mvn'
      withEnv(["MVN_HOME=$mvnHome"]) {
          sh '"$MVN_HOME" install'
      }
   }
   stage('Test') {
       archiveArtifacts 'target/*.jar'
       junit 'target/surefire-reports/*.xml'
   }   
   stage('Publish'){
        cloudBeesFlowCallRestApi body: '', configuration: 'flow-forrester', envVarNameForResult: '', httpMethod: 'DELETE', urlPath: '/artifacts/com.demo:helloworld'
	cloudBeesFlowPublishArtifact artifactName: 'com.demo:helloworld', artifactVersion: '1.0-SNAPSHOT', configuration: 'flow-forrester', filePath: 'target/helloworld-1.0-SNAPSHOT.jar', repositoryName: 'default'
   }
   stage('Results') {
       cloudBeesFlowRunPipeline addParam: '{"pipeline":{"pipelineName":"Deploy Pipeline","parameters":[]}}', configuration: 'flow-forrester', pipelineName: 'Test Pipeline', projectName: 'Test'    
   }
}
