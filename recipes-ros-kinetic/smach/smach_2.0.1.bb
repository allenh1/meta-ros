# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SMACH is a task-level architecture for rapidly creating complex robot     behavi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/executive_${PN}-release/archive/release/kinetic/${PN}/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab3900a2cb47bd92b6b380ac693aa642"
SRC_URI[sha256sum] = "98763352defe3ffd8acb6866467a435578bb2510ca56f67b98e4c66b3d1143fb"
S = "${WORKDIR}/executive_${PN}-release-release-kinetic-${PN}-2.0.1-0"

inherit catkin
