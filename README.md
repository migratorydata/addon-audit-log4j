# Audit log4j add-on

This MigratoryData add-on allows you to log various classes of events using the log4j framework such as:
* Access events
* Message events 
* Cache events 
* Stats events 

### Enabling the add-on

This add-on is preinstalled in the MigratoryData server under the following folder,
according to the package type used to install the MigratoryData server:

| Location                                       | Package type                         |
|------------------------------------------------|--------------------------------------|
| `addons/audit-log4j`                           | Platform-independent tarball package |
| `/usr/share/migratorydata/addons/audit-log4j`  | `RPM` or `DEB` Linux package         |

Its default configuration is available under the following folder:

| Location                                    | Package type                         |
|---------------------------------------------|--------------------------------------|
| `addons/audit-log4j`                        | Platform-independent tarball package |
| `/etc/migratorydata/addons/audit-log4j`     | `RPM` or `DEB` Linux package         |

The add-on is automatically enabled if at least one or more of the following parameters of the MigratoryData server are set on `log4j`:
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditaccess">Extension.Audit.Access</a>
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditmessage">Extension.Audit.Message</a>
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditcache">Extension.Audit.Cache</a>
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditstats">Extension.Audit.Stats</a>

### Modifying the add-on

You can modify the source code of this add-on to fit your needs. The add-on is build with MigratoryData's <a target="_blank" href="https://mvnrepository.com/artifact/com.migratorydata/server-extensions-api">Server Extensions API</a>.

#### Getting the code and building

You can use the following commands to get and build the add-on:

```bash
$ git clone https://github.com/migratorydata/addon-audit-log4j.git
$ cd addon-audit-log4j
$ ./gradlew clean build copyJar
```

#### Deploying the modified add-on

1. Copy the modified add-on from `addon-audit-log4j/extensions/audit.jar` to the following location of your MigratoryData server installation:

| Location                          | Package type                         |
|-----------------------------------|--------------------------------------|
| `extensions/`                     | Platform-independent tarball package |
| `/usr/share/migratorydata/extensions/`  | `RPM` or `DEB` Linux package         |

2. Set on `true` (rather than on `log4j`) one or more of the following paramters:

* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditaccess">Extension.Audit.Access</a>
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditmessage">Extension.Audit.Message</a>
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditcache">Extension.Audit.Cache</a>
* <a target="_blank" href="https://migratorydata.com/docs/migratorydata/configuration/advanced-paramters/#extensionauditstats">Extension.Audit.Stats</a>


> **Note &mdash;**
> It is not necessary to delete the log4j add-on `audit.jar` made available under the folder `addons`. The custom audit extension 
> `audit.jar` from the folder `extensions` is automatically loaded when setting one or more of the above parameters on `true` (rather than on `log4j`). Note also that the name of the extension `audit.jar` is fixed, it cannot be changed in order to be loaded by the MigratoryData server. 

3. Finally, restart your MigratoryData server in order to reload the audit add-on.
