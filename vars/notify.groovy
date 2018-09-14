def call(String message, String type) {
    String icon = ''
    if (type == 'INFO') {
        icon = ':information_source:'
    }
    else if (type == 'WARN') {
        icon = ':warning:'
    }
    else if (type == 'FAIL') {
        icon = ':fire:'
    }
    else if (type == 'PROD_SUCCESS') {
        icon = ':trophy:'
    }
    else if (type == 'PROD_INFO') {
        icon = ':lightning:'
    }
    else if (type == 'PROD_WARN') {
        icon = ':rotating_light:'
    }
    else if (type == 'PROD_FAIL') {
        icon = ':boom:'
    }
    slackSend "<${env.BUILD_URL}|${env.JOB_NAME} #${env.BUILD_NUMBER}>: ${icon} ${message}"
}
