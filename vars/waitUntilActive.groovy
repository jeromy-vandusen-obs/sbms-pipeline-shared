boolean call(String host, String port, int pingInterval, int maxPings) {
    for (int index = 0; index < maxPings; index ++) {
        sh "curl -s http://$host:$port/dependencyHealth | python -c \"import sys, json; print json.load(sys.stdin)['overallStatus']\" > status.txt || true"
        String status = readFile('status.txt').trim()
        if (status == 'UP') {
            return true
        }
        else {
            sh "sleep $pingInterval"
        }
    }
    return false
}
