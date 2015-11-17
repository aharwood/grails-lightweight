class LightweightDeployGrailsPlugin {
    def groupId = "com.commercehub.grails.plugins"
    def version = "0.15.0-SNAPSHOT"
    def grailsVersion = "2.0 > *"

    def title = "Lightweight Deploy Plugin"
    def description = '''\
This plugin is intended to produce a lightweight, deployable grails application. It embeds jetty, and uses a number of
the conventions from Dropwizard that make sense.
This plugin uses some code from both the standalone plugin by Burt Beckwith and Dropwizard by Codahale.
'''

    def documentation = "https://github.com/commercehub-oss/grails-lightweight-deploy/"

    def license = "APACHE"
    def organization = [ name: "CommerceHub", url: "http://www.commercehub.com/" ]
    def developers = [
        [ name: "David Carr", email: "dcarr@commercehub.com" ],
    ]

    def issueManagement = [ system: "github", url: "https://github.com/commercehub-oss/grails-lightweight-deploy/" ]

    def scm = [ url: "https://github.com/commercehub-oss/grails-lightweight-deploy.git" ]

}
