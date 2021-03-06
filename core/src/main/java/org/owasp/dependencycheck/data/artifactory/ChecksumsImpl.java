package org.owasp.dependencycheck.data.artifactory;

/**
 * Copied from JFrog's artifactory client.
 *
 * @see
 * <a href="https://github.com/jfrog/artifactory-client-java">artifactory-client-java</a>
 *
 * @author jbaruch
 * @since 29/07/12
 */
public class ChecksumsImpl {

    private String md5;
    private String sha1;
    private String sha256;

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

}
