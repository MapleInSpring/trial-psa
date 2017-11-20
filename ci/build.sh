#!/bin/bash

set -e -u -x

cd trial-psa/

cat resource-version/number

export BUILD_VERSION=$(cat resource-version/number)

./gradlew bootRepackage

cp build/libs/*.jar ../build-src/.

ls ../build-src
