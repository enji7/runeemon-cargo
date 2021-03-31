# runEEmon (Cargo Edition)

runEEmon (Cargo Edition) is a simple showcase for downloading, installing, deploying, running, and testing the following [Jakarta EE](https://jakarta.ee) and [MicroProfile](https://microprofile.io) runtimes (aka application servers):

 * [Wildfly](https://www.wildfly.org/)
 * [Payara](https://www.payara.fish/)
 * [TomEE](https://tomee.apache.org/)
 * [OpenLiberty](https://openliberty.io/)

According to the [OmniFaces Jakarta EE Survey 2020/2021](https://arjan-tijms.omnifaces.org/2021/02/jakarta-ee-survey-20202021-results.html), these are among the most widely used, freely available application servers.

Under the hood, it is powered by the [https://codehaus-cargo.github.io/cargo/Maven+3+Plugin.html Codehaus Cargo] plugin for Maven. Additional runtimes can be configured by extending the POM file, which also contains the current runtime versions.

The original [https://github.com/enji7/runeemon runEEmon] is a standalone Java command line tool.

*Gotta run 'em all!*

## Usage

Download, extract and run WildFly, and also deploy and test the simple "ping" application that is included in this project: 

 * `mvn verify -Pwildfly`

Likewise for the other application servers:

 * `mvn verify -Ppayara`
 * `mvn verify -Ptomee`
 * `mvn verify -Popenliberty`

To be able to perform manual tests after this command, add `cargo:run` after the `verify` goal, which keeps the container alive until you press CTRL-C in your console. The "ping" application responds to the following HTTP GET invocation: `http://localhost:8080/ping/ping`

To clean the project (including runtime downloads and extractions), use the `clean` goal in addition to or instead of `verify`.

## Directory Structure

| Directory | Content |
| --- | --- |
| target/nest | downloaded runtime zips (initially empty) |
| target/zoo | extracted runtimes (initially empty) |

These directories can be configured inside this project's POM file.

## Related Projects

If you like this simplistic showcase, you might also be interested in the following projects:

 * [Starter for Jakarta EE](https://start.jakarta.ee/): Generator for Jakarta EE projects.
 * [Jakarta EE 8 Starter Boilerplate](https://github.com/hantsy/jakartaee8-starter-boilerplate): Boilerplate project for bootstrapping new Jakarta EE 8 applications.
 * [runEEmon](https://github.com/enji7/runeemon): Original version of runEEmon, without Cargo.

## Known 'Issues'

The following are just minor observations / issues:

 * Adding 'cargo:run' to the invocation does not keep the previously started container alive, but starts a new one after the integration tests.
 * Shutting down with CTRL-C, but also results in the output "No domains are currently running" for Payara.
 * The names of the extracted directories are not customizable.
 * Wildfly and TomEE are extracted into a deeper, redundant subdirectory.

## FAQ

### How to pronounce runEEmon?

Like "runny mon", rhymes with "funny don".

### How can I express my runEEmon-induced euphoria?

Clicking the *Star* button in the upper right corner would be very much appreciated. And if you like my [blog](https://enji.systems), you can follow me on [Twitter](https://twitter.com/EnjiSystems).
 