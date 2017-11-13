### Trial PSA

This is a trial backend app to understand how in-house concourse works in PSA and identify
all the external dependencies we need in order to do a proper deploy

### Steps to deploy

* Update pipeline if concourse pipeline config changes
* Push most recent code to gogs


### Steps before VPN gets approved
* Sync from dropbox
* Update git remote to gogs remote

### Useful references
* [Artifactory with concourse](https://github.com/pivotalservices/concourse-pipeline-samples/tree/master/artifactory-integration)
* [Concourse with maven cf](https://github.com/patrickcrocker/concourse-maven-cf-simple/blob/master/pipeline.yml)
