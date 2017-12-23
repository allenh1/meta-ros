# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The kobuki_rviz_launchers package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rviz"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_desktop-release/archive/release/kinetic/kobuki_rviz_launchers/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96cfd0dfd2676c65a80769e464ac6055"
SRC_URI[sha256sum] = "e49160d5d3ec08abf5e2be892c8df4554176223eaa5ea1c0d1210c916b60a248"
S = "${WORKDIR}/kobuki_desktop-release-release-kinetic-kobuki_rviz_launchers-0.5.7-0"

inherit catkin
