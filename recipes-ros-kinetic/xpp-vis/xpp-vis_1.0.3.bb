# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Visualization for the XPP Motion Framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kdl-parser robot-state-publisher roscpp tf visualization-msgs xpp-msgs xpp-states"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/kinetic/xpp_vis/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b98c00e953ed293663e53cd2141ae3c"
SRC_URI[sha256sum] = "649d50962a569e3b38efaa62901fef1a714a8761d79491bc20d41ffbf6780e93"
S = "${WORKDIR}/xpp-release-release-kinetic-xpp_vis-1.0.3-0"

inherit catkin
