# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "GPS messages and common routines for use in GPS drivers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-filters message-generation message-runtime nav-msgs roscpp rospy sensor-msgs std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/kinetic/gps_common/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "450219dfd349952396d4175466705896"
SRC_URI[sha256sum] = "3827c093987666c0b823d42b095e3d9e7fbb6622333f14b0a62c9f7a54f0e209"
S = "${WORKDIR}/gps_umd-release-release-kinetic-gps_common-0.2.0-0"

inherit catkin
