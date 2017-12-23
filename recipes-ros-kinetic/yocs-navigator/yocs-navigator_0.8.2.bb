# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Navigation module for robots"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native move-base-msgs nav-msgs roscpp rospy tf yocs-math-toolkit yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_navigator/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9642b3e7fbf117130382287ec8b597c8"
SRC_URI[sha256sum] = "e3c66d8660e994e80ffab16538af3a9edffe2dc92c27b2510417a74e5537e208"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_navigator-0.8.2-0"

inherit catkin
