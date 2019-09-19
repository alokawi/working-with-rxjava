pipeline {
  agent any
  stages {
    stage('Stage 1') {
      parallel {
        stage('Stage 1') {
          steps {
            sh 'echo "Hello Step1"'
            sh 'which java'
            sleep 5
          }
        }
        stage('Stage 1.2') {
          steps {
            sh 'which python'
          }
        }
        stage('Stage 1.3') {
          steps {
            sh 'exit 1'
          }
        }
      }
    }
    stage('Stage 2') {
      steps {
        echo 'Step 2'
      }
    }
  }
}