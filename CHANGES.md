# Pending Release

# 0.14.0

* First release after CommerceHub fork
* Changes since Wotif version 0.13.1:
    * Add ThreadNameFilter from Dropwizard
    * Enhance request correlation filter
    * Handle broken X-Forwarded-For case
    * Add support for multiple log appenders
        * New configuration required
    * Extend logging to support filtered appenders
    * Add cookie logging
    * Add startup and shutdown logger
    * Updated Jetty configuration to also gzip svg
    * Update to support gzip in same way as DropWizard
    * Restrict internal servlets to only the internal connectors
    * Add support for specifying the external context path
        * Launcher `createInternalContext` and `createExternalContext` signatures changed to add parameters
    * Improve handling of Launcher failures
    * Fix HealthCheckUtil/MetricsUtil's support for environments other than test and production
    * Add support for rolling log files
