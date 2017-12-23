# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A common repository for CMake Modules which are not distributed with CMake but a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/cmake_modules-release/archive/release/kinetic/cmake_modules/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e1ebc7a43d2e46246b53b5e49626fbab"
SRC_URI[sha256sum] = "1604db9807d1df623c75bf653ef135eb8c2f1f5343e74dea13f02eaf2a69fc25"
S = "${WORKDIR}/cmake_modules-release-release-kinetic-cmake_modules-0.4.1-0"

inherit catkin
