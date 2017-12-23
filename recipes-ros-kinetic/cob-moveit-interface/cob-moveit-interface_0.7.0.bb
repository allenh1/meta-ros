# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_moveit_interface"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cob-script-server geometry-msgs moveit-commander rospy tf"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_moveit_interface/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f34dac36ab3294d64c38bdbee97ae08"
SRC_URI[sha256sum] = "d6fe6a81f96c66e1baeac193c24acb3feacb4e15071db9e0bc8d50889412155c"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_moveit_interface-0.7.0-0"

inherit catkin
