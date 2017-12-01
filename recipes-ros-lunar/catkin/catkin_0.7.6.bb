# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Low-level build system macros and infrastructure for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake gtest python-argparse python-catkin-pkg-native python-empy-native python-nose"
SRC_URI = "https://github.com/ros-gbp/catkin-release/archive/release/lunar/catkin/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c85ef9c52c88f910cd5f37ca60869512"
SRC_URI[sha256sum] = "772ffc437ec93cc783addfffb8cdaaeabd7eb14a33cc6acf28e8eca511fa4bf5"
S = "${WORKDIR}/catkin-release-release-lunar-catkin-0.7.6-0"

inherit catkin
