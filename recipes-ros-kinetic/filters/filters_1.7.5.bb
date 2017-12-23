# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides a standardized interface for processing data as a sequence"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pluginlib rosconsole roscpp roslib rostest"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7dceeb4c48802de3534b8f4214fec62"
SRC_URI[sha256sum] = "e71a4de4b78ed4f14b4ef07a599f1b82c2e71e429ec41fdf4e2e36d160c7e5e2"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.7.5-0"

inherit catkin
