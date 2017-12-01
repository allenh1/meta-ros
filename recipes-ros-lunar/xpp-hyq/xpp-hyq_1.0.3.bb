# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "HyQ-robot specific functions for visualization in the  XPP Motion Framework.    "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp_hyq/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6fd6ebff18abd5851e21eda93f508184"
SRC_URI[sha256sum] = "152c5d6c9f8d166976610c4a53dd2ad9773e52969f873547039301e4da017436"
S = "${WORKDIR}/xpp-release-release-lunar-xpp_hyq-1.0.3-0"

inherit catkin
