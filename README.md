# migratorydata-plugin-audit-log4j
MigratoryData Example Audit Plugin Using Log4j

In order to compile this example audit extension, run:

    $ ./gradlew build

Deploy the audit extension jar from `extensions/audit.jar` compiled using the command above as well as the configuration
file `extensions/log4j2.xml` to the folder `extenstions` of your MigratoryData server installation and restart the 
MigratoryData server. See the Installation Guide to learn where is the location of this extensions folder.
