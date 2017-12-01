# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS node that simply forwards odometry information."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles catkin-native geometry-msgs message-filters nav-msgs rosconsole roscpp rospy tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/fake_localization/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8d8dd12206431a5c712e4121c8b080e8"
SRC_URI[sha256sum] = "1e21b26cdb58b878dc24172142978269a1e1bb0c0880d109a0159b2ae28bcdec"
S = "${WORKDIR}/navigation-release-release-lunar-fake_localization-1.15.1-0"

inherit catkin
