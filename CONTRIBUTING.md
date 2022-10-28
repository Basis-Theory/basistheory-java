# Contributing

## Prerequisites

First ensure you have the JDK installed:

```shell
brew install openjdk@17
```

### Build the SDK and Install Dependencies

```shell
./gradlew build
```

## Updating the SDK

Download the latest API schema to `./swagger.json` from `https://api.basistheory.com/swagger/v1/swagger.json`,
which can be done manually or with the command:

```shell
make update-api-spec
```

Once the latest api spec has been downloaded locally, you must regenerate the SDK using the open api generator,
which can be done with the command:

```shell
make generate-sdk
```

## Running tests

```shell
make verify
```