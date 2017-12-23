# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "56e8daed0e13ebfd668afd17b69723bf"
SRC_URI[sha256sum] = "5ca997eb31381ecd869d6764dd6a1b21f3f9b98c2f1746947ffe8b284eeb1771"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.5.5-0"

inherit catkin
