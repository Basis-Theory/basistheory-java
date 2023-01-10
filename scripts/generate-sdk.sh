#!/bin/bash

docker pull openapitools/openapi-generator-cli:v6.2.1
docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli:v6.2.1 generate \
  -i /local/swagger.json \
  -g java \
  -o /local \
  -t /local/.openapi-generator/templates \
  -c /local/openapi-config.yml \
  --remove-operation-id-prefix

cd $(dirname $0)
cd ../
