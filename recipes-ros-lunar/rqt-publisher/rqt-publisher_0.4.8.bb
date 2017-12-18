# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg python-qt-binding qt-gui-py-common roslib rosmsg rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_publisher-release/archive/release/lunar/rqt_publisher/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ad24a290ee61a8973c3fbd891c2e21f"
SRC_URI[sha256sum] = "5480126bf9a7b6265002ea38cb17541679dea830dcb94823ce6dbfb1725a39b8"
S = "${WORKDIR}/rqt_publisher-release-release-lunar-rqt_publisher-0.4.8-0"

inherit catkin
