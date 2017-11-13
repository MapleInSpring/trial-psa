#!/bin/bash

set -e -u -x

cd trial-psa/
./gradlew build

cp build/libs/trial-psa-0.0.1-SNAPSHOT.jar ../build-src/.

ls ../build-src
