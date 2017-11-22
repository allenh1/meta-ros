# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/lunar/pluginlib_tutorials/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "77038c5f97a44402bb4f5938e54ad4da"
SRC_URI[sha256sum] = "202db474a1cef5a9e9f2c71592659ad47b29ed38ee4a6cceb0de681df9c64744"
S = "${WORKDIR}/common_tutorials-release-release-lunar-pluginlib_tutorials-0.1.10-0"

inherit catkin
