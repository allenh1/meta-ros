# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "HyQ-robot specific functions for visualization in the  XPP Motion Framework.    "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/kinetic/xpp_hyq/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "471fb75d9e1e7e2ec0b147ad442969a6"
SRC_URI[sha256sum] = "e846a2df54eada44ca72a3f542b8d4d15406e81191d5f67b4331b979f0f8f080"
S = "${WORKDIR}/xpp-release-release-kinetic-xpp_hyq-1.0.3-0"

inherit catkin
