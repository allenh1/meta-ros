# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake lint commands for ROS packages.      The lint commands perform static chec"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.11.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "11930f6717efa8ed316a7888b5e1c988"
SRC_URI[sha256sum] = "de174fd9c5ec937449186944e91cbf9f4668f0829e52dce68ed1b157e3a0ca8b"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.11.1-0"

inherit catkin
