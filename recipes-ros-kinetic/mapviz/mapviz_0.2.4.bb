# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mapviz"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge glut image-transport libglew-dev libqt5-core libqt5-gui libqt5-opengl libqt5-opengl-dev libqt5-widgets libxi-dev libxmu-dev marti-common-msgs message-generation message-runtime pkgconfig pluginlib rosapi roscpp rqt-gui rqt-gui-cpp std-srvs swri-transform-util swri-yaml-util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/${PN}-release/archive/release/kinetic/${PN}/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc6d7893411aa22b7f8027af6c06a59a"
SRC_URI[sha256sum] = "8a1395658e934ed0958ca6e83e900a417f8bc35405e326fed4eb3a3673ac01f3"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.2.4-0"

inherit catkin
