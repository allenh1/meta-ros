# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A common repository for CMake Modules which are not distributed with CMake but a"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin"
SRC_URI = "https://github.com/ros-gbp/cmake_modules-release/archive/release/lunar/cmake_modules/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46c3d211228a539fc082a348d0e5c2da"
SRC_URI[sha256sum] = "d3a0413c27e7f13ec4c6d1b3c863850affa33ccee370b5f07937ae3aef177324"
S = "${WORKDIR}/cmake_modules-release-release-lunar-cmake_modules-0.4.1-0"

inherit catkin
