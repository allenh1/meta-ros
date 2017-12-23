# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native tf2 tf2-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_tools/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd5557da5e195a1809b503ab1d26218d"
SRC_URI[sha256sum] = "55e80cec29ba7aa544e6f80d3e7577ac0f6b7a6b6c95f7c8e577d5fff5d1830e"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_tools-0.5.16-0"

inherit catkin
