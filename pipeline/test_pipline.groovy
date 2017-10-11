#!groovy
@Library('helloworld@master') _


pipeline
{
    agent
    {
        node any
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
