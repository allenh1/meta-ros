# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common plugins for the Mapviz visualization tool"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-transport libqt5-core libqt5-gui libqt5-opengl libqt5-opengl-dev libqt5-widgets mapviz marti-common-msgs marti-nav-msgs marti-visualization-msgs nav-msgs pluginlib roscpp sensor-msgs std-msgs stereo-msgs swri-image-util swri-math-util swri-route-util swri-transform-util swri-yaml-util tf visualization-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/kinetic/mapviz_plugins/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "053a7c594696cf783f0cf37fda618e88"
SRC_URI[sha256sum] = "5209ad6267b6827273610bb40f483388576778cf56d63305e13d0a91f16f486f"
S = "${WORKDIR}/mapviz-release-release-kinetic-mapviz_plugins-0.2.4-0"

inherit catkin
