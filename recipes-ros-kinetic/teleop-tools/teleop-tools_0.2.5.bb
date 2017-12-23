# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of generic teleoperation tools for any robot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joy-teleop key-teleop teleop-tools-msgs"
SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/kinetic/teleop_tools/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1737f3b1c2159911d66a6166b7fc894a"
SRC_URI[sha256sum] = "f7e785c84a5f93c8033c4145e7961fa20f892f0c0ad94c5d450f78b7721d52c6"
S = "${WORKDIR}/teleop_tools-release-release-kinetic-teleop_tools-0.2.5-0"

inherit catkin
