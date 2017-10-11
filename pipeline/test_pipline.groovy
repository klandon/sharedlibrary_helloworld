#!groovy
@Library('helloworld@master') _


def hw = new org.helloworld.test.Hello("some message")

pipeline
{
    agent
    {
        node 'master'
    }


    parameters
    {
        string(name: 'LoggingBucket', defaultValue: 'ln-app-jenkins.dev/logs', description: 'bucket to store logs')
    }

    options
    {
      buildDiscarder(logRotator(numToKeepStr: '30'))
    }

    stages{
        stage('Test hello world')
        {
          steps
            {
              script
              {
                println(hw.messageToSay);
                println(env.BUILD_URL);
              }
            }
        }

}

post{
    always
        {
            deleteDir();
        }
    }

}
