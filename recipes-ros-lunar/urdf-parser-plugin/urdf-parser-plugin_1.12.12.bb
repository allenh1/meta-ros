# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ base class for URDF parsers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native liburdfdom-headers-dev"
SRC_URI = "https://github.com/ros-gbp/urdf-release/archive/release/lunar/urdf_parser_plugin/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e8db2edffca3e3917ceb1209c15fb10c"
SRC_URI[sha256sum] = "de904c290611539796c1ede9d1aad745d34752bb8bb912127b25c7038cb8820f"
S = "${WORKDIR}/urdf-release-release-lunar-urdf_parser_plugin-1.12.12-0"

inherit catkin
