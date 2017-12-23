# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "KDL binding for tf2"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen orocos-kdl tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_kdl/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "970dfbd6885dda5fdef3cbcd34ed4f25"
SRC_URI[sha256sum] = "8c71342d13c451eb2d53a9a0c0693ceaba0b31e7a865578b5ed9340761fa733b"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_kdl-0.5.16-0"

inherit catkin
