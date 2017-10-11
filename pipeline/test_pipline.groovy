#!groovy
@Library('helloworld@master') _

def hw = new org.helloworld.test.Hello();

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
              script
              {
                hw.SayHello();
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
