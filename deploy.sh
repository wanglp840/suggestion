#!/bin/bash
mvn clean 
mvn clean package -Dmaven.test.skip=true
scp -r target/Suggestion-1.0-SNAPSHOT/* root@120.27.32.126:/leave/suggestion/deploy/web_tmp/

