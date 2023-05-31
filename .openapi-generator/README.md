# OpenAPI Generator Notes

We use the [OpenAPI Generator](https://openapi-generator.tech/) with the [java generator](https://openapi-generator.tech/docs/generators/java) to generate the code in this repository.

See the [CONTRIBUTING](/CONTRIBUTING.md) guide for details about how to regenerate this SDK from the latest API spec.

## Template Customizations

We have updated the mustache templates for the java generator in order to suppress client side validation that 
does not allow additional optional properties to be added to API responses.

This process was performed by following [this guide](https://openapi-generator.tech/docs/templating/#modifying-templates)
and using [this script](/scripts/export-templates.sh) to export all templates to the `/.openapi-generator/templates` folder.

Customized mustache templates can be included in the `/.openapi-generator/templates` folder will be merged 
with and override the default templates included with the java plugin.

## Updating the OpenAPI Generator Version

The version of the open api generator Docker image has been pinned in the script [generate-sdk.sh](/scripts/generate-sdk.sh).
This is necessary to avoid version differences between developers based on when they last pulled the `latest` image.

When we wish to upgrade the version of the OpenAPI Generator, simply update the pinned Docker image versions in the scripts
and regenerate the SDK.

You should also do some due diligence to ensure there are no breaking changes with any customized mustache templates.
You can check this after applying the update by exporting all the latest mustache templates using the script [export-templates.sh](/scripts/export-templates.sh)
and compare the latest exported files against the customized templates.