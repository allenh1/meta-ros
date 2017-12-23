# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/kinetic/pluginlib_tutorials/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6791e0d276169ec1f74b71d1e649fc26"
SRC_URI[sha256sum] = "4b968e1a43bc77ad1dc9de30f540f594ad015e46badb49cc66782d9d457c4891"
S = "${WORKDIR}/common_tutorials-release-release-kinetic-pluginlib_tutorials-0.1.10-0"

inherit catkin
