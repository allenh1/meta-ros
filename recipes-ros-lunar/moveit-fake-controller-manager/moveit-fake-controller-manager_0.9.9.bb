# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-core moveit-ros-planning pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_fake_controller_manager/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b107181558ed33f687aa339896583ffb"
SRC_URI[sha256sum] = "4c85f176a49e45f7e3afd1656a2960ae11e5e8a917782fd585aa80c7d9522583"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_fake_controller_manager-0.9.9-0"

inherit catkin
