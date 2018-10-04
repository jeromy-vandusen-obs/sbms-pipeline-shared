def call(String imageName, String sourceImageTag, String imageTag, String registryCredentialsId = 'DOCKER_HUB_CREDENTIALS', String registryUrl = '') {
    sh "docker tag $imageName:$sourceImageTag $imageName:$imageTag"
    withDockerRegistry([url: registryUrl, credentialsId: registryCredentialsId]) {
        sh "docker push $imageName:$imageTag"
    }
}
