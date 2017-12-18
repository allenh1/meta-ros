# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A bond allows two processes, A and B, to know when the other has     terminated,"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/${PN}_core-release/archive/release/lunar/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a03019ed0d91eb061f4f0ffc8abe4859"
SRC_URI[sha256sum] = "6f153ed168335c6837dcc0c92037ab457f89249ec4e6b93a2e635e70b607caa2"
S = "${WORKDIR}/${PN}_core-release-release-lunar-${PN}-1.8.1-0"

inherit catkin
