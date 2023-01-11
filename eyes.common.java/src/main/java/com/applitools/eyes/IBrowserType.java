package com.applitools.eyes;

/**
 * Browser types available in the Ultrafast grid.
 */
public interface IBrowserType {
    String CHROME = "chrome";
    String CHROME_ONE_VERSION_BACK = "chrome-one-version-back";
    String CHROME_TWO_VERSIONS_BACK = "chomre-two-versions-back";
    String FIREFOX = "firefox";
    String FIREFOX_ONE_VERSION_BACK = "firefox-one-version-back";
    String FIREFOX_TWO_VERSIONS_BACK = "firefox-two-versions-back";
    String SAFARI = "safari";
    String SAFARI_ONE_VERSION_BACK = "safari-one-version-back";
    String SAFARI_TWO_VERSIONS_BACK = "safari-two-versions-back";
    String SAFARI_EARLY_ACCESS = "safari-earlyaccess";
    String IE_10 = "ie10";
    String IE_11 = "ie11";

    /**
     * @deprecated The 'EDGE' option that is being used in your browsers' configuration will soon be deprecated.
     * Please change it to either "EDGE_LEGACY" for the legacy version or to "EDGE_CHROMIUM" for the new
     * Chromium-based version.
     */
    String EDGE = "edge";

    String EDGE_LEGACY = "edgelegacy";
    String EDGE_CHROMIUM = "edgechromium";
    String EDGE_CHROMIUM_ONE_VERSION_BACK = "edgechromium-one-version-back";
    String EDGE_CHROMIUM_TWO_VERSION_BACK = "edgechromium-two-version-back";

    String getName();
}
