package com.applitools.eyes;

public abstract class AbstractAutProxySettings {

    protected AbstractProxySettings abstractProxySettings;
    protected String[] domains;
    protected AutProxyMode autProxyMode;

    /**
     * Setting a separated proxy for requests made to non-eyes domains.
     * If the AUT proxy is set, it cannot be changed again for those specific requests by any means.
     * If AUT proxy is set to null, there will be no proxy for those specific requests.
     */
    public AbstractAutProxySettings(AbstractProxySettings proxySettings) {
        this(proxySettings, null, null);
    }

    /**
     * Setting a separated proxy for requests made to non-eyes domains. Requests to other non-eyes domains will be sent without a proxy.
     * If the AUT proxy is set, it cannot be changed again for those specific requests by any means.
     * If AUT proxy is set to null, the behavior will be the same as {@link #AbstractAutProxySettings(AbstractProxySettings)}
     */
    public AbstractAutProxySettings(AbstractProxySettings proxySettings, String[] domains) {
        this(proxySettings, domains, AutProxyMode.ALLOW);
    }

    /**
     * Setting a separated proxy for requests sent to the given domains (if mode is {@link AutProxyMode#ALLOW}
     * or for requests sent to domains other than the given domains (if mode is {@link AutProxyMode#BLOCK}.
     * If the AUT proxy is set, it cannot be changed again for those specific requests by any means.
     * If AUT proxy is set to null, the behavior will be the same as {@link #AbstractAutProxySettings(AbstractProxySettings)}
     */
    public AbstractAutProxySettings(AbstractProxySettings proxySettings, String[] domains, AutProxyMode autProxyMode) {
        this.abstractProxySettings = proxySettings;
        this.domains = domains;
        this.autProxyMode = autProxyMode;
    }

    public AbstractProxySettings getProxy() { return this.abstractProxySettings; }

    public String[] getDomains() { return this.domains; }

    public String getAutProxyMode() {
        return this.autProxyMode.getName();
    }
}
