#!/bin/bash

docker pull openapitools/openapi-generator-cli:v6.2.1
docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli:v6.2.1 author template \
  -g java \
  -o /local/.openapi-generator/templates \

cd $(dirname $0)
cd ../
