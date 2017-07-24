# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversion functions between KDL and geometry_msgs types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native geometry-msgs orocos-kdl"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/kdl_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc827de15e382afe0928e4b4a1ef3f60"
SRC_URI[sha256sum] = "5615e6f50ae396f2c886e3bf74e6eb714ed4b2762ed44d4e5c642a0d88db8c7d"
S = "${WORKDIR}/geometry-release-release-lunar-kdl_conversions-1.11.9-0"

inherit catkin
