# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ libraries to convert between ROS and MRPT classes and messages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs libpcl-all-dev message-generation message-runtime mrpt mrpt-msgs nav-msgs pcl-conversions roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_bridge/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "846953d3fa02bf1066df2a405d5f225d"
SRC_URI[sha256sum] = "646584eb44dcdc7561ce18be53087eabb86e4d5b4f20d40da6f7f6306ec44b56"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_bridge-0.1.18-0"

inherit catkin
