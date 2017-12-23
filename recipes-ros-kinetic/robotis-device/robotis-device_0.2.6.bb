# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package that manages device information of ROBOTIS robots.     This package "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamixel-sdk roscpp rospy"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Framework-release/archive/release/kinetic/robotis_device/0.2.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f23ac164b0b1c41125cf4a571588978"
SRC_URI[sha256sum] = "d79475064224cf4aeb761cbc94a6f2e50ddd9a0078cfed7850d193576b2bb694"
S = "${WORKDIR}/ROBOTIS-Framework-release-release-kinetic-robotis_device-0.2.6-0"

inherit catkin
