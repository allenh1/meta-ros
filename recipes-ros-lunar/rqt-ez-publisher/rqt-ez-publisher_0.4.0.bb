# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_ez_publisher package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-catkin-pkg-native rospy rostest rqt-gui rqt-gui-py rqt-py-common tf tf2-msgs"
SRC_URI = "https://github.com/OTL/rqt_ez_publisher-release/archive/release/lunar/rqt_ez_publisher/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2530d4d746ed277c1d78f2165d0d760d"
SRC_URI[sha256sum] = "b8779c8732e17146c0f49844202e0f1336f06ac42e912991da73fcd27f2c4c72"
S = "${WORKDIR}/rqt_ez_publisher-release-release-lunar-rqt_ez_publisher-0.4.0-0"

inherit catkin
