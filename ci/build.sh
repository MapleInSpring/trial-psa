#!/bin/bash

set -e -u -x

cd trial-psa/

export BUILD_VERSION=0.0.3-SNAPSHOT

./gradlew bootRepackage

cp build/libs/*.jar ../build-src/.

ls ../build-src
