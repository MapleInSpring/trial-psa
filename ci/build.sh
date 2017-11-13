#!/bin/bash

set -e -u -x

cd trial-psa/
./gradlew build

pwd

ls

ls build/
ls build/libs

cp build/libs/trial-0.0.1-SNAPSHOT.jar ../build-src/.

ls ../build-src
