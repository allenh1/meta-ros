# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Unit-testing package for ROS. This is a lower-level library for rostest and hand"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg roslib"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/kinetic/${PN}/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dfd0c8387859279c78ec6d865d1b1e00"
SRC_URI[sha256sum] = "15702a1e17f0db1e13ed498234d348ce4dc0446a010ba1951306a0e9e9279444"
S = "${WORKDIR}/ros-release-release-kinetic-${PN}-1.13.6-0"

inherit catkin
