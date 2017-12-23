# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "navfn provides a fast interpolated navigation function that can be used to creat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules costmap-2d geometry-msgs message-generation message-runtime nav-core nav-msgs netpbm pcl-conversions pcl-ros pluginlib rosconsole roscpp tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db0164c11817660800afbe440aae138e"
SRC_URI[sha256sum] = "6969f151019893d7f1fcdbb91a0f393bd80d1f33af5013f2639a18c41d7a4a5d"
S = "${WORKDIR}/navigation-release-release-kinetic-${PN}-1.14.2-0"

inherit catkin
