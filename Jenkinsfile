pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        sh 'echo "Hello Step1"'
        sh 'which java'
        sleep 5
      }
    }
    stage('Stage 2') {
      steps {
        echo 'Step 2'
      }
    }
  }
}