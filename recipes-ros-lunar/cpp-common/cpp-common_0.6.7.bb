# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cpp_common contains C++ code for doing things that are not necessarily ROS     r"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native console-bridge"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/cpp_common/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3a408368c94448064dc127a972188d9"
SRC_URI[sha256sum] = "32f8141cc8f76afae1630dc2dbc3f5e2946d987f44896824107e87b6231b70f9"
S = "${WORKDIR}/roscpp_core-release-release-lunar-cpp_common-0.6.7-0"

inherit catkin
