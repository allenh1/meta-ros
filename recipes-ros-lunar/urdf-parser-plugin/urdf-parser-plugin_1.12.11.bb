# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ base class for URDF parsers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin liburdfdom-headers-dev"
SRC_URI = "https://github.com/ros-gbp/robot_model-release/archive/release/lunar/urdf_parser_plugin/1.12.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9277c581f5136366c1302186a15f5c9d"
SRC_URI[sha256sum] = "2011e80de9e6c4e5567b726604e4cf274f184d2061bfc8e386c8ee0e70746a50"
S = "${WORKDIR}/robot_model-release-release-lunar-urdf_parser_plugin-1.12.11-0"

inherit catkin
