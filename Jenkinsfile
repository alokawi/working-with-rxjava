pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        sh 'echo "Hello Step1"'
        sh 'which java'
      }
    }
    stage('Stage 2') {
      steps {
        echo 'Step 2'
      }
    }
  }
}