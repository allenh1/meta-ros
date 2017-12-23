# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-gui-py-common roslib rosmsg rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_publisher-release/archive/release/kinetic/rqt_publisher/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4132beb61d30b8b1d00228e9b9ca05a7"
SRC_URI[sha256sum] = "3d8ea88fda2a8289e97aed69e0d98e0ac9d96c92f6b16ddf77c0b38a3902b33f"
S = "${WORKDIR}/rqt_publisher-release-release-kinetic-rqt_publisher-0.4.8-0"

inherit catkin
