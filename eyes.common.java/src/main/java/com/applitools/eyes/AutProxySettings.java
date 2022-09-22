package com.applitools.eyes;

public class AutProxySettings extends AbstractAutProxySettings {

    public AutProxySettings(AbstractProxySettings proxySettings) {
        super(proxySettings);
    }

    public AutProxySettings(AbstractProxySettings proxySettings, String[] domains) {
        super(proxySettings, domains);
    }

    public AutProxySettings(AbstractProxySettings proxySettings, String[] domains, AutProxyMode autProxyMode) {
        super(proxySettings, domains, autProxyMode);
    }
}
