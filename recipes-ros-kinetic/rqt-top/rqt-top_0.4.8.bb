# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RQT plugin for monitoring ROS processes."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-psutil python-qt-binding rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_top-release/archive/release/kinetic/rqt_top/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24f02a6d5237f7319dbe08359ae6e2b1"
SRC_URI[sha256sum] = "dd9c2040422f8f861de936364b1659c9b5e1b69cdfabed0f93afb1c36d39951c"
S = "${WORKDIR}/rqt_top-release-release-kinetic-rqt_top-0.4.8-0"

inherit catkin
