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
		cloudBeesFlowPublishArtifact artifactName: 'com.demo:helloworld', artifactVersion: '1.0', configuration: 'flow-forrester', filePath: 'target/helloworld-1.0-SNAPSHOT.jar', repositoryName: 'default'
   }
   stage('Results') {
       step([$class: 'ElectricFlowPipelinePublisher',
           configuration: 'flow-forrester',
           projectName  : 'Test',
           pipelineName : 'Test Pipeline'
       ])
   }
}