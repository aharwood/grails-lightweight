We currently aren't planning on publishing public artifacts for this plugin.
Below are instructions for how to publish your own internal version to a Maven-compatible repository.

# One-time setup

1. If it doesn't already exist, create a Grails settings file in your user home directory; on Unix-compatible platforms this is often `~/.grails/settings.groovy`
2. Edit the settings file to add an entry similar to `grails.project.repos.myRepo.url = "http://localhost:8081/repos"`
3. If your repository requires authentication to publish, add entries to specify the credentials, such as `grails.project.repos.myRepo.username = "admin"` and `grails.project.repos.myRepo.password = "password"`
4. (optional) Add an entry similar to `grails.project.repos.default = "myRepo"`; if you do this, you can omit the `--repository=myRepo` argument when running `maven-deploy`

For further details on this configuration, see [the grails-release documentation](http://grails-plugins.github.io/grails-release/docs/manual/guide/configuration.html).

# Each release

1. Update `LightweightDeployGrailsPlugin.groovy` to remove "-SNAPSHOT" from the version
2. Update `CHANGES.md`
3. Commit the change and tag it with the version (don't push yet)
4. `./grailsw clean && ./grailsw refresh-dependencies && ./grailsw test-app && ./grailsw maven-deploy --repository=myRepo`
5. Update `LightweightDeployGrailsPlugin.groovy` to increment the version and add "-SNAPSHOT"
6. Commit the change and push.

For further information, see [the documentation for grails maven-deploy](http://grails-plugins.github.io/grails-release/docs/manual/ref/Command%20Line/maven-deploy.html).
