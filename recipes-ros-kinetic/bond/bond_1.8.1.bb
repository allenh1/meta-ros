# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A bond allows two processes, A and B, to know when the other has     terminated,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/${PN}_core-release/archive/release/kinetic/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d041edea156d9631a7761e2b97e64ce3"
SRC_URI[sha256sum] = "800c926f8e1ca7d4bd515121ce2e7cf4e6723a90ef1a2f40b64083895c572db6"
S = "${WORKDIR}/${PN}_core-release-release-kinetic-${PN}-1.8.1-0"

inherit catkin
