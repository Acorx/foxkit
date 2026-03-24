#!/bin/sh
# Gradle wrapper stub - downloads and runs real Gradle
GRADLE_VERSION=8.5
GRADLE_HOME="${HOME}/.gradle/wrapper/dists/gradle-${GRADLE_VERSION}-bin"
GRADLE_URL="https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip"

if [ ! -d "${GRADLE_HOME}" ]; then
    mkdir -p "${GRADLE_HOME}"
    echo "Downloading Gradle ${GRADLE_VERSION}..."
    curl -sL "${GRADLE_URL}" -o /tmp/gradle.zip
    unzip -qo /tmp/gradle.zip -d "${GRADLE_HOME}/.."
    rm /tmp/gradle.zip
fi

exec "${GRADLE_HOME}/gradle-${GRADLE_VERSION}/bin/gradle" "$@"
