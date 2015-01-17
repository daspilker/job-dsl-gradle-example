import org.kohsuke.github.GitHub

def gh = GitHub.connectAnonymously()
def org = gh.getOrganization('jenkinsci')
org.listRepositories().each {
  println it.name
}

