# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SMACH is a task-level architecture for rapidly creating complex robot     behavi"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/executive_${PN}-release/archive/release/lunar/${PN}/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8376b095997d28cd1e282e50245c687"
SRC_URI[sha256sum] = "e7a93ed3ddff3328d636c30fe1095812535372c08ed9524e7726d749d8b47501"
S = "${WORKDIR}/executive_${PN}-release-release-lunar-${PN}-2.0.1-0"

inherit catkin
