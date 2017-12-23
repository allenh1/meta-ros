# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cpp_common contains C++ code for doing things that are not necessarily ROS     r"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native console-bridge"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/kinetic/cpp_common/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5f10ad22415cc2508dc988d4776a41a"
SRC_URI[sha256sum] = "e70576903af68cbf76a565d2685428742443627462c5b4df1dec4083a974cb8f"
S = "${WORKDIR}/roscpp_core-release-release-kinetic-cpp_common-0.6.7-0"

inherit catkin
