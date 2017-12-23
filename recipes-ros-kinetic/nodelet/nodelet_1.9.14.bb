# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nodelet package is designed to provide a way to run multiple     algorithms "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondcpp boost catkin-native cmake-modules message-generation message-runtime pluginlib rosconsole roscpp rospy std-msgs uuid"
SRC_URI = "https://github.com/ros-gbp/${PN}_core-release/archive/release/kinetic/${PN}/1.9.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f47b08672b1a454567e7f3a0e8333e8a"
SRC_URI[sha256sum] = "cc6baa5ffeed8bdb4b9b1be10b0e2dd0ee6759f09e68cb1d6f5d4fb36b7cd66c"
S = "${WORKDIR}/${PN}_core-release-release-kinetic-${PN}-1.9.14-0"

inherit catkin
