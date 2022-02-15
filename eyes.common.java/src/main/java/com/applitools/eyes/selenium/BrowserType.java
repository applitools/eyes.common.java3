package com.applitools.eyes.selenium;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BrowserType {
    CHROME("chrome"),
    CHROME_ONE_VERSION_BACK("chrome-one-version-back"),
    CHROME_TWO_VERSIONS_BACK("chrome-two-versions-back"),
    FIREFOX("firefox"),
    FIREFOX_ONE_VERSION_BACK("firefox-one-version-back"),
    FIREFOX_TWO_VERSIONS_BACK("firefox-two-versions-back"),
    SAFARI("safari"),
    SAFARI_ONE_VERSION_BACK("safari-one-version-back"),
    SAFARI_TWO_VERSIONS_BACK("safari-two-versions-back"),
    SAFARI_EARLY_ACCESS("safari-earlyaccess"),
    IE_10("ie10"),
    IE_11("ie11"),

    /**
     * @deprecated The 'EDGE' option that is being used in your browsers' configuration will soon be deprecated.
     * Please change it to either "EDGE_LEGACY" for the legacy version or to "EDGE_CHROMIUM" for the new
     * Chromium-based version.
     */
    EDGE("edge"),

    EDGE_LEGACY("edgelegacy"),
    EDGE_CHROMIUM("edgechromium"),
    EDGE_CHROMIUM_ONE_VERSION_BACK("edgechromium-one-version-back"),
    EDGE_CHROMIUM_TWO_VERSIONS_BACK("edgechromium-two-versions-back");

    private final String name;

    BrowserType(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BrowserType{" +
                "name='" + name + '\'' +
                '}';
    }


}