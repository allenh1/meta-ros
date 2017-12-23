# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS node that simply forwards odometry information."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles catkin-native geometry-msgs message-filters nav-msgs rosconsole roscpp rospy tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/fake_localization/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69b2d689d8ff76fcb276590c82faa9e4"
SRC_URI[sha256sum] = "03d6633f9bf6e69a26f672b0e26d5f9d9bd94a9e13a1190a3f9f7b74a1364956"
S = "${WORKDIR}/navigation-release-release-kinetic-fake_localization-1.14.2-0"

inherit catkin
