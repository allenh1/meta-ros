# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=58d727014cda5ed405b7fb52666a1f97"

DEPENDS = "catkin-native dynamic-reconfigure message-filters nav-msgs rosbag roscpp std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/${PN}/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84f7ecd150a8ac95650bdc2f4d2cf029"
SRC_URI[sha256sum] = "28761b3a4111ccb3c276ac36a4d315e2fc0849fe5b363abe5b321e2320558243"
S = "${WORKDIR}/navigation-release-release-lunar-${PN}-1.15.1-0"

inherit catkin
