# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Time and Duration implementations for C++ libraries, including roscpp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cpp-common"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/kinetic/${PN}/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "221cbb0ed41f29055ba33a77a38cb2e5"
SRC_URI[sha256sum] = "41ba058b54d4cc0d7e5ba28b944c417adf56e108a7ad08b11d83fba1e75aeb27"
S = "${WORKDIR}/roscpp_core-release-release-kinetic-${PN}-0.6.7-0"

inherit catkin
