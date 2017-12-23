# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Low-level build system macros and infrastructure for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake gtest python-argparse python-catkin-pkg-native python-empy-native python-nose"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.7.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb6d8551aa308c764dfec5474cd08d55"
SRC_URI[sha256sum] = "4b2b3b1697689bcdc1ddc5aab99a93bef8abed989aa3a48623ad357d38fdc3c9"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.7.8-0"

inherit catkin
